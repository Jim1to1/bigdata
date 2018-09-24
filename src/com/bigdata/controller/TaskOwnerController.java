package com.bigdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bigdata.service.TaskOwnerService;

@Controller
public class TaskOwnerController {

	@Autowired
	private TaskOwnerService taskOwnerService;
	
}
