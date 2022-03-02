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

import com.ibm.academia.restapi.ip.modelo.dto.IpesDTO;
import com.ibm.academia.restapi.ip.modelo.entidad.Ipes;
import com.ibm.academia.restapi.ip.modelo.mapper.IpesMapper;
import com.ibm.academia.restapi.ip.modelo.servicios.IIpesService;

@RestController
@RequestMapping("/Ip")
public class IpesController
{
	private final static Logger logger = LoggerFactory.getLogger(IpesController.class);
	
	
	@Autowired
	private IIpesService iipesService;
	
	
	
	/**
	 * Enpoint para listar todos los paises con su numero de ip inicial
	 * @return Retorna una lista de Ipes
	 * @author Usuario 26/02/2022
	 */
	@GetMapping("/listar")
	public ResponseEntity<?> consultarTodosIps()
	{
		List<Ipes> ips = iipesService.buscarTodos();
				
					
		
		
		
		return new ResponseEntity<List<Ipes>>(ips,HttpStatus.OK);
		
	}
	
	/**
	 * Enpoint para saber de que pais es la ip su moneda y cambio de la misma
	 * @param ident parametro que identifica de que pais pertenece la ip
	 * @param num1 parametro del segundo valor de la ip
	 * @param num2 parametro del tercer valor de la ip
	 * @param num3 parametro del cuarto valor de la ip
	 * @return regresa la informacion del pais, iso , moneda y cambio de la respectiva ip
	 * @exception En caso de que falle la consulta
	 * @author Usuario 26/02/2022
	 * @throws Exception 
	 */
	@GetMapping("/ver-detalle/ip/{ident}.{num1}.{num2}.{num3}")
	public ResponseEntity<?> consultarDetalleIpes(@PathVariable Integer ident, @PathVariable Integer num1,@PathVariable Integer num2,@PathVariable Integer num3) throws Exception
	{
		
		Optional<Ipes> ips= null;
		
		

		try
		{
			ips = iipesService.buscarPorIdent(ident);
		}
		catch (Exception e) {
			logger.info(e.getMessage());
			throw e;
		}
		
		List<IpesDTO> ipesDTO = ips
				.stream()
				.map(IpesMapper::mapIpes)
				.collect(Collectors.toList());
		return new ResponseEntity<List<IpesDTO>>(ipesDTO,HttpStatus.OK);
	}
	
}
