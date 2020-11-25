/**
 * 
 */
package com.noticias.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noticias.mx.model.noticias.Comentarios;
import com.noticias.mx.service.IComentariosService;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
@RestController
@RequestMapping ("/comentarios")
@CrossOrigin ("*")
public class ComentariosController {
	
	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";
	
	/**
	 * Servicio para consultas de comentarios
	 */
	@Autowired
	private IComentariosService comentariosService;
	
	/**
	 * Metodo que lista todos los comentarios
	 * @return {@link List} lista de respuesta
	 */
	@GetMapping (path = "/lista-comentarios/{id_nota}", produces = JSON_PROD_CONS)
	public List<Comentarios> listaComentarios(@PathVariable(value="id_nota") Integer id_nota) {
		List<Comentarios> lcomentarios=comentariosService.listaCommentarioByID(id_nota);
	    return lcomentarios;
	}

}
