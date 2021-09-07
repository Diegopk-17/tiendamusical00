/**
 * 
 */
package com.devpredator.tiendamusicalweb.session;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.devpredator.tiendamusicalweb.utils.CommonUtils;

/**
 * @author Diego
 *	Clase que permite cerrar la sesion del usuario y redireccionar a la pantalla de login.
 */
@ManagedBean
@ViewScoped
public class SessionClosed {
	/**
	 * Metodo que permite cerrar la sesion del usuario.
	 */
	public void cerrarSesion() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			CommonUtils.redireccionar("/login.xhtml");
		} catch (IOException e) {
			CommonUtils.mostrarMensaje(FacesMessage.SEVERITY_ERROR, "UPS", "Hubo un problema al tratar de regresar al login, favor de intentar más tarde.");
			e.printStackTrace();
		}
	}
}
