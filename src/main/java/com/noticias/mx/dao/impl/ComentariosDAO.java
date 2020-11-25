/**
 * 
 */
package com.noticias.mx.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.noticias.mx.dao.IComentariosDAO;
import com.noticias.mx.mapper.ComentarioRowMapper;
import com.noticias.mx.model.noticias.Comentarios;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
@Repository
public class ComentariosDAO implements IComentariosDAO{
	
	/**
	 * Query para insertar una nota
	 */
	@Value("Select c.id_comentario, c.comentario, c.f_comentario, u.id_usuario, u.usuario, cu.tipo_usuario\r\n" + 
			"from comentarios c \r\n" + 
			"join usuarios u on c.id_usuario = u.id_usuario\r\n" + 
			"join catalogo_usuarios cu on cu.id_catalogo_usuario  = u.id_catalogo_usuario\r\n" + 
			"where c.id_nota = ?;")
	private String queryListaComentarios;

	
	/**
	 * Instancia de JDBCTemplate para el acceso a la BD
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * Metodo que lista comentarios por el id de la nota
	 */
	@SuppressWarnings("deprecation")
	@Override
	public List<Comentarios> listaCommentarioByID(int id_nota) {
		return jdbcTemplate.query(queryListaComentarios,  new Object[] { id_nota } ,new ComentarioRowMapper());
	}

	
}
