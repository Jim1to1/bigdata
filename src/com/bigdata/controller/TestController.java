package com.bigdata.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	@RequestMapping(value="/getRequest", method=RequestMethod.POST)
	public String getRequest(HttpServletRequest request) {
		
		//String requestStr = request.getParameter("flag");
		String name = request.getParameter("username");
		
		System.out.println(name);
		/*while(requestStr != null) {
			
		}*/
		
		// 192.168.56.1:8080/getRequest
		
		return "index";
	}
	
}
