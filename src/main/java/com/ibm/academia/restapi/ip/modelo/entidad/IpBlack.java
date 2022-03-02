package com.ibm.academia.restapi.ip.modelo.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

	@Setter
	@Getter
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity
	@Table(name = "ipblack")
	public class IpBlack implements Serializable
	{
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Positive(message = "Debe ser mayor a 0")
		@Column(name = "num1", nullable = false)
		private Integer num1;
		
		@Positive(message = "Debe ser mayor a 0")
		@Column(name = "num2", nullable = false)
		private Integer num2;
		
		@Positive(message = "Debe ser mayor a 0")
		@Column(name = "num3", nullable = false)
		private Integer num3;
		
		@Positive(message = "Debe ser mayor a 0")
		@Column(name = "num4", nullable = false)
		private Integer num4;
		
		
		@Column(name = "fecha_creacion", nullable = false)
		@Temporal(TemporalType.DATE)
		private Date fechaCreacion; 
		
		
		private static final long serialVersionUID = 2776003989098115948L;
}
