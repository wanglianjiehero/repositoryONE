package com.xhhy.domain;

import java.io.Serializable;
import java.util.List;

public class Dept implements Serializable{
	private Integer deptid;
	private String deptname;
	private List<Emp> emps;
	
	
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", deptname=" + deptname + "]";
	}
	public Dept(Integer deptid, String deptname) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
	}
	public Dept() {
		super();
	}
	
	
}
