package com.ibm.academia.restapi.ip.datos;

import com.ibm.academia.restapi.ip.modelo.entidad.Ipes;

public class DatosDummy
{
	public static Ipes ip01() 
	{
		return new Ipes(null, 1,"Estados Unidos","EUA","Dolar","Euro:1.12", null, null); 
	}
	public static Ipes ip02() 
	{
		return new Ipes(null, 2,"China","CHN","Yuan","Dolar:0.16", null, null); 
	}
	public static Ipes ip03() 
	{
		return new Ipes(null, 3,"Mexico","MEX","MXN","Dolar:1.12", null, null); 
	}
}
