package com.bigdata.beans;

/**
 * 主机信息表
 * @author yangyang
 *
 */
public class HostInf {

	private Integer hostId;		// 
	private String devIP;		// 表示 windows 主机设备的 IP 地址
	private String macAddress;	// 表示 windows 主机设备的 Mac 地址
	private String indicator;	// 表示主机核查中指标类别，为 pc1,pc2 等
	private String devType;		// 主机核查的标识，默认为 PCINFO
	private String msg;			// 表示主机核查指标中的具体数据
	
	public HostInf() {
		super();
	}

	public HostInf(Integer hostId, String devIP, String macAddress, String indicator, String devType, String msg) {
		super();
		this.hostId = hostId;
		this.devIP = devIP;
		this.macAddress = macAddress;
		this.indicator = indicator;
		this.devType = devType;
		this.msg = msg;
	}

	public Integer getHostId() {
		return hostId;
	}

	public void setHostId(Integer hostId) {
		this.hostId = hostId;
	}

	public String getDevIP() {
		return devIP;
	}

	public void setDevIP(String devIP) {
		this.devIP = devIP;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public String getDevType() {
		return devType;
	}

	public void setDevType(String devType) {
		this.devType = devType;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "HostInf [hostId=" + hostId + ", devIP=" + devIP + ", macAddress=" + macAddress + ", indicator="
				+ indicator + ", devType=" + devType + ", msg=" + msg + "]";
	}
	
	
}
