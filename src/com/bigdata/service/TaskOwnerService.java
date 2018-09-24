package com.bigdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.beans.TaskOwner;
import com.bigdata.dao.TaskOwnerMapper;

@Service
public class TaskOwnerService {

	@Autowired
	private TaskOwnerMapper taskOwnerMapper;

	/**
	 * 通过 taskOwnerId 获取指定 TaskOwner 对象
	 * @param taskOwnerId
	 * @return
	 */
	public TaskOwner getTaskOwnerById(Integer taskOwnerId) {
		return taskOwnerMapper.getTaskOwnerById(taskOwnerId);
	}

	/**
	 * 添加 TaskOwner 对象
	 * @param taskOwner
	 * @return
	 */
	public int insertTaskOwner(TaskOwner taskOwner) {
		taskOwnerMapper.addTaskOwner(taskOwner);
		return taskOwner.getTaskOwnerId();
	}

	/**
	 * 通过 taskOwner 对象属性筛选数据库信息
	 * @param taskOwner
	 * @return
	 */
	public TaskOwner getTaskOwnerByEntity(TaskOwner taskOwner) {
		return taskOwnerMapper.getTaskOwnerByEntity(taskOwner);
	}

	/**
	 * 获取所有 TaskOwner 表中信息
	 * @return
	 */
	public List<TaskOwner> getAllTaskOwner() {
		return taskOwnerMapper.getAllTaskOwner();
	}

	/**
	 * 通过 TaskOwner 对象属性模糊查询数据库表中信息
	 * @param taskOwner
	 * @return
	 */
	public List<TaskOwner> getTaskOwnerByEntityForLike(TaskOwner taskOwner) {
		return taskOwnerMapper.getTaskOwnerByEntityForLike(taskOwner);
	}
	
	/**
	 * 通过 TaskOwner 对象属性更新数据库表信息
	 * @param taskOwner
	 */
	public void updateHostInfByEntity(TaskOwner taskOwner) {
		if(taskOwner.getTaskOwnerId() != null) {
			taskOwnerMapper.updateTaskOwner(taskOwner);
		}
	}
	
}
