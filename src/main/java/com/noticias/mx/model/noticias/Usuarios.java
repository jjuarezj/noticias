/**
 * 
 */
package com.noticias.mx.model.noticias;

import java.io.Serializable;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
public class Usuarios implements Serializable{

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 622735652727156269L;
	
	/**
	 * id del usuairo
	 */
	private int id_usuario;
	
	/**
	 * descripcion usuario
	 */
	private String usuario;
	
	
	/**
	 * tipo usuario
	 */
	private String tipo_usuario;

	/**
	 * @return the id_usuario
	 */
	public int getId_usuario() {
		return id_usuario;
	}

	/**
	 * @param id_usuario the id_usuario to set
	 */
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the tipo_usuario
	 */
	public String getTipo_usuario() {
		return tipo_usuario;
	}

	/**
	 * @param tipo_usuario the tipo_usuario to set
	 */
	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	
	
	

}
