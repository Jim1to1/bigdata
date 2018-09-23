package com.bigdata.beans;

import java.io.Serializable;
import java.util.List;

/**
 * 任务管理表
 * @author yangyang
 *
 */
public class TaskManagement implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer taskId;		// 任务 id 号
	private String devIP;		// 扫描任务中，前端输入的IP
	private Integer tmstatus;	// 任务状态, 0:未开始	1:正在执行	  2:扫描任务完成
	private String tmdescribe;	// 扫描任务描述
	private String addTime;		// 任务创建时间
	
	// 关联属性, 关联多个 ScanData 对象
	private List<ScanData> scanDataList;
	
	// 关联属性, 多个 TaskManagement 对应一个 TaskOwner
	private TaskOwner taskOwner;

	public TaskManagement() {
		super();
	}

	public TaskManagement(Integer taskId, String devIP, Integer tmstatus, String tmdescribe, String addTime,
			List<ScanData> scanDataList, TaskOwner taskOwner) {
		super();
		this.taskId = taskId;
		this.devIP = devIP;
		this.tmstatus = tmstatus;
		this.tmdescribe = tmdescribe;
		this.addTime = addTime;
		this.scanDataList = scanDataList;
		this.taskOwner = taskOwner;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public String getDevIP() {
		return devIP;
	}

	public void setDevIP(String devIP) {
		this.devIP = devIP;
	}

	public Integer getTmstatus() {
		return tmstatus;
	}

	public void setTmstatus(Integer tmstatus) {
		this.tmstatus = tmstatus;
	}

	public String getTmdescribe() {
		return tmdescribe;
	}

	public void setTmdescribe(String tmdescribe) {
		this.tmdescribe = tmdescribe;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

	public List<ScanData> getScanDataList() {
		return scanDataList;
	}

	public void setScanDataList(List<ScanData> scanDataList) {
		this.scanDataList = scanDataList;
	}

	public TaskOwner getTaskOwner() {
		return taskOwner;
	}

	public void setTaskOwner(TaskOwner taskOwner) {
		this.taskOwner = taskOwner;
	}

	@Override
	public String toString() {
		return "TaskManagement [taskId=" + taskId + ", devIP=" + devIP + ", tmstatus=" + tmstatus + ", tmdescribe="
				+ tmdescribe + ", addTime=" + addTime + ", scanDataList=" + scanDataList + ", taskOwner=" + taskOwner
				+ "]";
	}

}
