package com.bigdata.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bigdata.beans.HostInf;
import com.bigdata.beans.User;
import com.bigdata.service.HostInfService;
import com.bigdata.tools.JsonNode;
import com.bigdata.tools.SubNode;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Controller
public class HostInfController {
	
	@Autowired
	private HostInfService hostInfService;
	
	
	/**
	 * 由后台插件向数据库添加 HostInf 信息
	 * @param request
	 * @return
	 */
	@RequestMapping("/getHostInfMsg")
	public String getHostInfMsg(HttpServletRequest request) {
		
		String jsonStr = request.getParameter("jsonStr");
		
		Gson gson = new Gson();
		JsonNode jsonNode = gson.fromJson(jsonStr, JsonNode.class);
		
		HostInf hostInf = new HostInf();
		hostInf.setDevIP(jsonNode.getParam1());
		hostInf.setMacAddress(jsonNode.getParam2());
		hostInf.setIndicator(jsonNode.getParam3());
		hostInf.setDevType(jsonNode.getParam4());
		
		String paramList1 = gson.toJson(jsonNode.getParamList1(), new TypeToken<ArrayList<SubNode>>(){}.getType());
		
		hostInf.setMsg(paramList1);
		
		hostInfService.addHostInf(hostInf);
		
		return "success";
	}
	
	@RequestMapping(value="/getHostInf")
	public String getHostInf(HttpSession session, Map<String, Object> map) {
		User user = (User) session.getAttribute("user");
		Gson gson = new Gson();
		if(user != null) {
			// 获取 PC1 内容
			HostInf hostInf = new HostInf();
			hostInf.setDevIP((String)session.getAttribute("loginIP"));
			hostInf.setIndicator("PC1");
			
			List<HostInf> hostInfList = hostInfService.getHostInfByEntityForList(hostInf);
			if(hostInfList.size() > 0 && hostInfList != null) {
				List<JsonNode> jsonList = gson.fromJson(hostInfList.get(hostInfList.size() - 1).getMsg(), 
						new TypeToken<ArrayList<JsonNode>>(){}.getType());
				
				// 将主机信息 PC1 转发至前台
				map.put("hostInf", jsonList.get(jsonList.size() - 1));
				
				//System.out.println("complete PC1...");
			}
			
			
			// 获取 PC2 内容
			hostInf.setIndicator("PC2");
			hostInfList = hostInfService.getHostInfByEntityForList(hostInf);
			
			if(hostInfList.size() > 0 && hostInfList != null) {
				List<JsonNode> jsonList = gson.fromJson(hostInfList.get(hostInfList.size() - 1).getMsg(), 
						new TypeToken<ArrayList<JsonNode>>(){}.getType());
				
				// 将主机信息 PC2 转发至前台
				map.put("pc2List", jsonList);
				
				//System.out.println("complete PC2...");
			}
			
			
			// 获取 PC3 内容
			hostInf.setIndicator("PC3");
			hostInfList = hostInfService.getHostInfByEntityForList(hostInf);
			if(hostInfList.size() > 0 && hostInfList != null) {
				List<JsonNode> jsonList = gson.fromJson(hostInfList.get(hostInfList.size() - 1).getMsg(), 
						new TypeToken<ArrayList<JsonNode>>(){}.getType());
				
				// 将主机信息 PC3 转发至前台
				map.put("pc3List", jsonList);
				
			}
			
			return "hostInfPage";
		}
		
		return "redirect:/login.jsp";
	}
	
	@RequestMapping(value="/getDeviceStatus")
	public String getDeviceStatus(HttpSession session, Map<String, Object> map) {
		// PC4 - PC8
		User user = (User) session.getAttribute("user");
		Gson gson = new Gson();
		if(user != null) {
			HostInf hostInf = new HostInf();
			hostInf.setDevIP((String)session.getAttribute("loginIP"));
			hostInf.setIndicator("PC4");
			
			// 获取 PC4 内容 
			HostInf pc4Inf = hostInfService.getLastHostInfByEntity(hostInf);
			if(pc4Inf != null) {
				List<JsonNode> jsonList = gson.fromJson(pc4Inf.getMsg(), new TypeToken<ArrayList<JsonNode>>(){}.getType());
				
				map.put("pc4", jsonList.get(0));
			}
			
			
			// 获取 PC5 内容
			hostInf.setIndicator("PC5");
			HostInf pc5Inf = hostInfService.getLastHostInfByEntity(hostInf);
			if(pc5Inf != null) {
				List<JsonNode> jsonList = gson.fromJson(pc5Inf.getMsg(), new TypeToken<ArrayList<JsonNode>>(){}.getType());
				
				map.put("pc5Inf", jsonList);
			}
			
			
			// 获取 PC6 内容
			hostInf.setIndicator("PC6");
			HostInf pc6Inf = hostInfService.getLastHostInfByEntity(hostInf);
			if(pc6Inf != null) {
				List<JsonNode> jsonList = gson.fromJson(pc6Inf.getMsg(), new TypeToken<ArrayList<JsonNode>>(){}.getType());
				
				map.put("pc6List", jsonList);
			}
			
			
			// 获取 PC7 内容
			hostInf.setIndicator("PC7");
			HostInf pc7Inf = hostInfService.getLastHostInfByEntity(hostInf);
			if(pc7Inf != null) {
				List<JsonNode> jsonList = gson.fromJson(pc7Inf.getMsg(), new TypeToken<ArrayList<JsonNode>>(){}.getType());
				
				map.put("pc7List", jsonList);
			}
			
			
			// 获取 PC8 内容
			hostInf.setIndicator("PC8");
			HostInf pc8Inf = hostInfService.getLastHostInfByEntity(hostInf);
			if(pc8Inf != null) {
				List<JsonNode> jsonList = gson.fromJson(pc8Inf.getMsg(), new TypeToken<ArrayList<JsonNode>>(){}.getType());
				
				map.put("pc8List", jsonList);
			}
			
			return "deviceStatusPage";
		}
		
		return "redirect:/login.jsp";
		
	}
	
