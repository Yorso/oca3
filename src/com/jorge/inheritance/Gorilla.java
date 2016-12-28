package com.jorge.inheritance;

public class Gorilla extends Animal {
	//Haciendo referencia a los dos constructores que tiene Animal, su padre.
	//AL menos debe hacer referencia a uno de los constructores del padre
	
	public Gorilla(int age) {
		super(age, "Gorilla");
	}

	public Gorilla() {
		super(5);
	}
}
