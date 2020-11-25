/**
 * 
 */
package com.noticias.mx.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.noticias.mx.dao.INotasDAO;
import com.noticias.mx.mapper.NotaRowMapper;
import com.noticias.mx.model.noticias.Notas;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
@Repository
public class NotasDAO implements INotasDAO{
	
	
	/**
	 * Query para consultar las notas
	 */
	@Value("Select n.id_nota, n.titulo, n.resumen, n.f_publicacion, nu.id_usuario, nu.usuario, cu.tipo_usuario\r\n" + 
			"from notas n \r\n" + 
			"join usuarios nu on n.id_usuario = nu.id_usuario\r\n" + 
			"join catalogo_usuarios cu on cu.id_catalogo_usuario  = nu.id_catalogo_usuario;")
	private String queryListanotas;
	
	/**
	 * Query para insertar una nota
	 */
	@Value("INSERT INTO notas (titulo,resumen,id_usuario) VALUES (?,?,?);")
	private String queryRegistraNota;

	
	/**
	 * Instancia de JDBCTemplate para el acceso a la BD
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	

	@Override
	public List<Notas> listaNotas() {
		return jdbcTemplate.query(queryListanotas, new NotaRowMapper());
	}

	/**
	 * Metodo para registrar una nota
	 * 
	 * @param nota - Informacion de la nota
	 * @return {@link Integer} indica si se guardo el registro
	 */
	@Override
	public Integer registraNota(Notas nota, int id_usuario) {
		Object[] params = new Object[] { nota.getTitulo(), nota.getResumen(), id_usuario };
		return jdbcTemplate.update(queryRegistraNota, params);
	}

}
