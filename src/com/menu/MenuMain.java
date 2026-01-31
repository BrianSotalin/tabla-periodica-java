package com.menu;

import java.util.List;
import java.util.Scanner;

import com.resources.*;



public class MenuMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int entrada;
		
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
			List<Elemento> radioactive = helpers.searchByType("radioactive",tablaPeriodica);
			for (Elemento e : radioactive) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
			    System.out.printf("#: %-3d | %-15s | %-5s | Tipo: %-15s%n", 
			        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getType());
			}
			System.out.println("Total de elementos radioactivos: " + radioactive.size());
			break;	
        case 4:
        	System.out.println("*** Listado de todos los naturales: ***");
			List<Elemento> natural = helpers.searchByType("natural",tablaPeriodica);
			for (Elemento e : natural) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
			    System.out.printf("#: %-3d | %-15s | %-5s | Tipo: %-15s%n", 
			        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getType());
			}
			System.out.println("Total de elementos naturales: " + natural.size());
			break;		
        case 5:
        	System.out.println("*** Listado de todos los metales: ***");
			List<Elemento> metales = helpers.searchByType("metal",tablaPeriodica);
			for (Elemento e : metales) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
			    System.out.printf("#: %-3d | %-15s | %-5s | Tipo: %-15s%n", 
			        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getType());
			}
			 System.out.println("Total de elementos metales: " + metales.size());
			break;
        case 6:
        	System.out.println("*** Listado de todos los no metales: ***");
			List<Elemento> nonmetal = helpers.searchByType("nonmetal",tablaPeriodica);
			for (Elemento e : nonmetal) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
			    System.out.printf("#: %-3d | %-15s | %-5s | Tipo: %-15s%n", 
			        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getType());
			}
			System.out.println("Total de elementos no metales: " + nonmetal.size());
			break;	
        case 7:
        	System.out.println("*** Listado de todos los metaloides: ***");
			List<Elemento> metalloid = helpers.searchByType("metalloid",tablaPeriodica);
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
		}while(entrada!=0);
        sc.close();

       
	}
}
