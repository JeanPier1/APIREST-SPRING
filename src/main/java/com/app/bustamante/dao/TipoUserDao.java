package com.app.bustamante.dao;

import java.util.List;

import com.app.bustamante.model.TipoUser;

public interface TipoUserDao {
	
	TipoUser create(TipoUser us);
	
	TipoUser edit(TipoUser us);
	
	void delete(Object id);
	
	TipoUser find(Object id);
	
	List<TipoUser> findAll();
}
