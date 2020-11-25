/**
 * 
 */
package com.noticias.mx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noticias.mx.dao.IRespuestasDAO;
import com.noticias.mx.model.noticias.Respuestas;
import com.noticias.mx.service.IRespuestasService;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
@Service
public class RespuestasService implements IRespuestasService{
	
	/**
	 * Instancia de objeto para el acceso a datos
	 */
	@Autowired
	private IRespuestasDAO respuestasDAO;

	@Override
	public List<Respuestas> listaRespuestasByID(int id_comentario) {
		List<Respuestas> lRespuesta= respuestasDAO.listaRespuestasByID(id_comentario);
		return lRespuesta;
	}

}
