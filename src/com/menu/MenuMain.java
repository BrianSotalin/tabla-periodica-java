package com.menu;

import java.util.List;
import java.util.Scanner;

import com.resources.*;



public class MenuMain {

	public static void main(String[] args) {
		// Creamos el scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		// Variable para almacenar la entrada del usuario
		int entrada;
		// Cargamos los datos del CSV en una lista de Elemento
		List<Elemento> tablaPeriodica = cargarCSV.cargarDatosDesdeCSV("tabla_periodica.csv");
		
		do {
		
		System.out.println("***** Menu Tabla Periodica *****");
		System.out.println("1. Buscar por numero atomico");
		System.out.println("2. Buscar por nombre o simbolo del Elemento");
		System.out.println("3. Listar todos los radioactivos");
		System.out.println("4. Listar todos los naturales");
		System.out.println("5. Listar todos los metales");
		System.out.println("6. Listar todos los no metales");
		System.out.println("7. Listar todos los metaloides");
		System.out.println("Pulse (0) para Salir");
		System.out.println("Indique la operación que desea realizar:");
		// Leemos la entrada del usuario
		 entrada=  sc.nextInt();
		
        // Lógica de las operaciones
        switch (entrada) {
        
        case 1:
        	
        	System.out.println("*** Ingrese el numero atomico: ***");
        	int numAtomico =  sc.nextInt();
        	helpers.searchElementByNumberAtomic(numAtomico, tablaPeriodica); 
        	break;
        case 2:
        	Scanner name = new Scanner(System.in);
        	System.out.println("*** Ingrese el nombre del Elemento: ***");
        	String nameElement =  name.nextLine();
        	helpers.searchByNameOrSymbol(nameElement,tablaPeriodica); 
        	break;
        case 3:
        	System.out.println("*** Listado de todos los metales: ***");
        	//creamos la lista de elementos radioactivos
			List<Elemento> radioactive = helpers.searchByType("radioactive",tablaPeriodica);
			//recorremos la lista y mostramos los elementos
			for (Elemento e : radioactive) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
			    System.out.printf("#: %-3d | %-15s | %-5s | Tipo: %-15s%n", 
			        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getType());
			}
			System.out.println("Total de elementos radioactivos: " + radioactive.size());
			break;	
        case 4:
        	System.out.println("*** Listado de todos los naturales: ***");
        	//creamos la lista de elementos naturales
			List<Elemento> natural = helpers.searchByType("natural",tablaPeriodica);
			//recorremos la lista y mostramos los elementos
			for (Elemento e : natural) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
			    System.out.printf("#: %-3d | %-15s | %-5s | Tipo: %-15s%n", 
			        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getType());
			}
			System.out.println("Total de elementos naturales: " + natural.size());
			break;		
        case 5:
        	System.out.println("*** Listado de todos los metales: ***");
        	//creamos la lista de elementos metales
			List<Elemento> metales = helpers.searchByType("metal",tablaPeriodica);
			//recorremos la lista y mostramos los elementos
			for (Elemento e : metales) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
			    System.out.printf("#: %-3d | %-15s | %-5s | Tipo: %-15s%n", 
			        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getType());
			}
			 System.out.println("Total de elementos metales: " + metales.size());
			break;
        case 6:
        	System.out.println("*** Listado de todos los no metales: ***");
        	//creamos la lista de elementos no metales
			List<Elemento> nonmetal = helpers.searchByType("nonmetal",tablaPeriodica);
			//recorremos la lista y mostramos los elementos
			for (Elemento e : nonmetal) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
			    System.out.printf("#: %-3d | %-15s | %-5s | Tipo: %-15s%n", 
			        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getType());
			}
			System.out.println("Total de elementos no metales: " + nonmetal.size());
			break;	
        case 7:
        	System.out.println("*** Listado de todos los metaloides: ***");
        	//creamos la lista de elementos metaloides
			List<Elemento> metalloid = helpers.searchByType("metalloid",tablaPeriodica);
			//recorremos la lista y mostramos los elementos
			for (Elemento e : metalloid) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
			    System.out.printf("#: %-3d | %-15s | %-5s | Tipo: %-15s%n", 
			        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getType());
			}
			System.out.println("Total de elementos metaloides: " + metalloid.size());
			break;		
        case 0:
        	
        	System.out.println("*** Sistema finalizado **");
        	
        	break;	
        default:
        	System.out.println("Operación no valida");	
        }
        //final del do-while
		}while(entrada!=0);
		//cerramos el scanner
        sc.close();

       
	}
}
