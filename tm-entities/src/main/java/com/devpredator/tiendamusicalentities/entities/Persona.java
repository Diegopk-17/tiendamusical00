/**
 * 
 */
package com.devpredator.tiendamusicalentities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Diego
 * Clase que representa entidades de personas que manejan el aplicativo.
 */

@Entity
@Table(name = "persona") //El nombre de la tabla enfocada en la base de datos
public class Persona extends Common{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Para poder hacer la llave primaria de forma automatica
	@Column(name = "idPersona") //Identificando el nombre del campo en la base de datos pero este @ no es obligatorio es opcional
	private Long idPersona;
	
	@Column(name = "numeroIdentificacion", length = 12, nullable = false) //En la base de datos es varchar y notnull
	private String numeroIdentificacion;
	
	@Column(name = "nombre", length = 100, nullable = false) //En la base de datos es varchar y notnull
	private String nombre;
	
	@Column(name = "primerApellido", length = 100, nullable = false) //En la base de datos es varchar y notnull
	private String primerApellido;
	
	@Column(name = "segundoApellido", length = 45, nullable = false) //En la base de datos es varchar y notnull
	private String segundoApellido;
	
	@Column(name = "imagen", length = 100) //En la base de datos es varchar, esta es en caso de que queramos agregarle al usuario una imagen tipo logo
	private String imagen;										//Aqui se guardara el nombre de la imagen y la ruta será especificada en otro lugar
	
	@ManyToOne(fetch = FetchType.EAGER) //Tipo de relacion muchos a uno y tipo de consulta fetch hace que cuando generemos un select automaticamente genera otro select para la tabla tipoIdentificacion
	@JoinColumn(name = "idTipoIdentificacion") //A partir de que columna se enlaza con esta tabla, es decir la llave primaria de esta clase
	private TipoIdentificacion tipoIdentificacion; //Como es una relacion a esta tabla el dato lo sacaremos de su clase
	
	@Column(name = "usuario", length = 45, nullable = false) //En la base de datos es varchar y notnull
	private String usuario;
	
	@Column(name = "password", length = 45, nullable = false) //En la base de datos es varchar y notnull
	private String password;
	
	@ManyToOne(fetch = FetchType.EAGER) //Tipo de relacion muchos a uno y tipo de consulta fetch hace que cuando generemos un select automaticamente genera otro select para la tabla tipoIdentificacion
	@JoinColumn(name = "idRol") //A partir de que columna se enlaza con esta tabla, es decir la llave primaria de esta clase
	private Rol rol;			//Como es una relacion a esta tabla el dato lo sacaremos de su clase

	/**
	 * @return the idPersona
	 */
	public Long getIdPersona() {
		return idPersona;
	}

	/**
	 * @param idPersona the idPersona to set
	 */
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	/**
	 * @return the numeroIdentificacion
	 */
	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	/**
	 * @param numeroIdentificacion the numeroIdentificacion to set
	 */
	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
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

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the imagen
	 */
	public String getImagen() {
		return imagen;
	}

	/**
	 * @param imagen the imagen to set
	 */
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	/**
	 * @return the tipoIdentificacion
	 */
	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	/**
	 * @param tipoIdentificacion the tipoIdentificacion to set
	 */
	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the rol
	 */
	public Rol getRol() {
		return rol;
	}

	/**
	 * @param rol the rol to set
	 */
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	
}
