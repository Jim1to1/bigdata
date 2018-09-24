package com.bigdata.beans;

/**
 * 工业协议表
 * @author yangyang
 *
 */
public class IndustrialProtocol {

	private Integer protocolId;		// 工业协议 id 号
	private String protocolName;	// 监测到的协议名称
	private String recepTime;		// 协议接受时间
	private String destIp;			// 协议包的目标ip
	private String srcIp;			// 协议包的源ip
	private String protocolInfo;	// 协议具体数据信息
	
	public IndustrialProtocol() {
		super();
	}

	public IndustrialProtocol(Integer protocolId, String protocolName, String recepTime, String destIp, String srcIp,
			String protocolInfo) {
		super();
		this.protocolId = protocolId;
		this.protocolName = protocolName;
		this.recepTime = recepTime;
		this.destIp = destIp;
		this.srcIp = srcIp;
		this.protocolInfo = protocolInfo;
	}

	public Integer getProtocolId() {
		return protocolId;
	}

	public void setProtocolId(Integer protocolId) {
		this.protocolId = protocolId;
	}

	public String getProtocolName() {
		return protocolName;
	}

	public void setProtocolName(String protocolName) {
		this.protocolName = protocolName;
	}

	public String getRecepTime() {
		return recepTime;
	}

	public void setRecepTime(String recepTime) {
		this.recepTime = recepTime;
	}

	public String getDestIp() {
		return destIp;
	}

	public void setDestIp(String destIp) {
		this.destIp = destIp;
	}

	public String getSrcIp() {
		return srcIp;
	}

	public void setSrcIp(String srcIp) {
		this.srcIp = srcIp;
	}

	public String getProtocolInfo() {
		return protocolInfo;
	}

	public void setProtocolInfo(String protocolInfo) {
		this.protocolInfo = protocolInfo;
	}

	@Override
	public String toString() {
		return "IndustrialProtocol [protocolId=" + protocolId + ", protocolName=" + protocolName + ", recepTime="
				+ recepTime + ", destIp=" + destIp + ", srcIp=" + srcIp + ", protocolInfo=" + protocolInfo + "]";
	}

}
