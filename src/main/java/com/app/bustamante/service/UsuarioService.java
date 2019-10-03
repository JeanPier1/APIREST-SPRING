package com.app.bustamante.service;

import java.util.List;

import com.app.bustamante.model.User;

public interface UsuarioService {

	User registrar(User us);
	
	User editar(User us);
	
	Boolean eliminar(Object id);
	
	User buscarxId(Object id);
	
	List<User> listarTodo();
	
	Integer calcularEdad(User us);
}
