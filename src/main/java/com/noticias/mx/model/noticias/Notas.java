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
public class Notas implements Serializable{

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 2814722218996153190L;
	
	/**
	 * id de la nota
	 */
	private int id_nota;
	
	/**
	 * titulo de la nota
	 */
	private String titulo;
	
	/**
	 * resumen de la nota
	 */
	private String resumen;
	
	/**
	 * fecha de publicacion de la nota
	 */
	private String f_publicacion;
	
	/**
	 * usuario que creo la nota
	 */
	private Usuarios usuario;

	/**
	 * @return the id_nota
	 */
	public int getId_nota() {
		return id_nota;
	}

	/**
	 * @param id_nota the id_nota to set
	 */
	public void setId_nota(int id_nota) {
		this.id_nota = id_nota;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	

	/**
	 * @return the f_publicacion
	 */
	public String getF_publicacion() {
		return f_publicacion;
	}

	/**
	 * @param f_publicacion the f_publicacion to set
	 */
	public void setF_publicacion(String f_publicacion) {
		this.f_publicacion = f_publicacion;
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
