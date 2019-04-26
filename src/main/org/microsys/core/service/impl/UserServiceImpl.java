package main.org.microsys.core.service.impl;



import main.org.microsys.core.mapper.UserDao;

import main.org.microsys.core.entity.User;
import main.org.microsys.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao UserService;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return UserService.login(user);
	}

	@Override
	public int touser(User user) {
		// TODO Auto-generated method stub
		return UserService.touser(user);
	}

	@Override
	public List findall(User user ) {
		// TODO Auto-generated method stub
		return UserService.findall(user);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return UserService.delete(id);
	}

	@Override
	public User findid(int id) {
		// TODO Auto-generated method stub
		return UserService.findid(id);
	}

	@Override
	public int userup(User user) {
		// TODO Auto-generated method stub
		return UserService.userup(user);
	}

	
	
}
