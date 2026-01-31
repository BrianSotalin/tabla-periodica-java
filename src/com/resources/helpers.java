package com.resources;

import java.util.ArrayList;
import java.util.List;

public class helpers {
	//colores para consola
	public static final String ANSI_BLUE = "\u001B[34m";
	
	//funcion para buscar por numero atomico
	public static void searchElementByNumberAtomic(int atomicNumber, java.util.List<Elemento> tablaPeriodica) {
	    // comprobamos que la tabla periodica no este vacia
	    if (!tablaPeriodica.isEmpty()) {
	    		        // restamos 1 al numero atomico para obtener el indice correcto
	    	Elemento e = tablaPeriodica.get(atomicNumber-1); 
	        
	       printConsole(e);
	    }
	}
	//funcion para buscar por nombre o simbolo  del elemento
	public static void searchByNameOrSymbol(String nombreBusqueda,List<Elemento> tablaPeriodica) {
		// recorremos la tabla periodica
	    for (Elemento e : tablaPeriodica) {
	        // Comparamos ignorando mayúsculas/minúsculas y espacios

	        if (e.getElement().equalsIgnoreCase(nombreBusqueda.trim()) || 
	                e.getSymbol().equalsIgnoreCase(nombreBusqueda.trim())) {
	        	 printConsole(e);
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
	
	//funcion para imprimir en consola los datos del elemento
	public static void printConsole(Elemento e) {
		 System.out.println("==========================================");
	        System.out.println("       DATOS COMPLETOS DEL ELEMENTO       ");
	        System.out.println("==========================================");
	        
	        // IDENTIFICACIÓN BÁSICA
	        System.out.println("1. Número Atómico: " + e.getAtomicNumber());
	        System.out.println("2. Elemento:       " + e.getElement());
	        System.out.println("3. Símbolo:        " + e.getSymbol());
	        System.out.println("4. Masa Atómica:   " + e.getAtomicMass());
	        
	        // COMPOSICIÓN SUBATÓMICA
	        System.out.println("5. Neutrones:      " + e.getNumberOfNeutrons());
	        System.out.println("6. Protones:       " + e.getNumberOfProtons());
	        System.out.println("7. Electrones:     " + e.getNumberOfElectrons());
	        
	        // UBICACIÓN
	        System.out.println("8. Periodo:        " + e.getPeriod());
	        System.out.println("9. Grupo:          " + e.getGroup());
	        System.out.println("10. Fase:          " + e.getPhase());
	        
	        // PROPIEDADES (BOOLEANAS)
	        System.out.println("11. Radiactivo:    " + e.isRadioactive());
	        System.out.println("12. Natural:       " + e.isNatural());
	        System.out.println("13. Metal:         " + e.isMetal());
	        System.out.println("14. No metal:      " + e.isNonmetal());
	        System.out.println("15. Metaloide:     " + e.isMetalloid());
	        
	        // PROPIEDADES QUÍMICAS
	        System.out.println("16. Tipo:          " + e.getType());
	        System.out.println("17. Radio Atómico: " + e.getAtomicRadius());
	        System.out.println("18. Electronegatividad: " + e.getElectronegativity());
	        System.out.println("19. 1ra Ionización: " + e.getFirstIonization());
	        
	        // PROPIEDADES FÍSICAS
	        System.out.println("20. Densidad:      " + e.getDensity());
	        System.out.println("21. Punto Fusión:  " + e.getMeltingPoint());
	        System.out.println("22. Punto Ebullición: " + e.getBoilingPoint());
	        System.out.println("23. Isótopos:      " + e.getNumberOfIsotopes());
	        
	        // HISTORIA
	        System.out.println("24. Descubridor:   " + e.getDiscoverer());
	        System.out.println("25. Año:           " + e.getYear());
	        
	        // ENERGÍA Y ELECTRONES
	        System.out.println("26. Calor Específico: " + e.getSpecificHeat());
	        System.out.println("27. Capas (Shells):   " + e.getNumberOfShells());
	        System.out.println("28. Valencia:         " + e.getNumberOfValence());
	        System.out.println("==========================================");
	}
}
