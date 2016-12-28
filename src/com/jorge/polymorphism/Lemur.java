package com.jorge.polymorphism;

/*
 * Java supports polymorphism, the property of an object to take on many different forms.
 *  
 * A Java object may be accessed using:
 * 		a reference with the same type as the object
 * 		a reference that is a superclass of the object
 * 		a reference that defines an interface the object implements , either directly or through a superclass. 
 * 
 * Furthermore, a cast is not required if the object is being reassigned to a super type or interface of the object.
 * 
 */
public class Lemur extends Primate implements HasTail {
	
	public boolean isTailStriped() { //Obligatorio a implementar por culpa de la interfaz HasTail
		return false;
	}

	public int age = 10;

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		//System.out.println(hasTail.age); // DOES NOT COMPILE: the reference hasTail has direct access only to methods defi ned with
										   // the HasTail interface; therefore, it doesn’t know the variable age is part of the object
		
		Primate primate = lemur;
		System.out.println(primate.hasHair());
		//System.out.println(primate.isTailStriped()); // DOES NOT COMPILE: the reference primate has access only to methods defi ned in the Primate class,
													   // and it doesn’t have direct access to the isTailStriped() method.
		
		//CASTING OBJECTS
		Primate primate2 = lemur;
		//Lemur lemur2 = primate2; // DOES NOT COMPILE: Hay que hacerle un casting, como hacemos abajo
		Lemur lemur3 = (Lemur)primate2;
		System.out.println(lemur3.age); //Tenemos acceso a las propiedades y métodos de Lemur pero tb a hasHair() de Primate
	}
}
