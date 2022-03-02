package com.ibm.academia.restapi.ip.modelo.mapper;

import com.ibm.academia.restapi.ip.modelo.dto.IpesDTO;
import com.ibm.academia.restapi.ip.modelo.entidad.Ipes;

public class IpesMapper 
{
	public static IpesDTO mapIpes(Ipes ips)
	{
		IpesDTO ipesDTO = new IpesDTO();
		ipesDTO.setNombre(ips.getNombre());
		ipesDTO.setIso(ips.getIso());
		ipesDTO.setMoneda(ips.getMoneda());
		ipesDTO.setCambio(ips.getCambio());
		return ipesDTO;
	}
}
