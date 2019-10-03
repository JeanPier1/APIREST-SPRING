package com.app.bustamante.dao;

import java.util.List;

import com.app.bustamante.model.User;

public interface UserDao {

	User create(User us);
	
	User edit(User us);
	
	void delete(Object id);
	
	User find(Object id);
	
	List<User> findAll();
}
