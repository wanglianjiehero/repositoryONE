package com.wlj.dao;

import java.util.List;

import com.wlj.domain.UserBean;

public interface UserDao {
	
	public List<UserBean> selectuser(UserBean userBean);
}
