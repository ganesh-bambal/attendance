package com.myspace.sample1;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Time implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private int count;
	private java.lang.String str;
	private boolean flag;

	public Time() {
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public java.lang.String getStr() {
		return this.str;
	}

	public void setStr(java.lang.String str) {
		this.str = str;
	}

	public boolean isFlag() {
		return this.flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public Time(int count, java.lang.String str, boolean flag) {
		this.count = count;
		this.str = str;
		this.flag = flag;
	}

}