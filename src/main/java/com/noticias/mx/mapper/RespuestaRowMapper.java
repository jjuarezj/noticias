/**
 * 
 */
package com.noticias.mx.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.noticias.mx.model.noticias.Respuestas;
import com.noticias.mx.model.noticias.Usuarios;
import com.noticias.mx.util.Utileria;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
public class RespuestaRowMapper implements RowMapper<Respuestas>{

	/**
	 * Metodo que permite mapper los resultados en BDs
	 */
	@Override
	public Respuestas mapRow(ResultSet rs, int rowNum) throws SQLException {
		Respuestas res=new Respuestas();
		
		Usuarios usuario = new Usuarios();
		
		res.setId_respuesta(rs.getInt(1));
		res.setRespuesta(rs.getString(2));
		res.setF_respuesta(Utileria.fechaDiaHoraString(rs.getTimestamp(3)));
		
		usuario.setId_usuario(rs.getInt(4));
		usuario.setUsuario(rs.getString(5));
		usuario.setTipo_usuario(rs.getString(6));
		
		res.setUsuario(usuario);
		
		
		return res;
	}

}
