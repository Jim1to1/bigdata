package com.bigdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bigdata.service.ScanDataService;

@Controller
public class ScanDataController {

	@Autowired
	private ScanDataService scanDataService;
	
}
