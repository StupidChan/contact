package com.ssm.mapper;

import com.ssm.domain.User;

public interface UserMapper {
	public User getUserByName(String username);
	
	
	public void addUser(User user);
	
	public User findUserById(Integer id);
	
	public void update(User user);
}
