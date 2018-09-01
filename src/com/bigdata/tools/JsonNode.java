package com.bigdata.tools;

import java.util.List;

public class JsonNode {

	private String jparam1;
	private String jparam2;
	private String jparam3;
	private String jparam4;
	private String jparam5;
	private String jparam6;
	private String jparam7;
	private String jparam8;
	private String jparam9;
	private String jparam10;
	private List<String> jparamList1;
	private List<String> jparamList2;
	
	public JsonNode() {
		super();
	}

	public JsonNode(String jparam1, String jparam2, String jparam3, String jparam4, String jparam5, String jparam6,
			String jparam7, String jparam8, String jparam9, String jparam10, List<String> jparamList1,
			List<String> jparamList2) {
		super();
		this.jparam1 = jparam1;
		this.jparam2 = jparam2;
		this.jparam3 = jparam3;
		this.jparam4 = jparam4;
		this.jparam5 = jparam5;
		this.jparam6 = jparam6;
		this.jparam7 = jparam7;
		this.jparam8 = jparam8;
		this.jparam9 = jparam9;
		this.jparam10 = jparam10;
		this.jparamList1 = jparamList1;
		this.jparamList2 = jparamList2;
	}

	public String getJparam1() {
		return jparam1;
	}

	public void setJparam1(String jparam1) {
		this.jparam1 = jparam1;
	}

	public String getJparam2() {
		return jparam2;
	}

	public void setJparam2(String jparam2) {
		this.jparam2 = jparam2;
	}

	public String getJparam3() {
		return jparam3;
	}

	public void setJparam3(String jparam3) {
		this.jparam3 = jparam3;
	}

	public String getJparam4() {
		return jparam4;
	}

	public void setJparam4(String jparam4) {
		this.jparam4 = jparam4;
	}

	public String getJparam5() {
		return jparam5;
	}

	public void setJparam5(String jparam5) {
		this.jparam5 = jparam5;
	}

	public String getJparam6() {
		return jparam6;
	}

	public void setJparam6(String jparam6) {
		this.jparam6 = jparam6;
	}

	public String getJparam7() {
		return jparam7;
	}

	public void setJparam7(String jparam7) {
		this.jparam7 = jparam7;
	}

	public String getJparam8() {
		return jparam8;
	}

	public void setJparam8(String jparam8) {
		this.jparam8 = jparam8;
	}

	public String getJparam9() {
		return jparam9;
	}

	public void setJparam9(String jparam9) {
		this.jparam9 = jparam9;
	}

	public String getJparam10() {
		return jparam10;
	}

	public void setJparam10(String jparam10) {
		this.jparam10 = jparam10;
	}

	public List<String> getJparamList1() {
		return jparamList1;
	}

	public void setJparamList1(List<String> jparamList1) {
		this.jparamList1 = jparamList1;
	}

	public List<String> getJparamList2() {
		return jparamList2;
	}

	public void setJparamList2(List<String> jparamList2) {
		this.jparamList2 = jparamList2;
	}

	@Override
	public String toString() {
		return "JsonNode [jparam1=" + jparam1 + ", jparam2=" + jparam2 + ", jparam3=" + jparam3 + ", jparam4=" + jparam4
				+ ", jparam5=" + jparam5 + ", jparam6=" + jparam6 + ", jparam7=" + jparam7 + ", jparam8=" + jparam8
				+ ", jparam9=" + jparam9 + ", jparam10=" + jparam10 + ", jparamList1=" + jparamList1 + ", jparamList2="
				+ jparamList2 + "]";
	}
	
}
