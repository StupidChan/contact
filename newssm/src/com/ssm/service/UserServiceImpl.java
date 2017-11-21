package com.ssm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UserDao;
import com.ssm.domain.User;
@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
	public User checkLogin(String username, String password) {
		User user=userDao.findUserByName(username);
		if(user!=null&&user.getPassword().equals(password)){
			return user;
		}
		return null;
	}
	
	public void Add(User user) {
		userDao.Adduser(user);
	}
	
	public User findUserById(Integer id) {
		return userDao.findUserById(id);
	}
	public void update(User user) {
		userDao.update(user);
	}
	
	public User checkInsert(String username) {
		return userDao.findUserByName(username);
	}


}
