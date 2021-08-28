/**
 * 
 */
package com.devpredator.tiendamusicalentities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Diego
 * Clase que contiene entidades de perfiles de usuarios
 */
@Entity
@Table(name = "rol") //El nombre de la tabla enfocada en la base de datos
public class Rol extends Common{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Para poder hacer la llave primaria de forma automatica
	@Column(name = "idRol") //Indicando el nombre del campo en la base de datos pero este @ no es obligatorio es opcional
	private Long idRol;
	
	@Column(name = "nombre", length = 45, nullable = false) //En la base de datos es un varchar de 45 y notnull
	private String nombre;

	/**
	 * @return the idRol
	 */
	public Long getIdRol() {
		return idRol;
	}

	/**
	 * @param idRol the idRol to set
	 */
	public void setIdRol(Long idRol) {
		this.idRol = idRol;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
