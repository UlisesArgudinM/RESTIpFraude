package com.ibm.academia.restapi.ip.modelo.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.ip.modelo.entidad.Ipes;

@Repository
public interface IpesRepository extends PagingAndSortingRepository<Ipes, Long>
{
	@Query("select p from Ipes p where p.ident = ?1")
	public Optional<Ipes> buscarPorIdent(Integer ident);
}
