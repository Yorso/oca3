package com.jorge.inheritance2;

import com.jorge.inheritance.Animal;

public class Tiger extends Animal {
	
	private int numEars = 2;
	private int numEyes = 2;
	
	//Si variable o método sólo existe en padre, acceso con this y super... Si existe en padre e hijo, acceso a padre con super, acceso a hijo con this
	//Implicit super constructor Animal() is undefined for default constructor. Must define an explicit constructor
	public Tiger(int age) {//Llama al constructor del padre (super())
		super(age);
		this.numLegs = 4; //Podemos hacer referencia con this a una variable protected o public del padre. A una private o default no
		                  //A una default no porque no estamos en el mismo paquete que el padre

		super.numLegs = 5; //También podemos usar super en vez de this para referirnos a la variable del padre

		this.numEars = 2;//Referencia a una variable local de Tiger (hijo)
		
		//super.numEars = 3; //Esto no se puede, numEars es variable de Tiger(hijo) y no de Animal(padre)
		
		this.numEyes = 3;//Acceso a variable local de Tiger(hijo)
		super.numEyes = 4;//Acceso a variable de Animal(padre)
	}

	private void roar() {
		//No hace falta instanciar la clase de la que hereda (Animal)
		System.out.println("The " + getAge() + " year old lion says: Roar!");
		setAge2(2);
		
		//System.out.println("The " + age + " year old lion says: Roar!"); //NO COMPILE
	}
	
}
