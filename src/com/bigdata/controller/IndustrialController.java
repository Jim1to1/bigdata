package com.bigdata.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bigdata.beans.IndustrialProtocol;
import com.bigdata.service.IndustrialProtocolService;
import com.bigdata.tools.Sort;
import com.google.gson.Gson;

@Controller
public class IndustrialController {

	@Autowired
	private IndustrialProtocolService industrialProtocolService;

	@RequestMapping(value = "/addIndustrialProtocolMsg", method = RequestMethod.POST)
	public String addIndustrialProtocolMsg(HttpServletRequest request) {

		String jsonStr = request.getParameter("jsonStr");
		Gson gson = new Gson();
		IndustrialProtocol industrialProtocol = gson.fromJson(jsonStr, IndustrialProtocol.class);
		System.out.println("industrialProtocol: " + industrialProtocol);

		System.out.println("insertId: " + industrialProtocolService.addIndustrialProtocol(industrialProtocol));

		return "success";
	}

	@RequestMapping(value = "/getAllIndustrialProtocol")
	public String getAllIndustrialProtocol(HttpSession session, Map<String, Object> map) {
		List<IndustrialProtocol> industrialProtocolList = industrialProtocolService.getAllIndustrialProtocol();
		map.put("allIndustrialProtocol", industrialProtocolList);
		
		List<String> protocolNameList = new ArrayList<>();
		List<String> destIpList = new ArrayList<>();
		List<String> srcIpList = new ArrayList<>();
		for (int i = 0; i < industrialProtocolList.size(); i++) {
			protocolNameList.add(industrialProtocolList.get(i).getProtocolName());
			destIpList.add(industrialProtocolList.get(i).getDestIp());
			srcIpList.add(industrialProtocolList.get(i).getSrcIp());
		}
		
		Sort sort = new Sort();
		List<String> topProtocolNameList = sort.timesSort(protocolNameList);
		map.put("protocolNameInDes", topProtocolNameList);
		
		List<String> topDestIpList = sort.timesSort(destIpList);
		map.put("destIpInDes", topDestIpList);
		
		List<String> topSrcIpList = sort.timesSort(srcIpList);
		map.put("srcIpInDes", topSrcIpList);

		return "networkProtocolPage";
	}

}
