package com.bigdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.beans.TaskManagement;
import com.bigdata.dao.TaskManagementMapper;

@Service
public class TaskManagementService {

	@Autowired
	private TaskManagementMapper taskManagementMapper;

	/**
	 * 通过 taskId 获取数据库表 <TaskManagement> 指定信息
	 * @param taskId
	 * @return
	 */
	public TaskManagement getTaskManagementMapperById(Integer taskId) {
		return taskManagementMapper.getTaskManagementMapperById(taskId);
	}

	/**
	 * 添加 taskManagement 对象并返回主键值
	 * @param taskManagement
	 * @return
	 */
	public int insetTaskManagement(TaskManagement taskManagement) {
		taskManagementMapper.addTaskManagement(taskManagement);
		
		return taskManagement.getTaskId();
	}
	
	/**
	 * 获取所有 TaskManagement 信息
	 * @return
	 */
	public List<TaskManagement> getAllTaskManagement() {
		return taskManagementMapper.getAllTaskManagement();
	}

	/**
	 * 通过 taskManagement 对象属性模糊查询 <TaskManagement> 表中信息
	 * @param taskManagement
	 * @return
	 */
	public List<TaskManagement> getTaskManagementByEntityForLike(TaskManagement taskManagement) {
		return taskManagementMapper.getTaskManagementByEntityForLike(taskManagement);
	}
	

	/**
	 * 根据 taskManagement 属性更新 TaskManagement 数据表中信息
	 * @param taskManagement
	 */
	public void updateTaskManagement(TaskManagement taskManagement) {
		taskManagementMapper.updateTaskManagement(taskManagement);
	}
	
	/**
	 * 
	 * @param taskManagement
	 * @return
	 */
	public List<TaskManagement> getTaskManagementMsgByEntity(TaskManagement taskManagement) {
		return taskManagementMapper.getTaskManagementMsgByEntity(taskManagement);
	}
	
	/**
	 * 向数据库表<TaskManagemtn>中添加信息
	 * @param taskManagement
	 * @return
	 */
	public Integer addTaskManagement(TaskManagement taskManagement) {
		return taskManagementMapper.addTaskManagement(taskManagement);
	}
	
	public void deleteTaskManagement(Integer taskId) {
		taskManagementMapper.deleteTaskManagementById(taskId);
	}

	public List<TaskManagement> getAllTaskManagementNoJoin() {
		return taskManagementMapper.getAllTaskManagementNoJoin();
	}
}
