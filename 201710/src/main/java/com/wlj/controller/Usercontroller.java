package com.wlj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.wlj.domain.UserBean;
import com.wlj.service.UserService;

@Controller
@RequestMapping("user")
public class Usercontroller {
	@Autowired
	private UserService UserService;
	@RequestMapping("user.do")
	@ResponseBody
	public List<UserBean> ajaxLogin(String userName){
		UserBean userBean=new UserBean();
		userBean.setUserName(userName);
		 return UserService.selectuser(userBean);
	}
	@RequestMapping("selectUser.do")
	public ModelAndView selectUser(UserBean userBean){
		System.out.println(userBean);
		List<UserBean> userBeans=UserService.selectuser(userBean);
	System.out.println(userBeans.size());
		for (UserBean userBean2 : userBeans) {
			System.out.println(userBean2.getUserName());
		}
		ModelAndView mav=new ModelAndView("/select.jsp");
		mav.addObject("userBeans",userBeans);
		return mav;
	}
}
