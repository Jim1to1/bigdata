package com.bigdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.dao.IndustrialProtocolMapper;

@Service
public class IndustrialProtocolService {

	@Autowired
	private IndustrialProtocolMapper industrialProtocolMapper;
	
}
