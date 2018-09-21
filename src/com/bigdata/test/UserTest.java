package com.bigdata.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bigdata.beans.User;
import com.bigdata.service.UserService;
import com.bigdata.tools.Encoder;

public class UserTest {

	@Autowired
	private UserService userService;
	private ApplicationContext applicationContext = null;
	
	@Before
	public void before() {
		applicationContext  = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		userService = (UserService) applicationContext.getBean("userService");
		// System.out.println(hostInfService);
	}

	@Test
	public void testAddUser() {
		String password = "333";
		String md5Psw = Encoder.EncoderByMd5(password);
		User user = new User();
		user.setUserName("user3");
		user.setPassword(md5Psw);
		
		System.out.println(userService.addUser(user));
	}
	
}
