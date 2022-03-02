package com.ibm.academia.restapi.ip.controladores;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.academia.restapi.ip.controladores.IpBlackController;
import com.ibm.academia.restapi.ip.modelo.dto.IpBlackDTO;
import com.ibm.academia.restapi.ip.modelo.entidad.IpBlack;
import com.ibm.academia.restapi.ip.modelo.mapper.IpBlackMapper;
import com.ibm.academia.restapi.ip.modelo.servicios.IIpBlackService;

@RestController
@RequestMapping("/IpBlack")
public class IpBlackController
{
	private final static Logger logger = LoggerFactory.getLogger(IpBlackController.class);
	
	
	@Autowired
	private IIpBlackService ipblack;
	
	
	
	
	/**
	 * Enpoint para ver que ip esta en blacklist
	 * @return Retorna una ip de la black list
	 * @author Usuario 26/02/2022
	 */
	@GetMapping("/BlackList/ip/{num1}.{num2}.{num3}.{num4}")
	public ResponseEntity<?> consultarTodosIps(@PathVariable Integer num1, @PathVariable Integer num2,@PathVariable Integer num3,@PathVariable Integer num4)
	{
		Optional<IpBlack> ips = null;
				
		try
		{
			ips = ipblack.buscarPorIp(num1,num2,num3,num4);
			
		}
		catch (Exception e) {
			logger.info(e.getMessage());
			throw e;
		}
		
		List<IpBlackDTO> ipesDTO = ips
				.stream()
				.map(IpBlackMapper::mapIpBlack)
				.collect(Collectors.toList());
	
					
		
		
		
		return new ResponseEntity<List<IpBlackDTO>>(ipesDTO,HttpStatus.OK);
		
	}
}
