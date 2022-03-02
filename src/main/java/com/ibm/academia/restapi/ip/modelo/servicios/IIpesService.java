package com.ibm.academia.restapi.ip.modelo.servicios;

import java.util.List;
import java.util.Optional;

import com.ibm.academia.restapi.ip.modelo.entidad.Ipes;

public interface IIpesService 
{
	public List<Ipes> buscarTodos();
	public Optional<Ipes> buscarPorIdent(Integer ident);
}
