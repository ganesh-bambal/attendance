package com.myspace.sample1;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Late implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String query;
	private boolean flag;

	private int count;

	private int totalCount;

	private int email;

	public Late() {
	}

	public java.lang.String getQuery() {
		return this.query;
	}

	public void setQuery(java.lang.String query) {
		this.query = query;
	}

	public boolean isFlag() {
		return this.flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getEmail() {
		return this.email;
	}

	public void setEmail(int email) {
		this.email = email;
	}

	public Late(java.lang.String query, boolean flag, int count,
			int totalCount, int email) {
		this.query = query;
		this.flag = flag;
		this.count = count;
		this.totalCount = totalCount;
		this.email = email;
	}

}