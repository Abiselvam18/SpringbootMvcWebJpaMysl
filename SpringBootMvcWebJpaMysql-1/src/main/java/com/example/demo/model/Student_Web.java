package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student_Web {
	@Id
	private int Sid;
	private String Sname;
	//generate constructor from super class
	//generate constructor using fields
	//generate setter & getter
	//generate to string method
	public Student_Web() {
		super();
		
	}
	public Student_Web(int sid, String sname) {
		super();
		Sid = sid;
		Sname = sname;
	}
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + "]";
	}
	
}
