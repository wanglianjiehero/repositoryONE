package com.xhhy.dao;

import java.util.List;

import org.apache.ibatis.annotations.SelectProvider;

import com.xhhy.domain.User;
import com.xhhy.util.MySqlProvider;

public interface UserDao {
	@SelectProvider(method="listUser",type=MySqlProvider.class)
	public List<User> listUser(User user);
}
