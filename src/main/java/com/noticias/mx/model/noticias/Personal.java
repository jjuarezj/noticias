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
public class Personal implements Serializable{

	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 2774938448833254214L;
	
	/**
	 * id del registro
	 */
	private int id_personal;
	
	/**
	 * Apeido paterno del personal
	 */
	private String ape_paterno;
	
	/**
	 * Apeido materno del personal	
	 */
	private String ape_materno;

	/**
	 * Nombre del personal
	 */
	private String nombre; 

	/**
	 * Direccion o domicilio del personal
	 */
	private String direccion;
	
	/**
	 * Fecha en que ingreso el personal
	 */
	private String f_ingreso;


	/**
	 * @return the id_personal
	 */
	public int getId_personal() {
		return id_personal;
	}

	/**
	 * @param id_personal the id_personal to set
	 */
	public void setId_personal(int id_personal) {
		this.id_personal = id_personal;
	}

	/**
	 * @return the ape_paterno
	 */
	public String getApe_paterno() {
		return ape_paterno;
	}

	/**
	 * @param ape_paterno the ape_paterno to set
	 */
	public void setApe_paterno(String ape_paterno) {
		this.ape_paterno = ape_paterno;
	}

	/**
	 * @return the ape_materno
	 */
	public String getApe_materno() {
		return ape_materno;
	}

	/**
	 * @param ape_materno the ape_materno to set
	 */
	public void setApe_materno(String ape_materno) {
		this.ape_materno = ape_materno;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the f_ingreso
	 */
	public String getF_ingreso() {
		return f_ingreso;
	}

	/**
	 * @param f_ingreso the f_ingreso to set
	 */
	public void setF_ingreso(String f_ingreso) {
		this.f_ingreso = f_ingreso;
	}


	
	

}
