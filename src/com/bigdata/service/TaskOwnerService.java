package com.bigdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.dao.TaskOwnerMapper;

@Service
public class TaskOwnerService {

	@Autowired
	private TaskOwnerMapper taskOwnerMapper;
	
}
