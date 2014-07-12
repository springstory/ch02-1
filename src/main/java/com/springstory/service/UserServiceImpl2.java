package com.springstory.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.springstory.dao.UserDao;

@Service
public class UserServiceImpl2 implements UserService {

	@Resource(name="userDao")
	private UserDao userDao;
	
	public String getHelloMessage() {
		return "안녕하세요 " + userDao.getUser("hamzang").getName();
	}
}
