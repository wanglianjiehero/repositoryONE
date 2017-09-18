package com.xhhy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xhhy.domain.Emp;
import com.xhhy.service.EmpService;

@Controller
@RequestMapping("empController")
public class EmpController {
	@Resource
	private EmpService empService;
	@RequestMapping("getAllemp.do")
	public ModelAndView getAllemp(Emp emp){
		ModelAndView mav=new ModelAndView("/index.jsp");
		System.out.println(emp);
		
		List<Emp> emps=empService.getAllemp(emp);
		for (Emp emp2 : emps) {
			System.out.println(emp2);
		}
		mav.addObject("emps",emps);
		mav.addObject("empid",emp.getEmpid());
		mav.addObject("empname",emp.getEmpname());
		mav.addObject("deptid",emp.getDeptid());
	
		return mav;
	}
}
