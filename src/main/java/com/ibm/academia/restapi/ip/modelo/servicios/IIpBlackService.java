package com.ibm.academia.restapi.ip.modelo.servicios;

import java.util.Optional;

import com.ibm.academia.restapi.ip.modelo.entidad.IpBlack;

public interface IIpBlackService
{
	public Optional<IpBlack> buscarPorIp(Integer num1,Integer num2, Integer num3, Integer num4);
}
