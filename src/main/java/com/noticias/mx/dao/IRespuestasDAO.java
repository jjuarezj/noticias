/**
 * 
 */
package com.noticias.mx.dao;

import java.util.List;

import com.noticias.mx.model.noticias.Respuestas;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
public interface IRespuestasDAO {
	
	/**
	 * Metodo que obtiene una lista de respuestas por ID
	 * @param id_comentario - id del registro a buscar
	 * @return {@link List} Lista de resultados consultados
	 */
	List<Respuestas> listaRespuestasByID(int id_comentario);

}
