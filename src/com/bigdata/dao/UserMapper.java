package com.bigdata.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.bigdata.beans.User;

@MapperScan
@Repository
public interface UserMapper {

	/**
	 * 通过用户 id 号获取指定用户
	 * @param userId
	 * @return
	 */
	public User getUserById(Integer userId);
	
	/**
	 * 通过用户名密码获取指定用户(登陆用)
	 * @param userName
	 * @param passWord
	 * @return
	 */
	public User getUserByUserNameAndPsw(String userName, String passWord);
	
	/**
	 * 通过指定 id 删除用户
	 * @param id
	 */
	public void deleteUserById(Integer id);
	
	/**
	 * 添加用户并返回其主键值
	 * @param user
	 */
	public Integer addUser(User user);
	
	/**
	 * 通过用户对象属性更新用户
	 * @param user
	 */
	public void updateUser(User user);
	
	/**
	 * 获取所有用户
	 * @return
	 */
	public List<User> getAllUser();
	
	/**
	 * 通过用户属性模糊查询用户列表
	 * @param user
	 * @return
	 */
	public List<User> getUserByPropertisForLike(User user);
	
}
