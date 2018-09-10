package com.bigdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bigdata.service.IndustrialProtocolService;

@Controller
public class IndustrialController {

	@Autowired
	private IndustrialProtocolService industrialProtocolService;
	
}
