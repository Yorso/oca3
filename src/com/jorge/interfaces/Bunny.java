package com.jorge.interfaces;

public class Bunny implements Hop, Herbivore, Omnivore { //Realmente no haría falta implementar Hop para acceder a los métodos estáticos de una interfaz
	
	public void printDetails() {
		System.out.println(Hop.getJumpHeight());
		System.out.println(getName());
		System.out.println(eatPlants());
		//System.out.println(eatGreenPlants()); //No compila por llamarse igual en 2 interfaces y tener distinto tipo de retorno
	}

	/* 
	 * No compilan por llamarse igual en 2 interfaces y tener distinto tipo de retorno
	 * Si tuvieran mismo tipo de retorno entonces SÍ sería permitido
	 */
	@Override
	public int eatGreenPlants() { //método de Herbivore
		return 0;
	}
	
	@Override
	public void eatGreenPlants() { //método de Omnivore
	}
	
	/*@Override
	public String getName(){ //Método default en la interfaz, aquí lo sustituímos pero no es obligatorio
		return "John";
	}*/
}
