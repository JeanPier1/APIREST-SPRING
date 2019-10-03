package com.app.bustamante.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.bustamante.model.User;
/**
 * CrudRepository
 * @author alum.fial8
 * CrudRepository tiene todos los metodos CRUD ya instanciados
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	//metodo personalizado
	List<User> findByName(String name);
}
