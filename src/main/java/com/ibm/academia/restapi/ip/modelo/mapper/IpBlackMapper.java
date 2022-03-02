package com.ibm.academia.restapi.ip.modelo.mapper;

import com.ibm.academia.restapi.ip.modelo.dto.IpBlackDTO;
import com.ibm.academia.restapi.ip.modelo.entidad.IpBlack;

public class IpBlackMapper 
{
		public static IpBlackDTO mapIpBlack(IpBlack ipBlack)
		{
			IpBlackDTO ipBlackDTO = new IpBlackDTO();
			ipBlackDTO.setNum1(ipBlack.getNum1());
			ipBlackDTO.setNum2(ipBlack.getNum2());
			ipBlackDTO.setNum3(ipBlack.getNum3());
			ipBlackDTO.setNum4(ipBlack.getNum4());
			
			return ipBlackDTO;
			
		}
}
