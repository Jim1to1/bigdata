package com.bigdata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.beans.User;
import com.bigdata.dao.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	/**
	 * 根据用户名和密码获取数据库中 User 对象
	 * @param userName
	 * @param passWord
	 * @return
	 */
	public User getUserByUserNameAndPassWord(String userName, String passWord) {
		return userMapper.getUserByUserNameAndPsw(userName, passWord);
	}
	
}
