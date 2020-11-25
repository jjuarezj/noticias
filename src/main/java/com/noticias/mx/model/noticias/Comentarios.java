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
public class Comentarios implements Serializable{

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = -341500661648680198L;
	
	/**
	 * id del registro
	 */
	private int id_comentario;
	
	/**
	 * texto del comentario
	 */
	private String comentario;
	
	/**
	 * Fecha en la que se hizo el comentario
	 */
	private String f_comentario;
	
	
	
	
	/**
	 * Usuario que realiza el comentario
	 */
	private Usuarios usuario;
	

	/**
	 * @return the id_comentario
	 */
	public int getId_comentario() {
		return id_comentario;
	}

	/**
	 * @param id_comentario the id_comentario to set
	 */
	public void setId_comentario(int id_comentario) {
		this.id_comentario = id_comentario;
	}

	/**
	 * @return the comentario
	 */
	public String getComentario() {
		return comentario;
	}

	/**
	 * @param comentario the comentario to set
	 */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	/**
	 * @return the f_comentario
	 */
	public String getF_comentario() {
		return f_comentario;
	}

	/**
	 * @param f_comentario the f_comentario to set
	 */
	public void setF_comentario(String f_comentario) {
		this.f_comentario = f_comentario;
	}

	/**
	 * @return the usuario
	 */
	public Usuarios getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}



}
