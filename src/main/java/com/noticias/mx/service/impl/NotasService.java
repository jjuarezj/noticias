/**
 * 
 */
package com.noticias.mx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.noticias.mx.dao.INotasDAO;
import com.noticias.mx.model.Status;
import com.noticias.mx.model.StatusEnum;
import com.noticias.mx.model.noticias.Notas;
import com.noticias.mx.service.INotasService;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
@Service
public class NotasService implements INotasService{
	
	
	/**
	 * Instancia de objeto para el acceso a datos
	 */
	@Autowired
	private INotasDAO notasdao;

	@Override
	public List<Notas> listaNotas() {
		List<Notas> ltsNotas=notasdao.listaNotas(); 
		return ltsNotas;
	}
	

	/**
	 * Metodo para registrar las noticias
	 * 
	 * @param nota - Informacion de la nota
	 * @param id_usuario -id del usuaior
	 * @return {@link Status} clase response con informacion de la
	 *         accion
	 */
	@Override
	public Status registraNota(Notas nota, int id_usuario) {
		
		//Se instancia respuesta  con error
		Status msRegistra = new Status(StatusEnum.ERROR);
		
		//Se inserta la informacion
		int respuesta= notasdao.registraNota(nota, id_usuario);
		
		//Si respuesta es == 1 es correcto
		if(respuesta == 1 ) {
			msRegistra =  new Status(StatusEnum.ALTA_EXITOSA);
		}
		
		return msRegistra;
	}

}
