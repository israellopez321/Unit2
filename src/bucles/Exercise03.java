package bucles;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		// Creamos un escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos una variable para contener dos numeros
		int num1;
		int num2;

		// Declaramos una variable para contener el número menor
		int numMenor;

		// Declaramos una variable para contener el mcd
		int mcd = 0;

		// Le pedimos al usuario que introduzca el primer numero
		System.out.println("Introduzca el primer número:");
		num1 = sc.nextInt();

		// Le pedimos al usuario que introduzca el segundo numero
		System.out.println("Introduzca el segundo número:");
		num2 = sc.nextInt();

		// Comprobamos cual de los numeros es menor
		numMenor = Math.min(num1, num2);

		// Calcular máximo común divisor
		for (int cont = numMenor; cont >= 1; cont--) {
			if (num1 % cont == 0 && num2 % cont == 0) {
				mcd = cont;
				cont = 0;
			}
		}

		// Le mostramos al usuario el resultado
		System.out.println("El máximo comun divisor es " + mcd);

		// Cerramos escaner
		sc.close();
	}
}
