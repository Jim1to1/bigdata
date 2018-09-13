package com.bigdata.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.beans.HostInf;
import com.bigdata.beans.User;
import com.bigdata.service.HostInfService;
import com.bigdata.tools.JsonNode;

import net.sf.json.JSONObject;

@Controller
public class HostInfController {
	
	@Autowired
	private HostInfService hostInfService;
	
	@RequestMapping(value="/getHostInf")
	public String getHostInf(HttpSession session, Map<String, Object> map) {
		User user = (User) session.getAttribute("user");
		if(user != null) {
			// 获取 PC1 内容
			HostInf hostInf = new HostInf();
			hostInf.setDevIP((String)session.getAttribute("loginIP"));
			hostInf.setIndicator("PC1");
			
			List<HostInf> hostInfList = hostInfService.getHostInfByEntityForList(hostInf);
			
			JSONObject jsonObject = JSONObject.fromObject(hostInfList.get(hostInfList.size() - 1).getMsg());
			JsonNode jsonNode = (JsonNode) JSONObject.toBean(jsonObject, JsonNode.class);
			
			// 将主机信息转发至前台
			map.put("hostInf", jsonNode);
			
			// 获取 PC2 内容
			hostInf.setIndicator("PC2");
			
			return "hostInfPage";
		}
		
		return "redirect:/login.jsp";
	}
	
}
