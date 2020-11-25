/**
 * 
 */
package com.noticias.mx.model;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
public enum StatusEnum {
	
	//Consulta Exitosa
	CONS_EXITOSA("0", "Consulta Exitosa"),
	//Consulta Exitosa sin Datos
	DATOS_NO_ENCONTRADOS("1","Datos no encontrados"),
	//LA informacion se dio de Alta exitosamente
	ALTA_EXITOSA("2","Se registro correctamente"),
	//La informacion se actualizo correctamente
	ACT_EXITOSA("3","Se actualizo correctamente"),
	//El registro se elimino correctamente
	ELI_EXITOSA("4","Se elimino correctamente"),
	//Ocurrio un error en el back
	ERROR("5","Ocurrió un problema al ejecutar la operación, intente más tarde");
	
	/**
	 * Codigo de respuesta
	 */
	private final String code;
	
	/**
	 * Mensaje de respuesta
	 */
    private final String message;
    
    /**
     * Constructor de  la clase enum
     * @param code
     * @param message
     */
    StatusEnum(String code, String message) {
    	this.code = code;
        this.message = message;
	}
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

    
    

}
