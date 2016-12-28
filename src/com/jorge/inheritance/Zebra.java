package com.jorge.inheritance;

public class Zebra extends Animal {
	//Por huevos hay que llamar al constructor del padre (super())
	public Zebra(int age) {
		super(age);//Llama al constructor del padre (Animal)
	}

	public Zebra() {//Constructor de Zebra
		this(4); //Llama a constructor de arriba, el cual llama al del padre
	}
	
	/* No compila: super(), al igual que this(), debe ser la primera instruccuión dentro del constructor
	 * Si comentamos la linea super(a + b) y sólo dejamos  "System.out.println("Zoo created");" nos salta otro error:
	 * 		Implicit super constructor Animal() is undefined for default constructor. Must define an explicit constructor
	 * Siempre hay que hacer referencia en los constructores de los hijos al constructor del padre o
	 * a un constructor propio que haga referencia a otro constructor propio y este al super(), como los dos de arriba
	public Zebra(int a, int b) {
		System.out.println("Zoo created");
		//super(a + b); // DOES NOT COMPILE
	}
	*/
}
