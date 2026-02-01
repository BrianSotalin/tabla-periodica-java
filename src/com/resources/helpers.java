package com.resources;

import java.util.ArrayList;
import java.util.List;

public class helpers {
	
	//funcion para buscar por numero atomico
	public static void searchElementByNumberAtomic(int atomicNumber, List<Elemento> tablaPeriodica) {
	    // comprobamos que la tabla periodica no este vacia
	    if (!tablaPeriodica.isEmpty()) {
	    // restamos 1 al numero atomico para obtener el indice correcto
	    	Elemento e = tablaPeriodica.get(atomicNumber-1); 
	        System.out.println(e);
	      
	    }
	}
	//funcion para buscar por nombre o simbolo  del elemento
	public static void searchByNameOrSymbol(String nombreBusqueda,List<Elemento> tablaPeriodica) {
		// recorremos la tabla periodica
	    for (Elemento e : tablaPeriodica) {
	        // Comparamos ignorando mayúsculas/minúsculas y espacios

	        if (e.getElement().equalsIgnoreCase(nombreBusqueda.trim()) || 
	                e.getSymbol().equalsIgnoreCase(nombreBusqueda.trim())) {
	        	 System.out.println(e);
	            }
	    }
	   
	}
	
	//funcion para buscar por tipo de elemento
	public static List<Elemento> searchByType( String type,List<Elemento> tablaPeriodica) {
		//lista para almacenar los elementos filtrados
		List<Elemento> filtrados = new ArrayList<>();
	    //recorremos la tabla periodica
	    for (Elemento e : tablaPeriodica) {
	    	//filtramos por tipo
	    	switch (type.toLowerCase()) {
	    	//segun el tipo, comprobamos la propiedad correspondiente
	        case "radioactive":
	        	//si es radioactivo, lo añadimos a la lista
	            if (e.isRadioactive()) {
	                filtrados.add(e);
	            }
	            break;
	        case "natural":
	        	//si es natural, lo añadimos a la lista
	            if (e.isNatural()) {
	                filtrados.add(e);
	            }
	            break;
	        case "metal":
	        	//si es metal, lo añadimos a la lista
	            if (e.isMetal()) {
	                filtrados.add(e);
	            }
	            break;
	        case "nonmetal":
	        	//si es no metal, lo añadimos a la lista
	            if (e.isNonmetal()) {
	                filtrados.add(e);
	            }
	            break;
	        case "metalloid":
	        	//si es metaloide, lo añadimos a la lista
	            if (e.isMetalloid()) {
	                filtrados.add(e);
	            }
	            break;
	        default:
	            // Tipo no reconocido, no se ñade nada a la lista 
	            break;
	    	}

	    }
	    return filtrados;
	}
	//funcion para buscar por filtro especifico
	public static List<Elemento> searchByFilter(String filterType,String filter,List<Elemento> tablaPeriodica) {
		//lista para almacenar los elementos filtrados
	    List<Elemento> filtrados = new ArrayList<>();
	    //recorremos la tabla periodica
	    for (Elemento e : tablaPeriodica) {
	    	//filtramos por el tipo de filtro
	    	switch(filterType.toLowerCase()){
	    	//segun el tipo de filtro, comprobamos la propiedad correspondiente
	    	//filtro fase
	    	case "phase":
	    		// Usamos trim() y equalsIgnoreCase por seguridad
		        if (e.getPhase().trim().equalsIgnoreCase(filter)) {
		        	// Si la fase coincide, añadimos el elemento a la lista filtrada
		            filtrados.add(e);
		        }
	    		break;
	    		//filtro por tipo año
    		case "year":
    		// Usamos trim para limpiar espacios y comparamos como String
	        if (e.getYear().trim().equals(filter)) {
	            filtrados.add(e);
	        }
    		break;
    	    default:
	    		// Tipo de filtro no reconocido
	    		break;
    	}

	    }
	    return filtrados;
	}
	

}
