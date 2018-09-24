package com.bigdata.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bigdata.beans.ScanData;
import com.bigdata.beans.TaskManagement;
import com.bigdata.service.ScanDataService;
import com.bigdata.service.TaskManagementService;
import com.bigdata.tools.JsonNode;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class ScanDataTest {
	
	@Autowired
	private ScanDataService scanDataService;
	
	@Autowired
	private TaskManagementService taskManagementService;
	
	private ApplicationContext applicationContext;
	
	@Before
	public void before() {
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		scanDataService = (ScanDataService) applicationContext.getBean("scanDataService");
		taskManagementService = (TaskManagementService) applicationContext.getBean("taskManagementService");
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
	
	@Test
	public void mtest() {
		Gson gson = new Gson();
		ScanData scanData = new ScanData();
		scanData.setTaskId(1);
		List<ScanData> scanDataList = new ArrayList<>();
		List<JsonNode> jsonList = new ArrayList<>();
		JsonNode jsonNode = null;
		
		// 获取 scantype1内容
		scanData.setScanType(1);
		scanDataList = scanDataService.getScanDataByEntityForList(scanData);
			
		for(int i=0; i<scanDataList.size(); i++) {
			//System.out.println(scanDataList.get(i).getVulnerInfo());
			jsonNode = gson.fromJson(scanDataList.get(i).getVulnerInfo(), JsonNode.class);
			System.out.println(jsonNode);
////			System.out.println("jsonNode: " + jsonNode);
//			jsonList.add(jsonNode);
		}
//		
//		System.out.println("jsonList: " + jsonList.size());

	}
	
}
