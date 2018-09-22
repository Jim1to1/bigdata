package com.bigdata.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bigdata.beans.TaskManagement;
import com.bigdata.service.TaskManagementService;

@Controller
public class TaskManagementController {

	@Autowired
	private TaskManagementService taskManagementService;
	
	@ResponseBody
	@RequestMapping(value="/getTaskManagementMsg")
	public List<TaskManagement> getTaskManagementMsg(HttpServletResponse response) {
		
		TaskManagement taskManagement = new TaskManagement();
		taskManagement.setTmstatus(1);
		
		response.addHeader("Content-Type", "application/json;charset=UTF-8");
		List<TaskManagement> resultList = taskManagementService.getTaskManagementMsgByEntity(taskManagement);
		// System.out.println(resultList.size());
		
		return resultList;
		
	}
	
}
