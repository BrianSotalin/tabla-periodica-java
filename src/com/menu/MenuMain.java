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
		System.out.println("Pulse (0) para Salir");
		System.out.println("Indique la operación que desea realizar:");
		
		 entrada=  sc.nextInt();
		
        // Lógica de las operaciones
        switch (entrada) {
        
        case 1:
        	
        	System.out.println("*** Ingrese el numero atomico: **");
        	int numAtomico =  sc.nextInt();
        	helpers.searchElementByNumberAtomic(numAtomico, tablaPeriodica); 
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
