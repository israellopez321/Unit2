package bucles;

import java.util.Scanner;

public class Exercise10 {
	public static void main(String[] args) {
		//Creamos un scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable para contener un numero
		int num;
		
		//Declaramos una variable para contener las cifras invertidas
		int numInvertido = 0;
		
		//Declaramos una variable para contener un variable auxiliar
		int numAux;
		
		// Última cifra del número
		int ultimaCifra;
		
		//Le pedimos al usuario un numero
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		//Almacenamos en la variable auxiliar el número introducido por el usuario
		numAux = num;
		
		while (numAux > 0) {
			ultimaCifra = numAux % 10;
			numInvertido = numInvertido * 10 + ultimaCifra;
			numAux /= 10;
		}
		
		System.out.println(numInvertido==num ? "Es capicúa" : "No es capicúa");
		
		//Cerramos el escaner
		sc.close();
	}
}
