package com.jorge.exceptions;

public class Snake extends Reptile {
	protected boolean hasLegs() {//OK: el padre lanza excepción y el hijo no lanza ninguna, está permitido
		return false;
	}

	protected double getWeight() throws InsufficientDataException { //OK: el padre lanza una excepciónmás amplia o general que la que
		                                                            //está lanzando el hijo, está permitido
		return 2;
	}
	
	/*
	protected double getHeight() throws Exception { // DOES NOT COMPILE: El hijo está lanzando una excepción más amplia o general
		                                            //que la que lanza el padre, NO está permitido
		return 2;
	}
	*/

	/*
	protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE: El padre NO lanza excepción y el hijo SÍ lanza,
		                                                         //eso NO está permitido
		return 10;
	}
	*/
}
