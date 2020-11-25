/**
 * 
 */
package com.noticias.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.noticias.mx.model.noticias.Notas;
import com.noticias.mx.model.noticias.Usuarios;
import com.noticias.mx.util.Utileria;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
public class NotaRowMapper implements RowMapper<Notas>{
	
	

	/**
	 * Metodo RowMapper Sobre-escrito para mapeo de los valores 
	 * de Notas 
	 * implementando el metodo mapRow
	 * 
	 * @param resultSet  - Objeto con los registros de notas obtenidos de la BD
	 * @param rowNum     - Numero de registros obtenidos
	 */
	@Override
	public Notas mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Notas notasResponse=new Notas();
		
		Usuarios usuResponse = new Usuarios();
		
		
		notasResponse.setId_nota(rs.getInt(1));
		notasResponse.setTitulo(rs.getString(2));
		notasResponse.setResumen(rs.getString(3));
		notasResponse.setF_publicacion(Utileria.fechaDiaHoraString(rs.getTimestamp(4)));
		
		usuResponse.setId_usuario(rs.getInt(5));
		usuResponse.setUsuario(rs.getString(6));
		usuResponse.setTipo_usuario(rs.getString(7));
		
		notasResponse.setUsuario(usuResponse);
		
		return notasResponse;
	}

}
