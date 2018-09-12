package com.bigdata.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bigdata.beans.ScanData;
import com.bigdata.beans.TaskManagement;
import com.bigdata.service.ScanDataService;

public class ScanDataTest {
	
	@Autowired
	private ScanDataService scanDataService;
	private ApplicationContext applicationContext;
	
	@Before
	public void before() {
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		scanDataService = (ScanDataService) applicationContext.getBean("scanDataService");
	}

	@Test
	public void testGetScanDataById() {
		ScanData scanData = scanDataService.getScanDataById(3);
		System.out.println(scanData);
	}
	
	@Test
	public void testAddScanData() {
		TaskManagement taskManagement = new TaskManagement();
		taskManagement.setTaskId(1);
		
		ScanData scanData = new ScanData();
		scanData.setDevInfo("192.168.1.112");
		scanData.setVulnerInfo("[{'param6': 'Windows 6.2.9200 2; UPnP 1.0', 'param5': '1.6.19', 'param4': 'Portable SDK for UPnP devices', 'param3': 'open', 'param2': 'upnp', 'param1': '49152'}]");
		scanData.setOuccrTime("2012-09-11");
		scanData.setNewStatus(2);
		scanData.setScanType(1);
		scanData.setTaskManagement(taskManagement);
		
		System.out.println(scanDataService.insertScanData(scanData));
	}
	
}
