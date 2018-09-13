package com.bigdata.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bigdata.beans.IndustrialProtocol;
import com.bigdata.service.IndustrialProtocolService;
import com.google.gson.Gson;

@Controller
public class IndustrialController {

	@Autowired
	private IndustrialProtocolService industrialProtocolService;
	
	@RequestMapping(value="/addIndustrialProtocolMsg", method=RequestMethod.POST)
	public String addIndustrialProtocolMsg(HttpServletRequest request) {
		
		String jsonStr = request.getParameter("jsonStr");
		Gson gson = new Gson();
		IndustrialProtocol industrialProtocol = gson.fromJson(jsonStr, IndustrialProtocol.class);
		System.out.println("industrialProtocol: " + industrialProtocol);
		
		System.out.println("insertId: " + industrialProtocolService.addIndustrialProtocol(industrialProtocol));
		
		return "success";
	}
	
}
