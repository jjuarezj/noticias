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
public class Respuestas implements Serializable{

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 5682553902653975885L;
	
	
	/**
	 * id del registro
	 */
	private int id_respuesta;
	
	/**
	 * texto de respuesta
	 */
	private String respuesta;
	
	/**
	 * fecha de respuesta
	 */
	private String f_respuesta;
	
	/**
	 * usuario que realiza la respuesta
	 */
	private Usuarios usuario;

	/**
	 * @return the id_respuesta
	 */
	public int getId_respuesta() {
		return id_respuesta;
	}

	/**
	 * @param id_respuesta the id_respuesta to set
	 */
	public void setId_respuesta(int id_respuesta) {
		this.id_respuesta = id_respuesta;
	}

	/**
	 * @return the respuesta
	 */
	public String getRespuesta() {
		return respuesta;
	}

	/**
	 * @param respuesta the respuesta to set
	 */
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}


	/**
	 * @return the f_respuesta
	 */
	public String getF_respuesta() {
		return f_respuesta;
	}

	/**
	 * @param f_respuesta the f_respuesta to set
	 */
	public void setF_respuesta(String f_respuesta) {
		this.f_respuesta = f_respuesta;
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
