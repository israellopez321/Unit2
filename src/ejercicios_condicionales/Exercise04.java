package ejercicios_condicionales;

import java.util.Random;
import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {

		
		// Entrada: Suma de los números || Resultado esperado: Es correcto o incorrecto || Resultado obtenido: El resultado es correcto
		// Entrada: Suma de los números  || Resultado esperado: Es correcto o incorrecto || Resultado obtenido: El resultado es correcto
		// Entrada: Suma de los números || Resultado esperado: Es correcto o incorrecto || Resultado obtenido: El resultado es correcto
		// Entrada: Suma de los números incorrecta  || Resultado esperado: Es correcto o incorrecto || Resultado obtenido: El resultado es incorrecto
		
		// Creamos un nuevo escaner
		Scanner sc = new Scanner(System.in);

		// Para producir numeros aleatorios
		Random rd = new Random();

		// Declaramos variables para generar dos numeros aleatorios
		int primerRandom = rd.nextInt(1, 100);
		int segundoRandom = rd.nextInt(1, 100);

		// Declaramos una variable para contener la respuesta del usuario
		int respuesta;

		// Declaramos una variable para contener la solucion de la suma de los número
		// aleatorios
		int sumaAleatorios;

		// Le preguntamos al usuario cual es el resultado de la suma de los dos números
		// aleatorios
		System.out.println("Introduzca el resultado de la suma de " + primerRandom + " y " + segundoRandom + ":");
		respuesta = sc.nextInt();

		// Calculamos la suma de los dos numeros
		sumaAleatorios = primerRandom + segundoRandom;

		// Comprobamos con un if si la respuesta de consola y del usuario son iguales
		if (sumaAleatorios == respuesta) {
			System.out.println("El resultado es correcto");
		} else {
			System.out.println("El resultado es incorrecto");
		}

		sc.close();
	}
}
