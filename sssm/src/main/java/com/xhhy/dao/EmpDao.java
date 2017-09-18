package com.xhhy.dao;

import java.util.List;

import org.apache.ibatis.annotations.SelectProvider;

import com.xhhy.domain.Emp;
import com.xhhy.util.MySqlProvider;

public interface EmpDao {
	@SelectProvider(method="getAllemp",type=MySqlProvider.class)
	public List<Emp> getAllemp(Emp emp);
}
