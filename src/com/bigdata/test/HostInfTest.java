package com.bigdata.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bigdata.beans.HostInf;
import com.bigdata.service.HostInfService;
import com.bigdata.tools.JsonNode;

import net.sf.json.JSONObject;

public class HostInfTest {
	
	@Autowired
	private HostInfService hostInfService;
	private ApplicationContext applicationContext = null;
	
	@Before
	public void before() {
		applicationContext  = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		hostInfService = (HostInfService) applicationContext .getBean("hostInfService");
		// System.out.println(hostInfService);
	}

	@Test
	public void testGetHostInfById() {
		HostInf hostInf = hostInfService.getHostInfById(1);
		System.out.println(hostInf);
	}
	
	@Test
	public void testAddHostInf() {
		HostInf hostInf = new HostInf();
		hostInf.setDevIP("192.168.3.27");
		hostInf.setMacAddress("68:ec:c5:0b:30:ff");
		hostInf.setIndicator("PC1");
		hostInf.setDevType("PCINFO");
		hostInf.setMsg("{'param7': '空', 'param6': '空', 'param5': '236.424 GB', 'param4': '7.85 GB', 'param3': 8, 'param2': 'AMD64', 'param1': 'Windows 10', 'param9': '无', 'param8': '无'}");
		
		System.out.println(hostInfService.addHostInf(hostInf));
	}
	
	@Test
	public void testGetAllHostInf() {
		List<HostInf> hostInfList = hostInfService.getAllHostInf();
		System.out.println(hostInfList.size());
	}
	
	@Test
	public void testGetHostInfListByEntityForLike() {
		HostInf hostInf = new HostInf();
		hostInf.setDevIP("192.168.1.113");
		List<HostInf> hostInfList = hostInfService.getHostInfListByEntityForLike(hostInf);
		System.out.println(hostInfList.size());
	}
	
	@Test
	public void testUpdateHostInfByEntity() {
		HostInf hostInf = new HostInf();
		hostInf.setHostId(23);
		hostInf.setIndicator("PC2");
		hostInfService.updateHostInfByEntity(hostInf);
		
		System.out.println(hostInfService.getHostInfById(23));
	}
	
	@Test
	public void testReadJson() {
		HostInf hostInf = new HostInf();
		hostInf.setDevIP("127.0.0.1");
		hostInf.setIndicator("PC2");
		List<HostInf> hostInfList = hostInfService.getHostInfByEntityForList(hostInf);
		
		System.out.println(hostInfList.get(hostInfList.size() - 1));
		
		JSONObject jsonObject = JSONObject.fromObject(hostInfList.get(hostInfList.size() - 1).getMsg());
		JsonNode jsonNode = (JsonNode) JSONObject.toBean(jsonObject, JsonNode.class);
		
		System.out.println(jsonNode);
	}

}
