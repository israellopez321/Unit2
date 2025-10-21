package ejercicios_condicionales;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		
		//Entrada -1 || Resultado esperado: Entre 1 y 9999 || Resultado obtenido: El número introducido no esta comprendido entre 1 y 9999.
		//Entrada 20 || Resultado esperado: Entre 1 y 9999 || Resultado obtenido: El número 20 no es capicúa.
		//Entrada 6776 || Resultado esperado: Entre 1 y 9999 || Resultado obtenido: El número 6776 es capicúa.
		//Entrada 5345 || Resultado esperado: Entre 1 y 9999 || Resultado obtenido: El número 5345 no es capicúa.
		
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos una variable para contener el numero introducido por el usuario
		int numero;

		// Declarmos una variable para contener los numeros para que sean capicúa
		int primerNumero;
		int segundoNumero;
		int tercerNumero;
		int cuartoNumero;
		// Le preguntamos al usuario por un numero comprendido entre el 1 y el 9999
		System.out.println("Introduce un número entre el 1 y el 9999 para ver si es capicúa:");
		numero = sc.nextInt();

		// Comprobamos si el número es capicúa y lo mostramos
		if (numero < 10 && numero > 0) {
			System.out.println("El número " + numero + " es capicúa.");
		} else if (numero < 100 && numero > 9) {
			primerNumero = numero / 10;
			segundoNumero = numero % 10;
			if (primerNumero == segundoNumero) {
				System.out.println("El número " + numero + " es capicúa.");
			} else {
				System.out.println("El número " + numero + " no es capicúa.");
			} //Fin else número de dos cifras
		} else if (numero < 1000 && numero > 99) {
			primerNumero = numero / 100;
			segundoNumero = numero % 10;
			if (primerNumero == segundoNumero) {
				System.out.println("El número " + numero + " es capicúa.");
			} else {
				System.out.println("El número " + numero + " no es capicúa.");
			}//Fin else número de tres cifras
		} else if (numero < 10000 && numero > 999) {
			primerNumero = numero / 1000;
			cuartoNumero = numero % 10;
			tercerNumero = numero / 10 % 10;
			segundoNumero = numero / 100 % 10;
			if (primerNumero == cuartoNumero && segundoNumero == tercerNumero) {
				System.out.println("El número " + numero + " es capicúa.");
			} else {
				System.out.println("El número " + numero + " no es capicúa.");
			} //Fin else número de cuatro cifras
		} else {
			System.out.println("El número introducido no esta comprendido entre 1 y 9999.");
		} //Fin if 

		sc.close();
	}

}
