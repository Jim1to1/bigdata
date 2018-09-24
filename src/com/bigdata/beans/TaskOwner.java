package com.bigdata.beans;

import java.util.List;

/**
 * 用户任务表
 * @author yangyang
 *
 */
public class TaskOwner {
	
	private Integer taskOwnerId;	// 
	private String macAddress;		// 表示主机 mac 地址
	private String configversion;	// 配置版本号，当具体添加任务删除任务等时可以获取
	
	// 关联属性, 关联多个任务
	private List<TaskManagement> taskManagementList;
	
	public TaskOwner() {
		super();
	}

	public TaskOwner(Integer taskOwnerId, String macAddress, String configversion,
			List<TaskManagement> taskManagementList) {
		super();
		this.taskOwnerId = taskOwnerId;
		this.macAddress = macAddress;
		this.configversion = configversion;
		this.taskManagementList = taskManagementList;
	}

	public Integer getTaskOwnerId() {
		return taskOwnerId;
	}

	public void setTaskOwnerId(Integer taskOwnerId) {
		this.taskOwnerId = taskOwnerId;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getConfigversion() {
		return configversion;
	}

	public void setConfigversion(String configversion) {
		this.configversion = configversion;
	}

	public List<TaskManagement> getTaskManagementList() {
		return taskManagementList;
	}

	public void setTaskManagementList(List<TaskManagement> taskManagementList) {
		this.taskManagementList = taskManagementList;
	}

	@Override
	public String toString() {
		return "TaskOwner [taskOwnerId=" + taskOwnerId + ", macAddress=" + macAddress + ", configversion="
				+ configversion + ", taskManagementList=" + taskManagementList + "]";
	}

}
