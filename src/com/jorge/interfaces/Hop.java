package com.jorge.interfaces;

public interface Hop {
	
	//Se acceden de forma estática a ellos. No hace falta implementar la interfaz en la clase
	int MAXIMUM_DEPTH = 126;
	final static boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
	
	/* Es lo mismo que lo de arriba
	public static final int MAXIMUM_DEPTH = 126;
	public static final boolean UNDERWATER = true;
	public static final String TYPE = "Submersible";
	*/
	
	public int eatPlants(); //Método a sustituir (override) obligatoriamente en clase concreta Bunny.java
	
	public default String getName(){ //Método default, si en clase concreta no se sustituye (override) entonces se usaría este método
		return "Jamie";
	}
	
	static int getJumpHeight() { //Acceso estático dede cláse concreta. Clase concreta no necesitaría implementar esta interfaz
		return 8;
	}
}
