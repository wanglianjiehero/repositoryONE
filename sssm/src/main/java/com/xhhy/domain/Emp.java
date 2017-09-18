package com.xhhy.domain;

import java.io.Serializable;

public class Emp implements Serializable
{
	private Integer empid;
	private String empname;
	private Integer deptid;
	private Dept dept;
	
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", empname=" + empname + ", deptid=" + deptid + "]";
	}
	
}
