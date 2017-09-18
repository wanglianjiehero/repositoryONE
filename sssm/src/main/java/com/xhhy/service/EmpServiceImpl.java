package com.xhhy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xhhy.dao.EmpDao;
import com.xhhy.domain.Emp;
@Service
public class EmpServiceImpl implements EmpService {
	
	@Resource
	private EmpDao empDao;
	public List<Emp> getAllemp(Emp emp) {
		// TODO Auto-generated method stub
		return empDao.getAllemp(emp);
	}

}
