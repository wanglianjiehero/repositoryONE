package com.xhhy.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.xhhy.domain.Emp;
import com.xhhy.domain.User;
import com.xhhy.service.EmpService;
import com.xhhy.service.UserService;

@Controller
@RequestMapping("userController")
public class UserController {
	@Resource
	private UserService userService;
	@Resource
	private EmpService empService;
	
	@RequestMapping(value="listUser1.do",produces="text/html;charset=utf-8")
	@ResponseBody
	public void ajaxDoctor(User user,Integer shunxu,HttpServletResponse response){
		System.out.println(user);
		List<User> users=userService.listUser(user,shunxu);
		if (shunxu==null) {
			shunxu=0;
		}
//		httpServletResponse.
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		out.print("ajax能进去session作用域？"
				+ "");
		out.close();
	}
	
	/*@RequestMapping("upload.do")
	public ModelAndView upload(@RequestParam("file")MultipartFile mf){
		System.out.println(mf);
		System.out.println(mf.getOriginalFilename());
	
		try {
			InputStream in= mf.getInputStream();
			OutputStream out=new FileOutputStream("e:/C/"+mf.getOriginalFilename());
			FileCopyUtils.copy(in, out);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listUser(new User(),0,null);
	}*/
	@RequestMapping(value="listUser.do",produces="text/html;charset=utf-8")
	@ResponseBody
	public ModelAndView listUser(User u1,Integer shunxu,Integer empid,Integer deptid,String empname ){
		System.out.println("进入controller+++++++");
		ModelAndView mv=new ModelAndView("/index.jsp");
		if (shunxu==null) {
			shunxu=0;
		}
		Emp emp=new Emp();
		emp.setDeptid(deptid);
		emp.setEmpid(empid);
		emp.setEmpname(empname);
		if (emp!=null) {
		System.out.println(emp);
		List<Emp> emps=empService.getAllemp(emp);
		mv.addObject("emps",emps);
		}else{
			System.out.println("空");
		}
		/*try {
			u1.setUname( new String(u1.getUname().getBytes("iso-8859-1"),"utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		System.out.println(u1);
		List<User> users=userService.listUser(u1,shunxu);
		for (User u : users) {
			System.out.println(u);
		}
		mv.addObject("users",users);
		mv.addObject("uid",u1.getUid());
		mv.addObject("uname",u1.getUname());
		mv.addObject("uage",u1.getUage());
		mv.addObject("shunxu",shunxu);
		return mv;
	}
}
