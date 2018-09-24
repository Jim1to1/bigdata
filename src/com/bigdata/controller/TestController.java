package com.bigdata.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bigdata.tools.JsonNode;
import com.google.gson.Gson;

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
	
	@RequestMapping(value="/testJson", method=RequestMethod.POST)
	public String testJson(HttpServletRequest request) {
		
		// 对象嵌套数组嵌套对象
        String jsonStr = request.getParameter("jsonStr");
        System.out.println("jsonStr: " + jsonStr);
        Gson gson = new Gson();
        //1、
        //解析对象：第一个参数：待解析的字符串 第二个参数结果数据类型的Class对象
        //JsonNode.java grade = gson.fromJson(json1, Grade.class);
        JsonNode jsonNode = gson.fromJson(jsonStr, JsonNode.class);
        System.out.println("Receive: " + jsonNode);
		
		return "success";
	}
	
}
