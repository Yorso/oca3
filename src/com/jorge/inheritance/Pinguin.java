package com.jorge.inheritance;

public class Pinguin extends Animal2{

	//Obligatorio sólo si en el padre no existe un constructor sion argumentos
	//Si existe, no haría falta hacer referencia a este constructor ya que esaríamos haciendo referencia
	//de forma automática al de sin argumentos
	//Pruébalo comentando este constructor y en la clase Animal2 comentando el constructor sin argumentos,
	//dará un error
	public Pinguin(int age) {
		super(age); //Es más, si existe un constructor sin argumentos en el padre, no haría falta poner esta linea super()
		              //en este constructor con argumentos, el de sin argumentos llamado automáticamente desde aquí ya llamaría a super()
					  //Si comentas el constructor por defecto en el padre, te pedirá que mtas la instruccion super() en este constructor
		// TODO Auto-generated constructor stub
	}
	
	public Pinguin(int age, int age2) {
		super(age, age2); //Es más, si existe un constructor sin argumentos en el padre, no haría falta poner esta linea super()
		              //en este constructor con argumentos, el de sin argumentos llamado automáticamente desde aquí ya llamaría a super()
					  //Si comentas el constructor por defecto en el padre, te pedirá que mtas la instruccion super() en este constructor
		// TODO Auto-generated constructor stub
	}

}
