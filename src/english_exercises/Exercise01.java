package english_exercises;

import java.util.Scanner;

public class Exercise01 {
	public static void main(String[] args) {
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaration a variable for contain a constant of costs of system basic
		final double COST_BASIC = 375.99;
		
		//Declaration the variables for contain a constants of cost of the screens and extras
		final double COST_SCREEN_38CM = 75.99;
		final double COST_SCREEN_43CM = 99.99;
		final double COST_ANTIVIRUS = 65.99;
		final double COST_PRINTER = 125;
		
		//Declaration the variables for contain the answers of user 
		int screen;
		String answer;
		
		//Declaration the variable for contain the cost total
		double totalPrice = 0;
		
		//Ask the user for the plan of purchase price
		System.out.println("What screen do you want to buy?");
		System.out.println("1. 38 cm - 75.99");
		System.out.println("2. 43 cm - 99.99");
		screen = sc.nextInt();
		
		//Use switch for check if the user to choose a screen
		switch (screen) {
		case 1 -> totalPrice = COST_BASIC + COST_SCREEN_38CM;
		case 2 -> totalPrice = COST_BASIC + COST_SCREEN_43CM;
		default -> System.out.println("ERROR"); 
		}
		
		//Ask the user if want a  antivirus software and addition if he want to buy
		System.out.println("Do you want antivirus software? (Y/N)");
		answer = sc.next();
		
		if(answer.equalsIgnoreCase("Y")) {
			totalPrice += COST_ANTIVIRUS;
		}
		
		//Ask the user if want a printer and addition if he want to buy
		System.out.println("Do you want a print? (Y/N)");
		answer = sc.next();
		
		if (answer.equalsIgnoreCase("Y")) {
			totalPrice += COST_PRINTER;
		}
		
		//Print the total cost
		System.out.println("The total cost is " + totalPrice);
		
		sc.close();
	}
}
