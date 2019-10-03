package com.app.bustamante.dao;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.app.bustamante.model.TipoUser;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
@Transactional
public class TipoUserDaoTest {
	
	@Autowired
	private TipoUserDao tipoUserDao;

	@Test
	public void testCreate() {
		TipoUser tipo = new TipoUser();
		tipo.setIdUs(0);
		tipo.setCodigo("REG");
		tipo.setFeReg(new Date());
		tipo.setEstado(true);
		tipo.setNombre("REGISTRADOR");
		
		TipoUser tipo2 = tipoUserDao.create(tipo);
		System.out.println("Registrado..... "+tipo2.toString());
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
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		List<TipoUser> list = tipoUserDao.findAll();
		System.out.println("lista de "+list.size());
	}

}
