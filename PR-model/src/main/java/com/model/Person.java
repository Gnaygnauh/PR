package com.model;

import java.io.Serializable;

public class Person implements Serializable{
  
	/**
	 * 
	 */
	private static final long serialVersionUID = 8246596632946481509L;
	private int pid;
    private String pname;
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
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pid, String pname) {
		super();
		this.pid = pid;
		this.pname = pname;
	}
    
}
