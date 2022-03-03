package com.ibm.academia.restapi.ip.servicios;


import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ibm.academia.restapi.ip.modelo.repositorios.IpesRepository;
import com.ibm.academia.restapi.ip.modelo.servicios.IIpesService;

@SpringBootTest
public class IpesServiceImplTest 
{
	@MockBean
	private IpesRepository ipesRepository;
	
	@Autowired
	private IIpesService ipesService;
	
	@Test
	void buscarTodos()
	{
		//When
		ipesService.buscarTodos();
		
		//Then
		verify(ipesRepository).findAll();
	}
	@Test
	void buscarPorId()
	{
		Integer num = 1;
		//When
		ipesService.buscarPorIdent(num);
		
		//Then
		verify(ipesRepository).buscarPorIdent(num);
	}
}