	@RequestMapping("/getDeviceNetworkInf")
	public String getDeviceNetworkInf(HttpSession session, Map<String, Object> map) {
		// PC9 - PC11
		User user = (User) session.getAttribute("user");
		Gson gson = new Gson();
		
		if(user != null) {
			HostInf hostInf = new HostInf();
			hostInf.setDevIP((String)session.getAttribute("loginIP"));
			hostInf.setIndicator("PC9");
			
			// 获取 PC9 内容 
			HostInf pc9Inf = hostInfService.getLastHostInfByEntity(hostInf);
			if(pc9Inf != null) {
				List<JsonNode> jsonList = gson.fromJson(pc9Inf.getMsg(), new TypeToken<ArrayList<JsonNode>>(){}.getType());
				
				List<String> resultList = Arrays.asList(jsonList.get(0).getParam1().split(","));
				map.put("pc9List", resultList);
			}
			
			
			// 获取 PC10 内容
			hostInf.setIndicator("PC10");
			HostInf pc10Inf = hostInfService.getLastHostInfByEntity(hostInf);
			if(pc10Inf != null) {
				List<JsonNode> jsonList = gson.fromJson(pc10Inf.getMsg(), new TypeToken<ArrayList<JsonNode>>(){}.getType());
				
				map.put("pc10List", jsonList);
			}
			
			
			// 获取 PC11 内容
			hostInf.setIndicator("PC11");
			HostInf pc11Inf = hostInfService.getLastHostInfByEntity(hostInf);
			if(pc11Inf != null) {
				List<JsonNode> jsonList = gson.fromJson(pc11Inf.getMsg(), new TypeToken<ArrayList<JsonNode>>(){}.getType());
				
				map.put("pc11List", jsonList);
			}
			
			return "deviceNetworkInf";
		}
		
		return "redirect:/login.jsp";
	}
	
	
	@RequestMapping("/getSecurityLogPage")
	public String getSecurityLogPage(HttpSession session, Map<String, Object> map) {
		User user = (User) session.getAttribute("user");
		Gson gson = new Gson();
		List<JsonNode> jsonList = new ArrayList<>();
		List<JsonNode> resultList = new ArrayList<>();
		
		if(user != null) {
			HostInf hostInf = new HostInf();
			hostInf.setDevIP((String)session.getAttribute("loginIP"));
			
			// 获取 PC12 内容
			hostInf.setIndicator("PC12");
			List<HostInf> pc12List = hostInfService.getHostInfByEntityForList(hostInf);
			Collections.reverse(pc12List);
			
			if(pc12List.size() > 0) {
				
				for(int i=0; i<pc12List.size(); i++) {
					jsonList = gson.fromJson(pc12List.get(i).getMsg(), new TypeToken<ArrayList<JsonNode>>(){}.getType());
					
					resultList.add(jsonList.get(0));
				}
				
				map.put("pc12List", resultList);
				map.put("pc2ListSize", resultList.size());
				
			}
			return "securityLogPage";
		}
		
		return "redirect:/login.jsp";
	}
	
	@RequestMapping("/maliciousCodeDetection")
	public String maliciousCodeDetection(HttpSession session, Map<String, Object> map) {
		User user = (User) session.getAttribute("user");
		Gson gson = new Gson();
		List<JsonNode> jsonList = new ArrayList<>();
		List<JsonNode> resultList = new ArrayList<>();
		
		if(user != null) {
			HostInf hostInf = new HostInf();
			hostInf.setDevIP((String)session.getAttribute("loginIP"));
			
			// 获取 PC13 内容
			hostInf.setIndicator("PC13");
			List<HostInf> pc13List = hostInfService.getHostInfByEntityForList(hostInf);
//			System.out.println(pc13List.get(0));
			
			if(pc13List.size() > 0) {
				for(int i=0; i<pc13List.size(); i++) {
					jsonList = gson.fromJson(pc13List.get(i).getMsg(), new TypeToken<ArrayList<JsonNode>>(){}.getType());
					
					resultList.add(jsonList.get(0));
				}
				
				map.put("pc13List", resultList);
			}
			return "maliciousCodeDetection";
		}
		
		return "redirect:/login.jsp";
	}
	
}
