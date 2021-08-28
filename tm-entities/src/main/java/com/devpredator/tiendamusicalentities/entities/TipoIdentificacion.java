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
 * Clase que contiene entidades de tipos de identificacion de una persona o usuario.
 */

@Entity
@Table(name = "tipoidentificacion") //El nombre de la tabla enfocada en la base de datos
public class TipoIdentificacion extends Common{
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Para poder hacer la llave primaria de forma automatica
	@Column(name = "idTipoIdentificacion") // Identificando el nombre del campo en la base de datos pero este @ no es obligatorio es opcional
	private Long idTipoIdentificacion;
	
	@Column(name = "nombre", length = 45, nullable = false ) //En la base de datos es un varchar y notnull
	private String nombre;

	/**
	 * @return the idTipoIdentificacion
	 */
	public Long getIdTipoIdentificacion() {
		return idTipoIdentificacion;
	}

	/**
	 * @param idTipoIdentificacion the idTipoIdentificacion to set
	 */
	public void setIdTipoIdentificacion(Long idTipoIdentificacion) {
		this.idTipoIdentificacion = idTipoIdentificacion;
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
