package bucles;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		//Creamos un escaner
		Scanner sc = new Scanner(System.in);
		
		//Números introducidos por el usuario
		int num1;
		int num2;
		
		//Declaramos una variable para contener el número mayor
		int mayor;
		
		//Declaramos una variable para contener el máximo comun divisor
		int mcd = 0;
		
		//Le pedimos al usuario que introduzca el primer numero
		System.out.println("Introduzca el primer número:");
		num1 = sc.nextInt();
		
		//Le pedimos al usuario que introduzca el segundo numero
		System.out.println("Introduzca el segundo número:");
		num2 = sc.nextInt();
		
		//Comprobamos cual número es mayor
		mayor = Math.max(num1, num2);
		
		//Calculamos el minimo comun multiplo
		for (int cont = mayor; cont >= 2 ; cont++) {
			if (cont % num1 == 0 && cont % num2 == 0) {
				mcd = cont;
				cont = 0;
			}
		}
		//Le mostramos al usuario el resultado
		System.out.println("El mínimo común multiplo es " + mcd);
		
		//Cerramos el escaner
		sc.close();
	}
}
