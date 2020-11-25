/**
 * 
 */
package com.noticias.mx.model;

import java.io.Serializable;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
public class Status implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1442984880678352367L;
	
	
	/**
	 * Codigo de respuesta
	 */
	private  String code;
	
	/**
	 * Mensaje de respuesta
	 */
    private  String message;
    
    
    
    
    

	/**
	 * @param code
	 * @param message
	 */
	public Status(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	
	
	/**
	 * @param code
	 * @param message
	 */
	public Status(StatusEnum statusEnum) {
		super();
		this.code = statusEnum.getCode();
		this.message = statusEnum.getMessage();
	}

	

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
    
    
    

}
