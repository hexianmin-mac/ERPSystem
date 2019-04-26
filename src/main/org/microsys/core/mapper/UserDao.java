package main.org.microsys.core.mapper;


import java.util.List;


import main.org.microsys.core.entity.User;

public interface UserDao {
	User login(User user);
	int touser(User user);
	List findall(User user);
	int delete(int id);
	User findid(int id);
	int  userup(User user);

	
	
	
	
}
