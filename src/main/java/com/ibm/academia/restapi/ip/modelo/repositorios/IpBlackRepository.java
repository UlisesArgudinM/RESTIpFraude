package com.ibm.academia.restapi.ip.modelo.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.ip.modelo.entidad.IpBlack;

@Repository
public interface IpBlackRepository extends PagingAndSortingRepository<IpBlack, Long>
{
	
	@Query("select ip from IpBlack ip where ip.num1 = ?1 and ip.num2=?2 and ip.num3=?3 and ip.num4=?4")
	public Optional<IpBlack> buscarPorIp(Integer num1,Integer num2 , Integer num3, Integer num4);
}

