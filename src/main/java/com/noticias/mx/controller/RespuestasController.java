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

import com.noticias.mx.model.noticias.Respuestas;
import com.noticias.mx.service.IRespuestasService;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
@RestController
@RequestMapping ("/respuestas")
@CrossOrigin ("*")
public class RespuestasController {
	
	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";
	
	/**
	 * Servicio para consultas de comentarios
	 */
	@Autowired
	private IRespuestasService respuestasService;
	
	
	/**
	 * Metodo que lista todos los comentarios
	 * @return {@link List} lista de respuesta
	 */
	@GetMapping (path = "/lista-respuestas/{id_comentario}", produces = JSON_PROD_CONS)
	public List<Respuestas> listaRespuestas(@PathVariable(value="id_comentario") Integer id_comentario) {
		List<Respuestas> lrespuesta=respuestasService.listaRespuestasByID(id_comentario);
	    return lrespuesta;
	}


}
