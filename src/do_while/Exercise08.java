package do_while;

import java.util.Scanner;

public class Exercise08 {
public static void main(String[] args) {
	// Create a new Scanner
			Scanner sc = new Scanner(System.in);

			// Declaration a variables for contain the result of dice rolls
			int dado1;
			int dado2;

			// Declaration a variable for contain the addition of the rolls
			int sumaDados;

			// use "do while" for repeat the question the user
			do {
				System.out.println("Introduzca el valor del primer dado lanzado:");
				dado1 = sc.nextInt();
			}while(dado1 > 6 || dado1 < 1);

			// Use switch for show result according the result of first dice rolls
			switch (dado1) {
			case 1 -> System.out.println("UNO");
			case 2 -> System.out.println("DOS");
			case 3 -> System.out.println("TRES");
			case 4 -> System.out.println("CUATRO");
			case 5 -> System.out.println("CINCO");
			case 6 -> System.out.println("SEIS");
			}

			//use "do while" for repeat the question the user for second roll
			System.out.println();
			do {
				System.out.println("Introduzca el valor del segundo dado lanzado:");
				dado2 = sc.nextInt();
			}while(dado2 > 6 || dado2 < 1);
			System.out.println();

			// Use switch for show result according the result of second dice rolls
			switch (dado2) {
			case 1 -> System.out.println("UNO");
			case 2 -> System.out.println("DOS");
			case 3 -> System.out.println("TRES");
			case 4 -> System.out.println("CUATRO");
			case 5 -> System.out.println("CINCO");
			case 6 -> System.out.println("SEIS");
			}

			// Calculate the addition of rolls
			sumaDados = dado1 + dado2;

			// Show the final message 
			System.out.println("Has sacado un " + sumaDados);	
			
			
			sc.close();
		}
	}


