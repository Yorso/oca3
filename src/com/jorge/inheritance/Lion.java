package com.jorge.inheritance;

public class Lion extends Animal {
	
	//Implicit super constructor Animal() is undefined for default constructor. Must define an explicit constructor
	public Lion(int age) {//Llama al constructor del padre (super())
		super(age);
		
		this.numLegs = 4;//Podemos hacer referencia con this a una variable public, default o protected del padre. A una private no.
						 //A una default sí porque estamos en el mismo paquete que el padre
	}

	private void roar() {
		//No hace falta instanciar la clase de la que hereda (Animal)
		System.out.println("The " + getAge() + " year old lion says: Roar!");
		this.setAge(2);
		super.setAge(2);
		//System.out.println("The " + age + " year old lion says: Roar!"); //NO COMPILE
	}
	
}
