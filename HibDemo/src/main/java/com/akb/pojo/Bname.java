package com.akb.pojo;

import javax.persistence.Embeddable;

@Embeddable
public class Bname {

	private String fname;
	private String lname;
	@Override
	public String toString() {
		return "bName [fname=" + fname + ", lname=" + lname + "]";
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Bname(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	public Bname() {
	}
	
	
}
