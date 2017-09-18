package com.xhhy.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xhhy.dao.UserDao;
import com.xhhy.domain.User;
@Service
public class UserServiceOImpl implements UserService {
	@Resource
	private UserDao userDao;

	public List<User> listUser(User user,Integer shunxu) {
		// TODO Auto-generated method stub
		if (shunxu==0) {
			user.setPaixu("uid");
		}else{
			
			user.setPaixu("uid desc");
		}
		return userDao.listUser(user);
	}

}
