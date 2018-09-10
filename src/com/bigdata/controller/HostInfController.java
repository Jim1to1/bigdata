package com.bigdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bigdata.service.HostInfService;

@Controller
public class HostInfController {

	@Autowired
	private HostInfService hostInfService;
	
}
