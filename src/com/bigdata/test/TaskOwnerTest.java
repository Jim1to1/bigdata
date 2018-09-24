package com.bigdata.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bigdata.beans.TaskOwner;
import com.bigdata.service.TaskOwnerService;

public class TaskOwnerTest {
	
	@Autowired
	private TaskOwnerService taskOwnerService;
	private ApplicationContext applicationContext = null;
	
	@Before
	public void before() {
		applicationContext  = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		taskOwnerService = (TaskOwnerService) applicationContext.getBean("taskOwnerService");
		//System.out.println(taskOwnerService);
	}

	@Test
	public void testGetTaskOwnerById() {
		TaskOwner taskOwner = taskOwnerService.getTaskOwnerById(1);
		System.out.println(taskOwner);
	}
	
	@Test
	public void testAddTaskOwner() {
		TaskOwner taskOwner = new TaskOwner();
		taskOwner.setMacAddress("78:81:s1:09:08:24");
		taskOwner.setConfigversion("1");
		
		System.out.println(taskOwnerService.insertTaskOwner(taskOwner));
	}
	
	@Test
	public void testGetAllTaskOwner() {
		List<TaskOwner> taskOwnerList = taskOwnerService.getAllTaskOwner();
		System.out.println(taskOwnerList);
	}
	
	@Test
	public void testGetTaskOwnerByEntityForLike() {
		TaskOwner taskOwner = new TaskOwner();
		//taskOwner.setTaskOwnerId(1);
		taskOwner.setConfigversion("1");
		System.out.println(taskOwner);
		
		List<TaskOwner> taskOwnerList = taskOwnerService.getTaskOwnerByEntityForLike(taskOwner);
		System.out.println(taskOwnerList.size());
	}
	
}
