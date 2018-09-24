package com.bigdata.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bigdata.beans.TaskManagement;
import com.bigdata.beans.TaskOwner;
import com.bigdata.beans.User;
import com.bigdata.service.TaskManagementService;

@Controller
public class TaskManagementController {

	@Autowired
	private TaskManagementService taskManagementService;

	@ResponseBody
	@RequestMapping(value = "/getTaskManagementMsg")
	public List<TaskManagement> getTaskManagementMsg(HttpServletResponse response) {

		TaskManagement taskManagement = new TaskManagement();
		taskManagement.setTmstatus(1);

		response.addHeader("Content-Type", "application/json;charset=UTF-8");
		List<TaskManagement> resultList = taskManagementService.getTaskManagementMsgByEntity(taskManagement);
		// System.out.println(resultList.size());

		return resultList;
	}

	@RequestMapping(value = "/redrictTaskManagementPage")
	public String redrictTaskManagementPage(HttpSession session, Map<String, Object> map) {

		User user = (User) session.getAttribute("user");
		if (user == null) {
			return "redirect:/login.jsp";
		}

		List<TaskManagement> taskManagementList = taskManagementService.getAllTaskManagement();
		map.put("taskManagementList", taskManagementList);

		return "taskManagementPage";
	}

	@RequestMapping(value = "/addTaskManagement")
	public String addTaskManagement(HttpSession session, Map<String, Object> map,
			@RequestParam(value = "tmdescribe", required = false) String tmdescribe,
			@RequestParam(value = "devIP", required = false) String devIP) {

		User user = (User) session.getAttribute("user");
		if (user == null) {
			return "redirect:/login.jsp";
		}

		// 添加 taskManagement
		TaskManagement taskManagement = new TaskManagement();
		taskManagement.setTmdescribe(tmdescribe);
		taskManagement.setDevIP(devIP);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String addTime = sdf.format(date);
		taskManagement.setAddTime(addTime);
		taskManagement.setTmstatus(0);
		
		TaskOwner taskOwner = new TaskOwner();
		taskOwner.setTaskOwnerId(user.getUserId());
		
		taskManagement.setTaskOwner(taskOwner);
		taskManagementService.addTaskManagement(taskManagement);

		map.clear();
		List<TaskManagement> taskManagementList = taskManagementService.getAllTaskManagement();
		map.put("taskManagementList", taskManagementList);

		return "taskManagementPage";
	}

	@RequestMapping(value = "/deleteTaskManagementById")
	public String deleteTaskManagementById(HttpSession session, Map<String, Object> map,
			@RequestParam(value = "taskSelect", required = false) Integer[] taskIds) {

		User user = (User) session.getAttribute("user");
		if (user == null) {
			return "redirect:/login.jsp";
		}
		
		for(int i = 0; i < taskIds.length; i++) {
			taskManagementService.deleteTaskManagement(taskIds[i]);
		}
		
//		for(int i = 0; i < taskIds.length; i++) {
//			System.out.println(taskIds[i]);
//		}
		
		map.clear();
		List<TaskManagement> taskManagementList = taskManagementService.getAllTaskManagement();
		map.put("taskManagementList", taskManagementList);
		
		return "taskManagementPage";
	}
	
	@ResponseBody
	@RequestMapping("/getTaskStatus")
	public List<TaskManagement> getTaskStatus() {
		List<TaskManagement> taskManagementList = taskManagementService.getAllTaskManagementNoJoin();
		
		//System.out.println(taskManagementList);
		
		return taskManagementList;
	}
	
	@RequestMapping("/taskStart")
	public String taskStart(HttpSession session, Map<String, Object> map,
			@RequestParam(value = "taskId", required = false) Integer taskId) {
		
		User user = (User) session.getAttribute("user");
		if (user == null) {
			return "redirect:/login.jsp";
		}
		
		// 将 taskManagement 指定 taskId 的数据库表信息更新为
		TaskManagement management = taskManagementService.getTaskManagementMapperById(taskId);
		// System.out.println("management: " + management);
		management.setTmstatus(1);
		taskManagementService.updateTaskManagement(management);
		
		map.clear();
		List<TaskManagement> taskManagementList = taskManagementService.getAllTaskManagement();
		map.put("taskManagementList", taskManagementList);
		
		return "taskManagementPage";
	}
	
}
