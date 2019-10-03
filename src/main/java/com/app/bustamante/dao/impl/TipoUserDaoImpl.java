package com.app.bustamante.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.bustamante.dao.TipoUserDao;
import com.app.bustamante.model.TipoUser;

@Repository
@Transactional
public class TipoUserDaoImpl extends AbstractFacade<TipoUser> implements TipoUserDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public TipoUserDaoImpl() {
		super(TipoUser.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

}
