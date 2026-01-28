package com.resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class cargarCSV {
	public static List<Elemento> cargarDatosDesdeCSV(String rutaArchivo) {
        List<Elemento> listaEnMemoria = new ArrayList<>();
        String linea;
        // Usamos \t si es un TSV (separado por tabulaciones) o , si es CSV
        //String separador = ","; 

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            // Saltamos la línea de encabezados
            br.readLine(); 

            while ((linea = br.readLine()) != null) {
                // El límite -1 es para que no ignore celdas vacías al final
               // String[] columnas = linea.split(separador, -1);
            	// Cambia tu línea de split por esta:
            	String[] columnas = linea.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                
               
                
                // Verificamos que la línea tenga datos (mínimo las columnas clave)
                if (columnas.length >= 28) {
                    Elemento e = new Elemento(columnas);
                    listaEnMemoria.add(e);
                }
            }
            System.out.println("✅ Se cargaron " + listaEnMemoria.size() + " elementos del archivo .csv");
            
        } catch (IOException e) {
            System.err.println("❌ Error al leer el archivo: " + e.getMessage());
        } catch (Exception e) {
        	System.err.println("❌ Error en la línea: " + listaEnMemoria.size()  );
            System.err.println("❌ Error de formato en los datos: " + e.getMessage());
        }

        return listaEnMemoria;
    }

}
