/**
 * 
 */
package com.devpredator.tiendamusicalservices.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devpredator.tiendamusicaldata.dao.ArtistaDAO;
import com.devpredator.tiendamusicalentities.dto.ArtistaAlbumDTO;
import com.devpredator.tiendamusicalservices.service.HomeService;

/**
 * @author Diego
 * 	Clase que implementa los metodos de negocio de la interface de HomService.
 *
 */
@Service
public class HomeServiceImpl implements HomeService {
	
	@Autowired
	private ArtistaDAO artistaDAOImpl;

	@Override
	public List<ArtistaAlbumDTO> consultarAlbumsFiltro(String filtro) {
		return this.artistaDAOImpl.consultarArtistasAlbumsPorFiltro(filtro);
	}

}
