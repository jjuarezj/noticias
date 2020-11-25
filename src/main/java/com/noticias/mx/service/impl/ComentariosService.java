/**
 * 
 */
package com.noticias.mx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noticias.mx.dao.IComentariosDAO;
import com.noticias.mx.model.noticias.Comentarios;
import com.noticias.mx.service.IComentariosService;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
@Service
public class ComentariosService implements IComentariosService{
	
	/**
	 * Instancia de objeto para el acceso a datos
	 */
	@Autowired
	private IComentariosDAO comentariosDAO;
	

	@Override
	public List<Comentarios> listaCommentarioByID(int id_nota) {
		List<Comentarios> lcomentarios = comentariosDAO.listaCommentarioByID(id_nota);
		return lcomentarios;
	}

}
