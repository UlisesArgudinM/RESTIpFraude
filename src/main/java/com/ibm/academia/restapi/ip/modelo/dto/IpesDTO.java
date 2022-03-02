package com.ibm.academia.restapi.ip.modelo.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IpesDTO implements Serializable
{
	
	private String nombre;
	private String iso;
	private String moneda;
	private String cambio;
	
	
	private static final long serialVersionUID = 6146304473598377043L;
}
