package com.bigdata.beans;

/**
 * 恶意代码表
 * @author yangyang
 *
 */
public class MaliciousCode {

	private Integer codeId;
	private String codeName;
	private String codeDescribe;
	
	public MaliciousCode() {
		super();
	}

	public MaliciousCode(Integer codeId, String codeName, String codeDescribe) {
		super();
		this.codeId = codeId;
		this.codeName = codeName;
		this.codeDescribe = codeDescribe;
	}

	public Integer getCodeId() {
		return codeId;
	}

	public void setCodeId(Integer codeId) {
		this.codeId = codeId;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getCodeDescribe() {
		return codeDescribe;
	}

	public void setCodeDescribe(String codeDescribe) {
		this.codeDescribe = codeDescribe;
	}

	@Override
	public String toString() {
		return "MaliciousCode [codeId=" + codeId + ", codeName=" + codeName + ", codeDescribe=" + codeDescribe + "]";
	}
	
}
