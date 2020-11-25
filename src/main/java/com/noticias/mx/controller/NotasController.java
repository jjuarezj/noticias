/**
 * 
 */
package com.noticias.mx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.noticias.mx.model.Status;
import com.noticias.mx.model.noticias.Notas;
import com.noticias.mx.service.INotasService;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
@RestController
@RequestMapping ("/notas")
@CrossOrigin ("*")
public class NotasController {
	

	/**
	 * Constante de JSON
	 */
	private static final String JSON_PROD_CONS = "application/json;charset=UTF-8";
	
	/**
	 * Servicio para consultas de notas
	 */
	@Autowired
	private INotasService notasService;
	
	
	/**
	 * Metodo que lista toda las notas
	 * @return {@link List<Notas>} lista de respuesta
	 */
	@GetMapping (path = "/lista-notas", produces = JSON_PROD_CONS)
	public List<Notas> listaNotas() {
		List<Notas> lnotas=notasService.listaNotas();
	    return lnotas;
	}
	

	/**
	 * Metodo que registra una nota
	 * @param nota -Informacion de la nota
	 * @return {@link Status} objeto con respuesta de la accion
	 */
	@PostMapping(path = "/registra-nota/{id_usuario}",  consumes = JSON_PROD_CONS, produces = JSON_PROD_CONS)
	public Status registraNotas(@RequestBody Notas nota, @PathVariable(value="id_usuario") Integer id_usuario) {
		Status res= notasService.registraNota(nota, id_usuario);
		return res;
	}
	


}
