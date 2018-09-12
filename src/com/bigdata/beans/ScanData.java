package com.bigdata.beans;

import java.io.Serializable;

/**
 * 扫描数据信息表
 * @author yangyang
 *
 */
public class ScanData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer scanId;		// 扫描任务 id 号
	private String devInfo;		// 扫描设备信息数据
	private String vulnerInfo;  // 扫描漏洞数据
	private String ouccrTime;	// 扫描完成时间
	private Integer newStatus;	// 扫描状态。此数据应该为2
	private Integer scanType;	// 扫描结果种类		1: 端口信息	2: 漏洞信息
	
	// 关联属性
	private TaskManagement taskManagement;
	
	// 不需映射数据库属性
	private Integer taskId;
	
	public ScanData() {
		super();
	}

	public ScanData(Integer scanId, String devInfo, String vulnerInfo, String ouccrTime, Integer newStatus,
			Integer scanType, TaskManagement taskManagement) {
		super();
		this.scanId = scanId;
		this.devInfo = devInfo;
		this.vulnerInfo = vulnerInfo;
		this.ouccrTime = ouccrTime;
		this.newStatus = newStatus;
		this.scanType = scanType;
		this.taskManagement = taskManagement;
	}

	public Integer getScanId() {
		return scanId;
	}

	public void setScanId(Integer scanId) {
		this.scanId = scanId;
	}

	public String getDevInfo() {
		return devInfo;
	}

	public void setDevInfo(String devInfo) {
		this.devInfo = devInfo;
	}

	public String getVulnerInfo() {
		return vulnerInfo;
	}

	public void setVulnerInfo(String vulnerInfo) {
		this.vulnerInfo = vulnerInfo;
	}

	public String getOuccrTime() {
		return ouccrTime;
	}

	public void setOuccrTime(String ouccrTime) {
		this.ouccrTime = ouccrTime;
	}

	public Integer getNewStatus() {
		return newStatus;
	}

	public void setNewStatus(Integer newStatus) {
		this.newStatus = newStatus;
	}

	public Integer getScanType() {
		return scanType;
	}

	public void setScanType(Integer scanType) {
		this.scanType = scanType;
	}

	public TaskManagement getTaskManagement() {
		return taskManagement;
	}

	public void setTaskManagement(TaskManagement taskManagement) {
		this.taskManagement = taskManagement;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	@Override
	public String toString() {
		return "ScanData [scanId=" + scanId + ", devInfo=" + devInfo + ", vulnerInfo=" + vulnerInfo + ", ouccrTime="
				+ ouccrTime + ", newStatus=" + newStatus + ", scanType=" + scanType + ", taskManagement="
				+ taskManagement + ", taskId=" + taskId + "]";
	}

}
