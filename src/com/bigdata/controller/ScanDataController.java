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
import org.springframework.web.bind.annotation.RequestParam;

import com.bigdata.beans.ScanData;
import com.bigdata.beans.TaskManagement;
import com.bigdata.beans.User;
import com.bigdata.service.ScanDataService;
import com.bigdata.service.TaskManagementService;
import com.bigdata.tools.JsonNode;
import com.google.gson.Gson;

@Controller
public class ScanDataController {

	@Autowired
	private ScanDataService scanDataService;

	@Autowired
	private TaskManagementService taskManagementService;

	
	@RequestMapping(value = "/addScanDataMsg", method = RequestMethod.POST)
	public String addScanDataMsg(HttpServletRequest request) {

		String jsonStr = request.getParameter("jsonStr");

		Gson gson = new Gson();
		ScanData scanData = gson.fromJson(jsonStr, ScanData.class);
		Integer taskId = 0;

		// System.out.println(scanData);

		TaskManagement taskManagement = new TaskManagement();
		taskManagement.setTaskId(scanData.getTaskId());

		scanData.setTaskManagement(taskManagement);

		// System.out.println(scanData);
		if (scanData.getScanType() == 3) {
			taskId = scanData.getTaskId();
			TaskManagement temtaskowner = taskManagementService.getTaskManagementMapperById(taskId);
			temtaskowner.setTmstatus(2);
			taskManagementService.updateTaskManagement(temtaskowner);
		} else {
			scanDataService.insertScanData(scanData);
		}
		return "success";
	}

	@RequestMapping("/taskDetails")
	public String taskDetails(HttpSession session, Map<String, Object> map,
			@RequestParam(value = "taskId", required = false) Integer taskId) {
		System.out.println("taskId: " + taskId);
		
		Gson gson = new Gson();
		JsonNode jsonNode = null;
		List<JsonNode> jsonList = null;
		
		User user = (User) session.getAttribute("user");
		if (user == null) {
			return "redirect:/login.jsp";
		}
		
		TaskManagement taskManagement = taskManagementService.getTaskManagementMapperById(taskId);
		if(taskManagement != null) {
			map.put("devIP", taskManagement.getDevIP());
		}
		
		// 
		ScanData scanData = new ScanData();
		scanData.setTaskManagement(taskManagement);
		List<ScanData> scanDataList = new ArrayList<>();

		// 获取 scantype1内容
		scanData.setScanType(1);
		scanDataList = scanDataService.getScanDataByEntityForList(scanData);
		if (scanDataList.size() > 0) {
			
			jsonList = new ArrayList<>();
			
			for(int i=0; i<scanDataList.size(); i++) {
				jsonNode = gson.fromJson(scanDataList.get(i).getVulnerInfo(), JsonNode.class);
//				System.out.println("jsonNode: " + jsonNode);
				jsonList.add(jsonNode);
			}

			map.put("portList", jsonList);
		}

		// 获取 scantype2内容
		scanData.setScanType(2);
		scanDataList = scanDataService.getScanDataByEntityForList(scanData);
		if (scanDataList.size() > 0) {
			
			jsonList = new ArrayList<>();
			for(int i=0; i<scanDataList.size(); i++) {
				jsonNode = gson.fromJson(scanDataList.get(i).getVulnerInfo(), JsonNode.class);
				jsonList.add(jsonNode);
			}

			map.put("vulnerabilityList", jsonList);
		}

		// 获取 scantype4内容
		scanData.setScanType(4);
		scanDataList = scanDataService.getScanDataByEntityForList(scanData);
		//System.out.println("scanDataList: " + scanDataList);
		if (scanDataList.size() > 0) {
			
			jsonNode = gson.fromJson(scanDataList.get(scanDataList.size() - 1).getVulnerInfo(), JsonNode.class);
			map.put("operationDetail", jsonNode.getParam1());
		} 
		else {
			map.put("operationDetail", "未知");
		}

		return "taskDetailsPage";
	}
	
}
