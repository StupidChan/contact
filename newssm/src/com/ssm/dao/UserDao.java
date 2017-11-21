package com.ssm.dao;

import com.ssm.domain.User;

public interface UserDao {

	public User findUserByName(String username) ;
	
	public User findUserById(Integer id);
	
	public void Adduser(User user);
	
	public void update(User user);
}
