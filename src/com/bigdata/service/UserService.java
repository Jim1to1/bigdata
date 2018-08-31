package com.bigdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.dao.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
}
