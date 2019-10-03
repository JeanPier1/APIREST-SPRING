package com.app.bustamante.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.app.bustamante.model.User;
import com.app.bustamante.service.UsuarioService;

public class UserDaoTest {
	
	@Mock
	private UserDao userMock;
	
	@InjectMocks
	private UsuarioService service;
	
	@Before
	public void beforeEach() {
		 MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testCreate() {
		User u = new User("Manuelito", "manuel@upeu.edu.pe");
		User ux = userMock.create(u);
		System.out.println("Objeto ");
		System.out.println("Objeto "+ux.toString());
		assertNotNull("Esta vacio..", ux);
		
	}

	@Test
	public void testEdit() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testFind() {
		long id = 1L;
		System.out.println(userMock.find(id).toString());
	}

	@Test
	public void testFindAll() {
		System.out.println(userMock.findAll());
	}

}
