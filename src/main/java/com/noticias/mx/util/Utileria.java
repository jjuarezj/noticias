/**
 * 
 */
package com.noticias.mx.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version 1.0
 * @since 24 nov. 2020
 * @author jjuarezj
 *
 */
public class Utileria {
	
	/**
	 * Formato para fecha y horas
	 */
	public static final String FM_DATE_TIME = "dd-mm-yyyy HH:mm:ss";

	private Utileria() {
		super();
	}

	/**
	 * Metodo que permite convertir una fecha a String obteniendo solamente diay hora
	 * 
	 * 
	 * @param date - fecha a formatear
	 * @return {@link String} - dd-mm-yyyy HH:mm:ss de la fecha proporcionada
	 */
	public static String fechaDiaHoraString(Date date) {
		// Format para convertir a dd-mm-yyyy HH:mm:ss
		final SimpleDateFormat formatTime = new SimpleDateFormat(FM_DATE_TIME);

		// Se valida si la fecha no viene null
		if (date == null) {
			// si viene null se retorna la fecha de hoy
			return formatTime.format(new Date());
		}

		// return de la fecha formateada
		return formatTime.format(date);
	}
}
