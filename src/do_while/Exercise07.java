package do_while;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos una variable para almacenar el primer numero
		double num1;

		//Declaramos una variable para almacenar el segundo numero
		double num2;
		
		//Declaramos una variable para contener las opciones
		String opcion;
		
		//Declaramos una variable para contener el resultado
		double resultado;
		
		do {
		System.out.println("Introduzca el primer número");
		num1 = sc.nextDouble();

		
		System.out.println("Introduzca el segundo número");
		num2 = sc.nextDouble();
		
		System.out.println("A. SUMAR");
		System.out.println("B. RESTAR");
		System.out.println("C. MULTIPLICAR");
		System.out.println("D. DIVIDIR");
		System.out.println("E. SALIR");
		
		opcion = sc.next().toUpperCase();
		
		switch (opcion) {
		case "A" -> {resultado = num1 + num2;
		System.out.println("El resultado de la suma es: " + resultado);
		}
		case "B" -> {resultado = num1 - num2;
		System.out.println("El resultado de la resta es: " + resultado);
		}
		case "C" -> {resultado = num1 * num2;
		System.out.println("El resultado de la multiplicación es: " + resultado);
		}
		case "D" -> {
			if (num2 == 0) {
				System.out.println("Un número no puede dividirse por 0");
			} else {
				resultado = num1 / num2;
				System.out.println("El resultado de la división es: " + resultado);
			}	
		}
		case "E" -> System.out.println("Saliendo...");
		default -> System.out.println("Opción errónea");
		}
		
		} while (!opcion.equals("E"));
		
		sc.close();
	}
}
