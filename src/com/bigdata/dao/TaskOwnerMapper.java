package com.bigdata.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.bigdata.beans.TaskOwner;

@MapperScan
@Repository
public interface TaskOwnerMapper {

	/**
	 * 通过 taskOwnerId 获取 TaskOwner 对象信息
	 * @param taskOwnerId
	 * @return
	 */
	public TaskOwner getTaskOwnerById(Integer taskOwnerId);
	
	/**
	 * 通过 TaskOwner 对象属性获取 TaskOwner 对象信息
	 * @param taskOwner
	 * @return
	 */
	public TaskOwner getTaskOwnerByEntity(TaskOwner taskOwner);
	
	/**
	 * 添加 TaskOwner 对象到 <TaskOwner> 表中, 并返回主键值
	 * @param taskOwner
	 * @return
	 */
	public int addTaskOwner(TaskOwner taskOwner);
	
	/**
	 * 通过 taskOwnerId 删除指定 TaskOwner 对象
	 * @param taskOwnerId
	 */
	public void deleteTaskOwnerById(Integer taskOwnerId);
	
	/**
	 * 获取所有 TaskOwner 对象信息
	 */
	public List<TaskOwner> getAllTaskOwner();
	
	/**
	 * 通过 TaskOwner 对象属性查询 <TaskOwner> 表中信息, 并返回列表
	 * @param taskOwner
	 * @return
	 */
	public List<TaskOwner> getTaskOwnerByEntityForLike(TaskOwner taskOwner);
	
	/**
	 * 更新 <TaskOwner> 表中信息
	 * @param taskOwner
	 */
	public void updateTaskOwner(TaskOwner taskOwner);
	
}
