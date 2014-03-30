package service.impl;

import java.util.List;

import mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.User;

import service.IUserService;

@Service("userService")
public class UserService implements IUserService {
	@Autowired
	private UserMapper userMapper;
	
	public User getUser(String name){
		return userMapper.getUser(name);
		
	}

	public List<User> getUsersByForeach(String[] name) {
		// TODO Auto-generated method stub
		return userMapper.getUsersByForeach(name);
	}
}
