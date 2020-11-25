/**
 * 
 */
package com.noticias.mx.service;

import java.util.List;

import com.noticias.mx.model.Status;
import com.noticias.mx.model.noticias.Notas;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
public interface INotasService {
	
	/**
	 * Metodo para obtener la lista de notas
	 * @return {@link List} con la informaicion de notas
	 */
	List<Notas> listaNotas();
	
	/**
	 * Metodo para registar una nota
	 * @param nota -Informacion de la nota
	 * @return {@link Status} con la informaicion del registro
	 */
	Status registraNota(Notas nota, int id_usuario);

}
