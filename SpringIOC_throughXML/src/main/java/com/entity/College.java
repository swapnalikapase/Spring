package com.entity;

public class College {
	
	private int c_id;
	private String c_name;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int c_id, String c_name) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	@Override
	public String toString() {
		return "College [c_id=" + c_id + ", c_name=" + c_name + "]";
	}
	

}
