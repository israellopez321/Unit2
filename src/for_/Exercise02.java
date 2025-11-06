package for_;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable para contener un numero
		int num;
		
		//Le pedimos al usuario un numero
		System.out.println("Introduzca un número para calcular el multiplo de 3 hasta llegar a ese número: ");
		num = sc.nextInt();
		
		//Usamos for para poner lo multiplos de tres hasta donde el usuario nos indique
		
		for(int cont= 0	; cont <= num ; cont += 3 ) {
			System.out.println(cont);
		}
		
		//Cerramos escaner
		sc.close();
	}
}
