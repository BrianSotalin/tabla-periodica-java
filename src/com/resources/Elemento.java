package com.resources;

public class Elemento {
	
	    // Definición de los 28 campos
	    private int atomicNumber;
	    private String element;
	    private String symbol;
	    private double atomicMass;
	    private int numberOfNeutrons;
	    private int numberOfProtons;
	    private int numberOfElectrons;
	    private int period;
	    private int group;
	    private String phase;
	    private boolean radioactive;
	    private boolean natural;
	    private boolean metal;
	    private boolean nonmetal;
	    private boolean metalloid;
	    private String type;
	    private double atomicRadius;
	    private double electronegativity;
	    private double firstIonization;
	    private double density;
	    private double meltingPoint;
	    private double boilingPoint;
	    private int numberOfIsotopes;
	    private String discoverer;
	    private String year;
	    private double specificHeat;
	    private int numberOfShells;
	    private int numberOfValence;

	    // Constructor que procesa el array de Strings del CSV
	    public Elemento(String[] row) {
	    	// Asignación de cada campo, con manejo de posibles valores vacíos
	        this.atomicNumber = Integer.parseInt(row[0].trim());
	        this.element = row[1].trim();
	        this.symbol = row[2].trim();
	        this.atomicMass = parseDouble(row[3]);
	        this.numberOfNeutrons = Integer.parseInt(row[4].trim());
	        this.numberOfProtons = Integer.parseInt(row[5].trim());
	        this.numberOfElectrons = Integer.parseInt(row[6].trim());
	        this.period = Integer.parseInt(row[7].trim());
	        this.group = row[8].isEmpty() ? 0 : Integer.parseInt(row[8].trim());
	        this.phase = row[9].trim();
	        this.radioactive = row[10].equalsIgnoreCase("yes");
	        this.natural = row[11].equalsIgnoreCase("yes");
	        this.metal = row[12].equalsIgnoreCase("yes");
	        this.nonmetal = row[13].equalsIgnoreCase("yes");
	        this.metalloid = row[14].equalsIgnoreCase("yes");
	        this.type = row[15].trim();
	        this.atomicRadius = parseDouble(row[16]);
	        this.electronegativity = parseDouble(row[17]);
	        this.firstIonization = parseDouble(row[18]);
	        this.density = parseDouble(row[19]);
	        this.meltingPoint = parseDouble(row[20]);
	        this.boilingPoint = parseDouble(row[21]);
	        this.numberOfIsotopes = row[22].isEmpty() ? 0 : Integer.parseInt(row[22].trim());
	        this.discoverer = row[23].trim();
	        this.year = row[24].trim();
	        this.specificHeat = parseDouble(row[25]);
	        this.numberOfShells = Integer.parseInt(row[26].trim());
	        this.numberOfValence = row[27].isEmpty() ? 0 : Integer.parseInt(row[27].trim());
	    }

	    // Método auxiliar para evitar errores con celdas vacías o datos numéricos mal formados
	    private double parseDouble(String value) {
	    	// Si el valor es nulo o vacío, retornamos 0.0
	        if (value == null || value.trim().isEmpty()) return 0.0;
	        // Intentamos parsear el valor, si falla retornamos 0.0
	        try {
	            return Double.parseDouble(value.trim());
	        } catch (NumberFormatException e) {
	            return 0.0;
	        }
	    }


	    
	 // --- IDENTIFICACIÓN ---
	    public int getAtomicNumber() { return atomicNumber; }
	    public String getElement() { return element; }
	    public String getSymbol() { return symbol; }
	    public String getType() { return type; }
	    public String getPhase() { return phase; }

	    // --- PROPIEDADES NUCLEARES ---
	    public double getAtomicMass() { return atomicMass; }
	    public int getNumberOfNeutrons() { return numberOfNeutrons; }
	    public int getNumberOfProtons() { return numberOfProtons; }
	    public int getNumberOfElectrons() { return numberOfElectrons; }
	    public int getNumberOfIsotopes() { return numberOfIsotopes; }

	    // --- UBICACIÓN EN TABLA ---
	    public int getPeriod() { return period; }
	    public int getGroup() { return group; }
	    public int getNumberOfShells() { return numberOfShells; }
	    public int getNumberOfValence() { return numberOfValence; }

	    // --- CLASIFICACIÓN (BOOLEANOS) ---
	    public boolean isRadioactive() { return radioactive; }
	    public boolean isNatural() { return natural; }
	    public boolean isMetal() { return metal; }
	    public boolean isNonmetal() { return nonmetal; }
	    public boolean isMetalloid() { return metalloid; }

	    // --- PROPIEDADES FÍSICAS ---
	    public double getAtomicRadius() { return atomicRadius; }
	    public double getDensity() { return density; }
	    public double getMeltingPoint() { return meltingPoint; }
	    public double getBoilingPoint() { return boilingPoint; }
	    public double getSpecificHeat() { return specificHeat; }

	    // --- PROPIEDADES QUÍMICAS ---
	    public double getElectronegativity() { return electronegativity; }
	    public double getFirstIonization() { return firstIonization; }

	    // --- HISTORIA ---
	    public String getDiscoverer() { return discoverer; }
	    public String getYear() { return year; }

	    @Override
	    public String toString() {
	        return String.format("Elemento [%s | %s]: Z=%d, Masa=%.2f, Tipo=%s", 
	                symbol, element, atomicNumber, atomicMass, type);
	    }
	}


