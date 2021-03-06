package com.bigdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.beans.User;
import com.bigdata.dao.UserMapper;
import com.bigdata.tools.Encoder;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	/**
	 * 根据用户ID获取数据库中 User 对象
	 * @param userId
	 * @return
	 */
	public User getUserById(Integer userId) {
		return userMapper.getUserById(userId);
	}
	
	/**
	 * 根据用户名和密码获取数据库中 User 对象
	 * @param userName
	 * @param password
	 * @return
	 */
	public User getUserByUserNameAndPsw(String userName, String password) {
		String md5Psw = Encoder.EncoderByMd5(password);
		
		User user = userMapper.getUserByUserNameAndPsw(userName, md5Psw);
		
		return user;
	}
	
	/**
	 * 根据用户Id删除数据库中 User 对象
	 * @param userId
	 * @return
	 */
	public void deleteUserById(Integer id) {
		userMapper.deleteUserById(id);
	}
	
	/**
	 * 获取数据库中所有 User 对象
	 * @return
	 */
	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}
	
	/**
	 * 向数据库中插入新的 User 对象
	 * @param user
	 */
	public int addUser(User user) {
		int id = userMapper.addUser(user) ;
		return id;
	}
	
	/**
	 * 获取与 user 有相似属性内容的 user 对象
	 * @param user
	 * @return
	 */
	public List<User> getUserByPropertisForLike(User user){		
		return userMapper.getUserByPropertisForLike(user);
	}
	
	/**
	 * 根据user信息更新数据库中相应的 User 对象
	 * @param user
	 */
	public void updateUser(User user) {
		if(user.getUserId() != null) {
			userMapper.updateUser(user);
		}
	}

	/**
	 * 验证指定用户名是否存在
	 * @param username
	 * @return true: 已经存在	false: 不存在
	 */
	public boolean validateIsExist(String username) {
		if(userMapper.getUserByUsername(username) != null) {
			return true;
		}
		return false;
	}
	
}
