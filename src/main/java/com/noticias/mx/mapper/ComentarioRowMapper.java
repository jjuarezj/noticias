/**
 * 
 */
package com.noticias.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.noticias.mx.model.noticias.Comentarios;
import com.noticias.mx.model.noticias.Usuarios;
import com.noticias.mx.util.Utileria;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
public class ComentarioRowMapper implements RowMapper<Comentarios>{

	/**
	 * Metodo RowMapper Sobre-escrito para mapeo de los valores 
	 * de Comentarios 
	 * implementando el metodo mapRow
	 * 
	 * @param resultSet  - Objeto con los registros de comentarios obtenidos de la BD
	 * @param rowNum     - Numero de registros obtenidos
	 */
	@Override
	public Comentarios mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Comentarios cmResponse =new Comentarios();
		
		Usuarios usuResponse = new Usuarios();
		
		cmResponse.setId_comentario(rs.getInt(1));
		cmResponse.setComentario(rs.getString(2));
		cmResponse.setF_comentario(Utileria.fechaDiaHoraString(rs.getTimestamp(3)));
		
		usuResponse.setId_usuario(rs.getInt(4));
		usuResponse.setUsuario(rs.getString(5));
		usuResponse.setTipo_usuario(rs.getString(6));
		
		cmResponse.setUsuario(usuResponse);
		
		return cmResponse;
		
	}

}
