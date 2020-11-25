/**
 * 
 */
package com.noticias.mx.dao;

import java.util.List;

import com.noticias.mx.model.noticias.Comentarios;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
public interface IComentariosDAO {
	
	/**
	 * Metodo que obtiene una lista de comentarios por ID
	 * @param id_nota - id del registro a buscar
	 * @return {@link List} Lista de comentarios consultados
	 */
	List<Comentarios> listaCommentarioByID(int id_nota);

}
