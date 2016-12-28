package com.jorge.inheritance;

public class Animal2 {

	private int age;
	
	//Este constructor no obliga al hijo a tener que hacer un constructor en él porque NO tiene argumentos
	/*public Animal2(){
		this.age=2;
	}*/
	
	
	//Este constructor obliga a hacer un constructor en el hijo que le haga referencia con super() porque SÍ tiene argumentos
	//y suponiendo que el de sin argumentos no existe, si no haría referencia al de sin argumentos y no tendría por qué hacer referencia a éste.
	//Si se tiene varios constructores en el padre, el hijo debe hacer referencia a uno o varios de ellos, no es obligatorio
	//que haga referencia a todos... Como el de arriba es constructor sin argumentos, al no poner ningún constructor en el hijo
	//haría referencia al de sin argumentos...
	public Animal2(int age){
		this.age=2;
	}
	
	public Animal2(int age, int age2){
		this.age=age + age2;
	}
}
