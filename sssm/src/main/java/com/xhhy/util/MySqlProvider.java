package com.xhhy.util;

import java.util.List;
import java.util.Map;

import com.xhhy.domain.Emp;
import com.xhhy.domain.User;

import static org.apache.ibatis.jdbc.SqlBuilder.*;

public class MySqlProvider {

	public String listUser(User user) {
		BEGIN();
		SELECT("uid,uname,uage");
		FROM("user");
		if(user != null){
			if(user.getUid() != null){
				WHERE("uid = #{uid}");
			}
			if(user.getUage() != null&&!user.getUage().equals("")){
				WHERE("uage = #{uage}");
			}
			if(user.getUname() != null && !user.getUname().equals("")){
				WHERE("uname like #{uname}\"%\"");
			}
			ORDER_BY(user.getPaixu());
		}
		
		String sql = SQL();
		System.out.println(sql);
		return sql;
	}
	public String getAllemp(Emp emp) {
		BEGIN();
		SELECT("emp_id empid,emp_name empname,dept_id deptid");
		FROM("emp");
		if(emp != null){
			if(emp.getEmpid() != null){
				WHERE("emp_id = #{empid}");
			}
			if(emp.getEmpname() != null&&!emp.getEmpname().equals("")){
				WHERE("emp_name like \"%\"#{empname}\"%\"");
			}
			if(emp.getDeptid() != null ){
				WHERE("dept_id = #{deptid}");
			}
			
		}
		
		String sql = SQL();
		System.out.println(sql);
		return sql;
	}

}
