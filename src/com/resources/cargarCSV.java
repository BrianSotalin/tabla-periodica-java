package com.resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class cargarCSV {
	public static List<Elemento> cargarDatosDesdeCSV(String rutaArchivo) {
		// Lista para almacenar los elementos cargados
        List<Elemento> listaEnMemoria = new ArrayList<>();
        // Variable para almacenar cada línea leída
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            // Saltamos la línea de encabezados
            br.readLine(); 

            while ((linea = br.readLine()) != null) {
                // El límite -1 es para que no ignore celdas vacías al final

            	String[] columnas = linea.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                // Verificamos que la línea tenga datos (mínimo las columnas clave)
                if (columnas.length >= 28) {
                	// Creamos un nuevo objeto Elemento y lo añadimos a la lista
                    Elemento e = new Elemento(columnas);
                    // Añadimos el elemento a la lista en memoria
                    listaEnMemoria.add(e);
                }
            }
            // Confirmación de carga exitosa
            System.out.println("o Se cargaron " + listaEnMemoria.size() + " elementos del archivo .csv");
            
        } catch (IOException e) {
        	// Manejo de errores de E/S
            System.err.println("XXX Error al leer el archivo: " + e.getMessage()+" XXX");
        } catch (Exception e) {
        	// Manejo de otros errores, como formato incorrecto
            System.err.println("XXX Error de formato en los datos: " + e.getMessage()+" XXX");
        }
// Devolvemos la lista de elementos cargados
        return listaEnMemoria;
    }

}
