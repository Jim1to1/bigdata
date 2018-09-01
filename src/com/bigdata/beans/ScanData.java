package com.bigdata.beans;

/**
 * 扫描数据信息表
 * @author yangyang
 *
 */
public class ScanData {

	private Integer scanId;		// 扫描任务 id 号
	private String devInfo;		// 扫描设备信息数据
	private String vulnerInfo;  // 扫描漏洞数据
	private String ouccrTime;	// 扫描完成时间
	private String newStatus;	// 扫描状态。此数据应该为2
	
	// 关联属性
	private TaskOwner taskOwner;

	public ScanData() {
		super();
	}

	public ScanData(Integer scanId, String devInfo, String vulnerInfo, String ouccrTime, String newStatus,
			TaskOwner taskOwner) {
		super();
		this.scanId = scanId;
		this.devInfo = devInfo;
		this.vulnerInfo = vulnerInfo;
		this.ouccrTime = ouccrTime;
		this.newStatus = newStatus;
		this.taskOwner = taskOwner;
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

	public String getNewStatus() {
		return newStatus;
	}

	public void setNewStatus(String newStatus) {
		this.newStatus = newStatus;
	}

	public TaskOwner getTaskOwner() {
		return taskOwner;
	}

	public void setTaskOwner(TaskOwner taskOwner) {
		this.taskOwner = taskOwner;
	}

	@Override
	public String toString() {
		return "ScanData [scanId=" + scanId + ", devInfo=" + devInfo + ", vulnerInfo=" + vulnerInfo + ", ouccrTime="
				+ ouccrTime + ", newStatus=" + newStatus + ", taskOwner=" + taskOwner + "]";
	}
	
}
