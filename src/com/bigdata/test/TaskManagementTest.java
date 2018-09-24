package com.bigdata.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bigdata.beans.TaskManagement;
import com.bigdata.beans.TaskOwner;
import com.bigdata.service.TaskManagementService;

public class TaskManagementTest {
	
	@Autowired
	private TaskManagementService taskManagementService;
	private ApplicationContext applicationContext = null;
	
	@Before
	public void before() {
		applicationContext  = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		taskManagementService = (TaskManagementService) applicationContext.getBean("taskManagementService");
		//System.out.println(taskOwnerService);
	}

	@Test
	public void testGetTaskManagementMapperById() {
		TaskManagement taskManagement = taskManagementService.getTaskManagementMapperById(1);
		System.out.println(taskManagement);
	}
	
	@Test
	public void testAddTaskManagement() {
		TaskOwner taskOwner = new TaskOwner();
		taskOwner.setTaskOwnerId(1);
		
		TaskManagement taskManagement = new TaskManagement();
		taskManagement.setDevIP("192.168.1.116");
		taskManagement.setTmstatus(0);
		taskManagement.setTmdescribe("扫描6");
		taskManagement.setAddTime("2018-09-11 19:19:49");
		taskManagement.setTaskOwner(taskOwner);
		
		System.out.println(taskManagementService.insetTaskManagement(taskManagement));
	}
	
	@Test
	public void getTaskManagementByEntityForLike() {
		TaskOwner taskOwner = new TaskOwner();
		taskOwner.setTaskOwnerId(1);
		
		TaskManagement taskManagement = new TaskManagement();
		//taskManagement.setDevIP("192.168.1.116");
		taskManagement.setTaskOwner(taskOwner);
		
		List<TaskManagement> tmList = taskManagementService.getTaskManagementByEntityForLike(taskManagement);
		System.out.println(tmList.size());
	}
	
	@Test
	public void testUpdateTaskManagement() {
		TaskManagement taskManagement = new TaskManagement();
		taskManagement.setTaskId(5);
		taskManagement.setDevIP("192.168.1.117");
		
		taskManagementService.updateTaskManagement(taskManagement);
		
		//System.out.println(taskManagementService.getTaskManagementMapperById(5));
	}
	
}

