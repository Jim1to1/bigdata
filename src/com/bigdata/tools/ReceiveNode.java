package com.bigdata.tools;

/**
 * 接收后端插件节点使用
 * @author yangyang
 *
 */
public class ReceiveNode {

	private String param1;
	private String param2;
	private String param3;
	private String param4;
	private String param5;
	private String param6;
	private String param7;
	private String param8;
	private String param9;
	private String param10;
	
	private String paramList1;
	private String paramList2;
	
	public ReceiveNode() {
		super();
	}

	public ReceiveNode(String param1, String param2, String param3, String param4, String param5, String param6,
			String param7, String param8, String param9, String param10, String paramList1, String paramList2) {
		super();
		this.param1 = param1;
		this.param2 = param2;
		this.param3 = param3;
		this.param4 = param4;
		this.param5 = param5;
		this.param6 = param6;
		this.param7 = param7;
		this.param8 = param8;
		this.param9 = param9;
		this.param10 = param10;
		this.paramList1 = paramList1;
		this.paramList2 = paramList2;
	}

	public String getParam1() {
		return param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getParam2() {
		return param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getParam3() {
		return param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}

	public String getParam4() {
		return param4;
	}

	public void setParam4(String param4) {
		this.param4 = param4;
	}

	public String getParam5() {
		return param5;
	}

	public void setParam5(String param5) {
		this.param5 = param5;
	}

	public String getParam6() {
		return param6;
	}

	public void setParam6(String param6) {
		this.param6 = param6;
	}

	public String getParam7() {
		return param7;
	}

	public void setParam7(String param7) {
		this.param7 = param7;
	}

	public String getParam8() {
		return param8;
	}

	public void setParam8(String param8) {
		this.param8 = param8;
	}

	public String getParam9() {
		return param9;
	}

	public void setParam9(String param9) {
		this.param9 = param9;
	}

	public String getParam10() {
		return param10;
	}

	public void setParam10(String param10) {
		this.param10 = param10;
	}

	public String getParamList1() {
		return paramList1;
	}

	public void setParamList1(String paramList1) {
		this.paramList1 = paramList1;
	}

	public String getParamList2() {
		return paramList2;
	}

	public void setParamList2(String paramList2) {
		this.paramList2 = paramList2;
	}

	@Override
	public String toString() {
		return "ReceiveNode [param1=" + param1 + ", param2=" + param2 + ", param3=" + param3 + ", param4=" + param4
				+ ", param5=" + param5 + ", param6=" + param6 + ", param7=" + param7 + ", param8=" + param8
				+ ", param9=" + param9 + ", param10=" + param10 + ", paramList1=" + paramList1 + ", paramList2="
				+ paramList2 + "]";
	}

}
