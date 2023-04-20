package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Person 
{
	private int pid;
	private String pname;
	@JsonIgnore
	private int page;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Person(int pid, String pname, int page) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
	}
}
