package for_;

import java.util.Scanner;

public class Exercise05 {
	public static void main(String[] args) {
		//Creamos un escaner 
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable para contener el numero introducido por el usuario
		int num;
		
		//Declaramos una variable para contener el factorial, le damos 1 de valor para despues multiplicarlo con el valor del numero introducido
		int factorial = 1;
		
		//Le pedimos al usuario que introduzca un numero
		System.out.println("Introduzca un número para calcular su factorial:");
		num = sc.nextInt();
		
		//Usamos for para calcular el factorial del numero introducido
		for (int cont = num ; cont >= 1; cont-- ) {
			
			factorial *= cont; 
		}
		
		//Le mostramos al usuario el valor del factorial
		System.out.println("El valor de " + num + "! es igual a " + factorial);
		
		//Cerramos escaner
		sc.close();
	}
}
