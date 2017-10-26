package com.wlj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wlj.dao.UserDao;
import com.wlj.domain.UserBean;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	public List<UserBean> selectuser(UserBean userBean) {
		// TODO Auto-generated method stub
		return userDao.selectuser(userBean);
	}

}
