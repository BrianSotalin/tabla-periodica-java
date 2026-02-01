package com.menu;

import java.util.List;
import java.util.Scanner;

import com.resources.*;

/************************************************************
* Nombre1: Marco Antonio VERGAS RODRIGUEZ
* DNI1: 66666666-T
* Nombre2: Braian Daniel Sotalin Pillajo
* DNI2: 53748117-S
* Asignatura: Fundamentos de Programación
* Actividad 6: Proyecto final: La tabla periódica
* Última modificación: 01/02/2026
************************************************************/

public class MenuMain {

	public static void main(String[] args) {
		// Creamos el scanner para leer la entrada del usuario
		Scanner sc = new Scanner(System.in);
		// Variable para almacenar la entrada del usuario
		int entrada;
		// Cargamos los datos del CSV en una lista de Elemento
		List<Elemento> tablaPeriodica = cargarCSV.cargarDatosDesdeCSV("tabla_periodica.csv");
		// Creamos una instancia de helpers para usar sus métodos
		List<Elemento> listAux;
		
		do {
		
		System.out.println("***** Menu Tabla Periodica *****");
		System.out.println("1. Buscar por numero atomico");
		System.out.println("2. Buscar por nombre o simbolo del Elemento");
		System.out.println("3. Listar todos los radioactivos");
		System.out.println("4. Listar todos los naturales");
		System.out.println("5. Listar todos los metales");
		System.out.println("6. Listar todos los no metales");
		System.out.println("7. Listar todos los metaloides");
		System.out.println("8. Listar todos los sólidos (solid)");
		System.out.println("9. Listar todos los líquidos (liq)");
		System.out.println("10. Listar todos los gases (gas)");
		System.out.println("11. Listar todos los artificiales (artificial)");
		System.out.println("12. Buscar por año de descubrimiento");
		System.out.println("Pulse (0) para Salir");
		System.out.println("Indique la operación que desea realizar:");
		// Leemos la entrada del usuario
		 entrada=  sc.nextInt();
		
        // Lógica de las operaciones
        switch (entrada) {
        
        case 1:
        	
        	System.out.println("*** Ingrese el numero atomico: ***");
        	int numAtomico =  sc.nextInt();
        	//buscamos el elemento por numero atomico
        	helpers.searchElementByNumberAtomic(numAtomico, tablaPeriodica); 
        	break;
        case 2:
        	Scanner name = new Scanner(System.in);
        	System.out.println("*** Ingrese el nombre del Elemento: ***");
        	String nameElement =  name.nextLine();
        	//buscamos el elemento por nombre o simbolo
        	helpers.searchByNameOrSymbol(nameElement,tablaPeriodica); 
        	break;
        case 3:
        	System.out.println("*** Listado de todos los metales: ***");
        	//creamos la lista de elementos radioactivos
        	listAux = helpers.searchByType("radioactive",tablaPeriodica);
			//recorremos la lista y mostramos los elementos
			for (Elemento e : listAux) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
			    System.out.printf("#: %-3d | %-15s | %-5s | Tipo: %-15s%n", 
			        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getType());
			}
			System.out.println("Total de elementos radioactivos: " + listAux.size());
			break;	
        case 4:
        	System.out.println("*** Listado de todos los naturales: ***");
        	//creamos la lista de elementos naturales
			listAux = helpers.searchByType("natural",tablaPeriodica);
			//recorremos la lista y mostramos los elementos
			for (Elemento e : listAux) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
			    System.out.printf("#: %-3d | %-15s | %-5s | Tipo: %-15s%n", 
			        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getType());
			}
			System.out.println("Total de elementos naturales: " + listAux.size());
			break;		
        case 5:
        	System.out.println("*** Listado de todos los metales: ***");
        	//creamos la lista de elementos metales
        	listAux = helpers.searchByType("metal",tablaPeriodica);
			//recorremos la lista y mostramos los elementos
			for (Elemento e : listAux) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
			    System.out.printf("#: %-3d | %-15s | %-5s | Tipo: %-15s%n", 
			        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getType());
			}
			 System.out.println("Total de elementos metales: " + listAux.size());
			break;
        case 6:
        	System.out.println("*** Listado de todos los no metales: ***");
        	//creamos la lista de elementos no metales
        	listAux = helpers.searchByType("nonmetal",tablaPeriodica);
			//recorremos la lista y mostramos los elementos
			for (Elemento e : listAux) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
			    System.out.printf("#: %-3d | %-15s | %-5s | Tipo: %-15s%n", 
			        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getType());
			}
			System.out.println("Total de elementos no metales: " + listAux.size());
			break;	
        case 7:
        	System.out.println("*** Listado de todos los metaloides: ***");
        	//creamos la lista de elementos metaloides
        	listAux = helpers.searchByType("metalloid",tablaPeriodica);
			//recorremos la lista y mostramos los elementos
			for (Elemento e : listAux) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
			    System.out.printf("#: %-3d | %-15s | %-5s | Tipo: %-15s%n", 
			        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getType());
			}
			System.out.println("Total de elementos metaloides: " + listAux.size());
			break;		
        case 8:
        	System.out.println("*** Listado de todos los  sólidos: ***");
        	//creamos la lista de elementos metaloides
			listAux = helpers.searchByFilter("phase","solid",tablaPeriodica);
			//recorremos la lista y mostramos los elementos
			for (Elemento e : listAux) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
				System.out.printf("%-3d | %-15s | %-5s | Masa: %-8.2f%n", 
				        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getAtomicMass());
			}
			System.out.println("Total de elementos sólidos: " + listAux.size());
			break;	
        case 9:
        	System.out.println("*** Listado de todos los  líquidos: ***");
        	//creamos la lista de elementos metaloides
        	listAux = helpers.searchByFilter("phase","liq",tablaPeriodica);
			//recorremos la lista y mostramos los elementos
			for (Elemento e : listAux) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
				System.out.printf("%-3d | %-15s | %-5s | Masa: %-8.2f%n", 
				        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getAtomicMass());
			}
			System.out.println("Total de elementos líquidos: " + listAux.size());
			break;	
        case 10:
        	System.out.println("*** Listado de todos los  gases: ***");
        	//creamos la lista de elementos metaloides
			listAux = helpers.searchByFilter("phase","gas",tablaPeriodica);
			//recorremos la lista y mostramos los elementos
			for (Elemento e : listAux) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
				System.out.printf("%-3d | %-15s | %-5s | Masa: %-8.2f%n", 
				        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getAtomicMass());
			}
			System.out.println("Total de elementos gases: " + listAux.size());
			break;	
        case 11:
        	System.out.println("*** Listado de todos los  artificiales: ***");
        	//creamos la lista de elementos metaloides
        	listAux = helpers.searchByFilter("phase","artificial",tablaPeriodica);
			//recorremos la lista y mostramos los elementos
			for (Elemento e : listAux) {
				// el %-3d al principio sirve  para el número atómico (3 espacios, alineado a la izquierda)
				System.out.printf("%-3d | %-15s | %-5s | Masa: %-8.2f%n", 
				        e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getAtomicMass());
			}
			System.out.println("Total de elementos artificiales: " + listAux.size());
			break;	
        case 12:
			Scanner year = new Scanner(System.in);
			System.out.println("*** Ingrese el año de descubrimiento: ***");
			String yearElement =  year.nextLine();
			listAux = helpers.searchByFilter("year",yearElement,tablaPeriodica); 
			if (listAux.isEmpty()) {
			    System.out.println("No se encontraron elementos descubiertos en el año: " + yearElement);
			} else {
			    for (Elemento e : listAux) {
			        System.out.printf("%-3d | %-15s | %-5s | Descubridor: %-15s%n", 
			            e.getAtomicNumber(), e.getElement(), e.getSymbol(), e.getDiscoverer());
			    }
			    System.out.println("Total de elementos descubiertos en  " + listAux.size());
			}
			
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
