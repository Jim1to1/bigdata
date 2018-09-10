package com.bigdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bigdata.service.TaskManagementService;

@Controller
public class TaskManagementController {

	@Autowired
	private TaskManagementService taskManagementService;
	
}
