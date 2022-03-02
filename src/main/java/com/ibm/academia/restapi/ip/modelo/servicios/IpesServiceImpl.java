package com.ibm.academia.restapi.ip.modelo.servicios;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.restapi.ip.excepciones.NotFoundException;
import com.ibm.academia.restapi.ip.modelo.entidad.Ipes;
import com.ibm.academia.restapi.ip.modelo.repositorios.IpesRepository;

@Service
public class IpesServiceImpl implements IIpesService
{	
	@Autowired
	private IpesRepository ipesRepository;
	

	@Override
	@Transactional(readOnly = true)
	public List<Ipes> buscarTodos() 
	{
		
		return (List<Ipes>) ipesRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Ipes> buscarPorIdent(Integer ident) {
		
		Optional<Ipes> ips = ipesRepository.buscarPorIdent(ident);
		
		if(!ips.isPresent())
			throw new NotFoundException(String.format("La ipe no existe", ident));
		
		return ips;
	}

	
	
}
