package com.wlj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wlj.domain.UserBean;

@Controller
@RequestMapping("user")
public class Usercontroller {
	@RequestMapping("selectUser.do")
	public ModelAndView selectUser(UserBean userBean){
		System.out.println(userBean);
		
		ModelAndView mav=new ModelAndView();
		return mav;
	}
}
