package com.bigdata.beans;

import java.util.List;

/**
 * 任务管理表
 * @author yangyang
 *
 */
public class TaskManagement {

	private Integer taskId;		// 任务 id 号
	private String devIP;		// 扫描任务中，前端输入的IP
	private Integer status;		// 任务状态, 1:未开始	2:正在执行	  3:扫描任务完成
	private String describe;	// 扫描任务描述
	private String addTime;		// 任务创建时间
	
	// 关联属性, 关联多个 ScanData 对象
	private List<ScanData> scanDataList;

	public TaskManagement() {
		super();
	}

	public TaskManagement(Integer taskId, String devIP, Integer status, String describe, String addTime,
			List<ScanData> scanDataList) {
		super();
		this.taskId = taskId;
		this.devIP = devIP;
		this.status = status;
		this.describe = describe;
		this.addTime = addTime;
		this.scanDataList = scanDataList;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
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

	@Override
	public String toString() {
		return "TaskManagement [taskId=" + taskId + ", devIP=" + devIP + ", status=" + status + ", describe=" + describe
				+ ", addTime=" + addTime + ", scanDataList=" + scanDataList + "]";
	}

}
