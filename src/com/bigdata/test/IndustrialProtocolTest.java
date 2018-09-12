package com.bigdata.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bigdata.beans.IndustrialProtocol;
import com.bigdata.service.IndustrialProtocolService;

public class IndustrialProtocolTest {
	
	@Autowired
	private IndustrialProtocolService industrialProtocolService;
	
	@Before
	public void before() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		industrialProtocolService = (IndustrialProtocolService) applicationContext.getBean("industrialProtocolService");
		//System.out.println(industrialProtocolService);
	}
	
	@Test
	public void testGetIndustrialProtocolById() {
		IndustrialProtocol industrialProtocol = industrialProtocolService.getIndustrialProtocolById(2);
		System.out.println(industrialProtocol);
	}
}
