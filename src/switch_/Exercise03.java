package switch_;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		//Creation a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaration a variables for contain two numbers
		int num1;
		int num2;
		
		//Declaration a variable for contain the options
		String opciones;
		
		//Declaration a variable for contain operation
		double operacion;
		
		//Ask the user for the first number
		System.out.println("Introduzca el primer número:");
		num1 = sc.nextInt();

		//Ask the user for the second number
		System.out.println("Introduzca el segundo número:");
		num2 = sc.nextInt();
		
		//Show the user the options
		System.out.println("Introduzca la letra del índice para seleccionar la operación que quieras:");
		System.out.println("A- Sumar los números.");
		System.out.println("B- Restar los números.");
		System.out.println("C- Multiplicar los números.");
		System.out.println("D- Dividir los números.");
		
		//Ask the user for the chosen option
		opciones = sc.next();
		
		//Use switch for show result according to chosen option 
		double resultado = switch (opciones) {
		case "A","a" -> {
			operacion = (num1 + num2);
			yield operacion;
		}
		case "B","b" -> {
			operacion = (num1 - num2);
			yield operacion;
		}
		case "C","c" -> {
			operacion = num1 * num2;
			yield operacion;
		}
		case "D","d" -> {
			if (num2 != 0) {
				operacion = (num1 / num2);
			} else {
				System.out.println("Un número no puede dividirse por cero.");
				operacion = 0;
			}
			yield operacion;
			} //Close case D
		default -> {
			System.out.println("Esa opcion no existe.");
			yield -1;
		}
		};
		
		//Print final result 
		System.out.println("EL resulta de la operación elegida es " + resultado);
		
		sc.close();
	}

}
