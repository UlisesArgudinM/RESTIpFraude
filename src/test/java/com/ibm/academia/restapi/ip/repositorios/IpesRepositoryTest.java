package com.ibm.academia.restapi.ip.repositorios;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.ibm.academia.restapi.ip.datos.DatosDummy;
import com.ibm.academia.restapi.ip.modelo.entidad.Ipes;
import com.ibm.academia.restapi.ip.modelo.repositorios.IpesRepository;

@DataJpaTest
public class IpesRepositoryTest 
{
	@Autowired
	private IpesRepository ipesRepository;
	
	@BeforeEach
	void setUp()
	{
		ipesRepository.save(DatosDummy.ip01());
		ipesRepository.save(DatosDummy.ip02());
		ipesRepository.save(DatosDummy.ip03());
	}
	@AfterEach
	void tearDown()
	{
		ipesRepository.deleteAll();
	}
	
	@Test
	@DisplayName("Test:lista todos los datos de las ipes")
	void buscarTodo()
	{
		//When
		List<Ipes> expected = (List<Ipes>)ipesRepository.findAll();
		
		assertThat(expected.size()== 3).isTrue();
	}
	
	@Test
	@DisplayName("Test:Busca de que region es la ip ingresada ")
	void BuscarIp()
	{
		//When
		Optional<Ipes> expected = (Optional<Ipes>) ipesRepository.buscarPorIdent(1);
		
		assertThat(expected.isPresent()).isTrue();
	}
}
