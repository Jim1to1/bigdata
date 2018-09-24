package com.bigdata.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.bigdata.beans.TaskManagement;

@MapperScan
@Repository
public interface TaskManagementMapper {

	/**
	 * 通过 taskId 获取 TaskManagement 对象信息
	 * @param taskId
	 * @return
	 */
	public TaskManagement getTaskManagementMapperById(Integer taskId);
	
	/**
	 * 通过 taskManagementMapper 属性信息筛选 <TaskManagementMapper> 表中信息
	 * @param taskManagementMapper
	 * @return
	 */
	public TaskManagement getTaskManagementMapperByEntity(TaskManagement taskManagement);
	
	/**
	 * 添加 TaskManagementMapper 对象信息并返回主键值
	 * @param taskManagement
	 * @return
	 */
	public int addTaskManagement(TaskManagement taskManagement);
	
	/**
	 * 通过 taskId 删除指定 TaskManagementMapper 对象信息
	 * @param taskId
	 */
	public void deleteTaskManagementById(Integer taskId);
	
	/**
	 * 获取所有 TaskManagementMapper 对象信息
	 * @return
	 */
	public List<TaskManagement> getAllTaskManagement();
	
	/**
	 * 通过 TaskManagementMapper 属性模糊查询 <TaskManagementMapper> 表中信息
	 * @param taskManagement
	 * @return
	 */
	public List<TaskManagement> getTaskManagementByEntityForLike(TaskManagement taskManagement);
	
	/**
	 * 根据 TaskManagement 对象属性更新 <TaskManagement> 表中信息
	 * @param taskManagement
	 */
	public void updateTaskManagement(TaskManagement taskManagement);
	
	/**
	 * 根据 taskManagement 对象属性查询数据库表中信息, 不进行连接查询
	 * @param taskManagement
	 * @return
	 */
	public List<TaskManagement> getTaskManagementMsgByEntity(TaskManagement taskManagement);
	
	/**
	 * 获取所有 taskManagement 信息, 不进行连接查询
	 * @return
	 */
	public List<TaskManagement> getAllTaskManagementNoJoin();
	
}
