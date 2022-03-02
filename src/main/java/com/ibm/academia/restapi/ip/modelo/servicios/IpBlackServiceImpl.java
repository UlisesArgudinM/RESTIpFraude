package com.ibm.academia.restapi.ip.modelo.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.academia.restapi.ip.excepciones.NotFoundException;
import com.ibm.academia.restapi.ip.modelo.entidad.IpBlack;
import com.ibm.academia.restapi.ip.modelo.repositorios.IpBlackRepository;

@Service
public class IpBlackServiceImpl implements IIpBlackService
{
	@Autowired
	private IpBlackRepository ipBlackRepository;

	

	@Override
	@Transactional(readOnly = true)
	public Optional<IpBlack> buscarPorIp(Integer num1, Integer num2, Integer num3, Integer num4) {
		
		
		Optional<IpBlack> ip = ipBlackRepository.buscarPorIp(num1, num2, num3, num4);
		
		if(!ip.isPresent())
			throw new NotFoundException(String.format("La ip:"+ num1 +"." + num2 +"."+ num3+ "."+ num4 + " no esta en lista negra"));
		return ip;
	}




}
