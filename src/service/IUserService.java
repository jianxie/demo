package service;


import java.util.List;

import domain.User;

public interface IUserService {
	public User getUser(String name);

	public List<User> getUsersByForeach(String [] name);
}
