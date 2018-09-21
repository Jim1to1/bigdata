package com.bigdata.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bigdata.beans.ScanData;
import com.bigdata.beans.TaskManagement;
import com.bigdata.service.ScanDataService;
import com.google.gson.Gson;

@Controller
public class ScanDataController {

	@Autowired
	private ScanDataService scanDataService;
	
	@RequestMapping(value="/addScanDataMsg", method=RequestMethod.POST)
	public String addScanDataMsg(HttpServletRequest request) {
		
		String jsonStr = request.getParameter("jsonStr");
		
		Gson gson = new Gson();
		ScanData scanData = gson.fromJson(jsonStr, ScanData.class);
		
//		System.out.println(scanData);
		
		TaskManagement taskManagement = new TaskManagement();
		taskManagement.setTaskId(scanData.getTaskId());
		
		scanData.setTaskManagement(taskManagement);
		
		scanDataService.insertScanData(scanData);
		
		return "success";
	}
	
}
