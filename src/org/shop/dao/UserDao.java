package org.shop.dao;


import java.util.List;


import org.shop.pojo.User;

public interface UserDao {
	User login(User user);
	int touser(User user);
	List findall(User user);
	int delete(int id);
	
	User findid(int id);
	int  userup(User user);

	
	
	
	
}
