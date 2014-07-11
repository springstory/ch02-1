package com.springstory.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springstory.dao.UserDao;

@Service
public class UserServiceImpl2 implements UserService {

	@Resource(name="userDao")
	private UserDao userDao;
	
	public String getHelloMessage() {
		return "æ»≥Á«œººø‰2 " + userDao.getUser("hamzang").getName();
	}
}
