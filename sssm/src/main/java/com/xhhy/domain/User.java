package com.xhhy.domain;

import java.io.Serializable;

public class User implements Serializable {
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uage=" + uage + "]";
	}
	private Integer uid;
	private String uname;
	private String uage;
	private String paixu;
	
	public User() {
		super();
	}
	public User(Integer uid, String uname, String uage) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uage = uage;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUage() {
		return uage;
	}
	public void setUage(String uage) {
		this.uage = uage;
	}
	public String getPaixu() {
		return paixu;
	}
	public void setPaixu(String paixu) {
		this.paixu = paixu;
	}
	
	
}
