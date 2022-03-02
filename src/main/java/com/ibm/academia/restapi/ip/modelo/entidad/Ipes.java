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
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ipfraudes")
public class Ipes implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Positive(message = "Debe ser mayor a 0")
	@Column(name = "ident", nullable = false)
	private Integer ident;
	
	@NotEmpty(message = "No puede ser vacio")
	@NotNull(message = "No puede ser nulo")
	@Size(min = 3, max = 100)
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@NotEmpty(message = "No puede ser vacio")
	@NotNull(message = "No puede ser nulo")
	@Size(min = 3, max = 100)
	@Column(name = "iso", nullable = false)
	private String iso;
	
	@NotEmpty(message = "No puede ser vacio")
	@NotNull(message = "No puede ser nulo")
	@Size(min = 3, max = 100)
	@Column(name = "moneda", nullable = false)
	private String moneda;
	
	@NotEmpty(message = "No puede ser vacio")
	@NotNull(message = "No puede ser nulo")
	@Size(min = 3, max = 100)
	@Column(name = "cambio", nullable = false)
	private String cambio;
	
	@Column(name = "fecha_creacion", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion; 
	
	@Transient
	private Integer puerto;
	
	
	
	
	
	private static final long serialVersionUID = 8043504394944809866L;

}
