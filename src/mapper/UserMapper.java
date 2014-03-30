package mapper;

import java.util.List;

import domain.User;

public interface UserMapper {
	
	public User getUser(String userId);
	
	public List<User> getUsersByForeach(String[] name);
}
