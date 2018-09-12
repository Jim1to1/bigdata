package com.bigdata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bigdata.beans.HostInf;
import com.bigdata.service.HostInfService;

@Controller
public class HostInfController {
	// HttpSession session, Map<String, Object> map
	@Autowired
	private HostInfService hostInfService;
	
	@ResponseBody
	@RequestMapping(value="/getHostInfMsg", method=RequestMethod.POST)
	public List<HostInf> getHostInfMsg() {
		
		return null;
	}
	
}
