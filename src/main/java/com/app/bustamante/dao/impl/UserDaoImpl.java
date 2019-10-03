package com.app.bustamante.dao.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.bustamante.dao.UserDao;
import com.app.bustamante.model.User;

@Repository
public class UserDaoImpl extends AbstractFacade<User> implements UserDao {

	@Autowired
	private EntityManager entityManage;
	
	public UserDaoImpl() {
		super(User.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManage;
	}
	
}
