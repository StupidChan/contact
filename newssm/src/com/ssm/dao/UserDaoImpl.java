package com.ssm.dao;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import com.ssm.domain.User;
import com.ssm.mapper.UserMapper;
@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Resource(name="userMapper")
	private UserMapper userMapper;
	public UserMapper getUserMapper() {
		return userMapper;
	}
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	
	public User findUserByName(String username) {
		
		return userMapper.getUserByName(username);
	}

	public void Adduser(User user) {
		userMapper.addUser(user);
	}

	public User findUserById(Integer id){
		return userMapper.findUserById(id);
	}
	
	public void update(User user){
		userMapper.update(user);
	}
}
