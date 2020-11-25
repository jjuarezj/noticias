/**
 * 
 */
package com.noticias.mx.dao;

import java.util.List;

import com.noticias.mx.model.noticias.Notas;

/**
 * INotasDAO:
 * 
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 */
public interface INotasDAO {
	
	/**
	 * Metodo que obtiene una lista de notas registradas
	 * @return {@link List} Lista de notas consultadas
	 */
	List<Notas> listaNotas();
	
	/**
	 * Metodo para registrar una nota
	 * @param nota - Informacion del nota a insertar
	 * @param id_usuario - id del usuairo que crea la nota
	 * @return {@link Integer} indica si se inserto el registro
	 */
	Integer registraNota(Notas nota, int id_usuario);
	

}
