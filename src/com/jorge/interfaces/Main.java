package com.jorge.interfaces;

public class Main {
	public static void main(String[] args) {
		System.out.println(Hop.getJumpHeight()); //Vemos que para acceder a un método estático de una interfaz, no hace falta implements
		
		new Bunny().printDetails(); //Llamamos a la clse Bunny que implementa Hop
		
		System.out.println(Hop.MAXIMUM_DEPTH); //Acceso a las constantes de la interfaz de forma estática
	}
}
