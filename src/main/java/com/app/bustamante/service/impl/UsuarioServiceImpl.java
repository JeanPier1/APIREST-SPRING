package com.app.bustamante.service.impl;

import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.bustamante.dao.UserDao;
import com.app.bustamante.model.User;
import com.app.bustamante.service.UsuarioService;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

	private static final Logger logger = LogManager.getLogger(UsuarioServiceImpl.class);
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User registrar(User us) {
		try {
			return userDao.create(us);
		} catch (Exception e) {
			//e.printStackTrace();
			logger.error("UsuarioServiceImpl.registrar ", e);
			return null;
		}
	}

	@Override
	public User editar(User us) {
		try {
			return userDao.edit(us);
		} catch (Exception e) {
			logger.error("UsuarioServiceImpl.editar ", e);
			return null;
		}
	}

	@Override
	public Boolean eliminar(Object id) {
		try {
			userDao.delete(id);
			return true;
		} catch (Exception e) {
			logger.error("UsuarioServiceImpl.eliminar ", e);
			return false;
		}
	}

	@Override
	public User buscarxId(Object id) {
		return userDao.find(id);
	}

	@Override
	public List<User> listarTodo() {
		//return userDao.findAll();
		try {
			return userDao.findAll();
		} catch (Exception e) {
			logger.error("UsuarioServiceImpl.listarTodo ", e);
			return Collections.emptyList();
		}
	}

	@Override
	public Integer calcularEdad(User us) {

		return null;
	}

}
