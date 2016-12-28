package com.jorge.inheritance2;

public class BactrianCamel extends Camel {
	//OVERRIDING O SUSTITUCIÖN
	
	/* int no puede ser, debe ser String, que es lo que devuelve este mismo método en el padre
	 * El método del hijo debe devolver o el mismo tipo o una subclase del tipo que devuelve el método del padre, pero no diferente
	protected int getNumberOfHumps() { // DOES NOT COMPILE: The return type is incompatible with Camel.getNumberOfHumps()
		return 2;
	}
	*/
	
	//protected, al poner private me da error: Cannot reduce the visibility of the inherited method from Camel
	//Es porque el método del hijo debe ser al menos tan accesible o más que el método del padre
	//El del padre es protected, luego el del hijo debe ser al menos protected o más amplio (public)
	protected String getNumberOfHumps() { // DOES NOT COMPILE: The return type is incompatible with Camel.getNumberOfHumps()
		return "2";
	}
	
	protected int getNumberOfHumps(int age) { // OJOOOOOOOOOOOOOOOO: Ésto es una SOBRECARGA - OVERLOADING
		return 2;
	}
}