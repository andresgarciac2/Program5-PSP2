package edu.uniandes.ecos.formater;

import java.util.ArrayList;
import java.util.List;

/**
 * @author andresgarcias4n
 * @since 17/03/2017
 * @version 0.0.1
 */
public class DataFormater {

	String[] data;
	
	/**
	 * Constructor
	 * 
	 * @param inputData
	 */
	public DataFormater(String inputData){
		data = inputData.split(",");
	}


	/**
	 * retorna los datos de entrada en un arreglo
	 * 
	 * @return data
	 */
	public String[] getData() {
		return data;
	}
	
	
}
