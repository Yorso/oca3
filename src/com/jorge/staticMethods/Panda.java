package com.jorge.staticMethods;

public class Panda extends Bear {
	
	public static void eat() { //Este método oculta el método eat() en la clase padre (Bear)
		System.out.println("Panda bear is chewing");
	}
	
	/*
	public void sneeze() { // DOES NOT COMPILE: En el padre, este método está declarado STATIC y aquí, en el hijo, NO
		System.out.println("Panda bear sneezes quietly");
	}
	*/
	
	/*
	public static void hibernate() { // DOES NOT COMPILE: En el padre no está declarado como estático y aquí, en el hijo, SÍ
		System.out.println("Panda bear is going to sleep");
	}
	*/
		
	public static void main(String[] args) {
		Panda.eat();
	}
}
