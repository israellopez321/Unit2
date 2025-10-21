package ejercicios_condicionales;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		
		// Entrada -1 || Resultado esperado: Valor absoluto del número || Resultado obtenido: El valor absoluto de |-1| es 1.
		// Entrada 3223 || Resultado esperado: Valor absoluto del número || Resultado obtenido: El valor absoluto de |3223| es 3223.
		// Entrada -9923 || Resultado esperado: Valor absoluto del número || Resultado obtenido: El valor absoluto de |-9923| es 9923.
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Declaramos una variable para contener el número introducido por el usuario
		int numero;

		// Declaramos una variable para contener el valor absoluto
		int valorAbsoluto;

		// Le pedimos al usuario un numero para calcular el valor absoluto
		System.out.println("Introduzca un número para hallar su valor absoluto");
		numero = sc.nextInt();

		// Usamos un ternario para comprobar si el numero es positivo o negativo y
		// hallar su valor absoluto
		valorAbsoluto = (numero >= 0) ? numero : -numero;

		// Le mostramos al usuario el resultado
		System.out.println("El valor absoluto de |" + numero + "| es " + valorAbsoluto + ".");

		sc.close();
	}

}
