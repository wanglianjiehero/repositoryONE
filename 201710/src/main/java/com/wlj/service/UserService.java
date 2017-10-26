package com.wlj.service;

import java.util.List;

import com.wlj.domain.UserBean;

public interface UserService {
	public List<UserBean> selectuser(UserBean userBean);
}
