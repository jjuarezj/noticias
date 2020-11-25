/**
 * 
 */
package com.noticias.mx.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.noticias.mx.dao.IRespuestasDAO;
import com.noticias.mx.mapper.RespuestaRowMapper;
import com.noticias.mx.model.noticias.Respuestas;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
@Repository
public class RespuestasDAO  implements IRespuestasDAO{
	
	/**
	 * Query para insertar una nota
	 */
	@Value("Select r.id_respuesta, r.respuesta, r.f_respuesta, u.id_usuario, u.usuario, cu.tipo_usuario\r\n" + 
			"from noticias.respuestas r\r\n" + 
			"join noticias.usuarios u on r.id_usuario = u.id_usuario\r\n" + 
			"join noticias.catalogo_usuarios cu on cu.id_catalogo_usuario  = u.id_catalogo_usuario\r\n" + 
			"where r.id_comentario = ?;")
	private String queryListaRespuestas;

	
	/**
	 * Instancia de JDBCTemplate para el acceso a la BD
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * Lista de respuestas por id del comentario
	 */
	@SuppressWarnings("deprecation")
	@Override
	public List<Respuestas> listaRespuestasByID(int id_comentario) {
		return jdbcTemplate.query(queryListaRespuestas,  new Object[] { id_comentario } ,new RespuestaRowMapper());
	}

}
