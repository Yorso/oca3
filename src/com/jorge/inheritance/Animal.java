package com.jorge.inheritance;

public class Animal {

	private int age;
	private String name;
	protected int numLegs;
	protected int numEyes;

	public Animal(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Animal(int age) {
		super();
		this.age = age;
		this.name = null;
	}

	protected int getAge() { // También puede ser public y default para que
							 // pueda ser vista desde su hijo, NO PRIVATE
		return age;
	}

	void setAge(int age) {//Visible SÓLO desde clases del mismo paquete. Si una clase es hijo de Animal y no está en el mismo paquete que Animal, NO LO VERÁ
		                  //No por ser hijo lo va a ver desde otro paquete diendo este método default. Tendríamos que cambiarloa protected o public
		this.age = age;
	}
	
	protected void setAge2(int age) {//Visible desde mismo paquete y desde sus hijos, aunque estén en distinto paquete a Animal, que es el padre
		this.age = age;
	}

}
