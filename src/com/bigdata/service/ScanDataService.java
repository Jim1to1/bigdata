package com.bigdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.dao.ScanDataMapper;

@Service
public class ScanDataService {

	@Autowired
	private ScanDataMapper scanDataMapper;
	
}
