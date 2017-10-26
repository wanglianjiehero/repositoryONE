package com.wlj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.wlj.domain.UserBean;

public interface UserDao {
	@Select("select user_id userId, user_name userName from user_tb where user_name like \"%\"#{userName}\"%\"")
	public List<UserBean> selectuser(UserBean userBean);
}
