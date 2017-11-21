package com.ssm.service;

import com.ssm.domain.User;

public interface UserService {
	
	public User checkLogin(String username,String password);
	
	public User checkInsert(String username);
	
	public void Add(User user);
	
	public User findUserById(Integer id);
	
	public void update(User user);
}
