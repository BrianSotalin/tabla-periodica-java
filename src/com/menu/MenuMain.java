package com.menu;

import java.util.List;
import com.resources.Elemento;
import com.resources.cargarCSV;

public class MenuMain {

	public static void main(String[] args) {
		
		List<Elemento> tablaPeriodica = cargarCSV.cargarDatosDesdeCSV("tabla_periodica.csv");

	    // 2. Imprimimos el primer elemento si la lista no está vacía
	    if (!tablaPeriodica.isEmpty()) {
	        Elemento primero = tablaPeriodica.get(0);
	        
	        System.out.println("\n--- DATOS DEL PRIMER ELEMENTO ---");
	        System.out.println("Nombre: " + primero.getElement());
	        System.out.println("Símbolo: " + primero.getSymbol());
	        System.out.println("Número Atómico: " + primero.getAtomicNumber());
	        System.out.println("Masa Atómica: " + primero.getAtomicMass());
	        System.out.println("Descubridor: " + primero.getDiscoverer());
	        System.out.println("---------------------------------");
	    }

	}
}
