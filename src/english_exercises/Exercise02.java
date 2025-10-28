package english_exercises;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//Creation a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaration a variable for contain amount of money 
		double money;
		
		//Declaration a variable for contain the type of bank account
		String BankAccount;
		
		//Declaration a variable for contain amount of money that can be earned in one year as interest	
		double earnMoney = 0;
		
		//Declaration a variables for contain constants of interest
		final double INTEREST_AC = 0.015;
		final double INTEREST_B =  0.02;
		final double INTEREST_X =  0.05;
		
		//Ask the user for the amount money to enter
		System.out.println("Introduce the amount money to enter:");
		money = sc.nextDouble();
		
		//Ask the user for the type of interest
		System.out.println("Choose the type of bank account:");
		System.out.println("A. Account A with 1.5% of interest annual");
		System.out.println("B. Account B with 2% of interest annual");
		System.out.println("C. Account C with 1.5% of interest annual");
		System.out.println("X. Account X with 5% of interest annual");
		BankAccount = sc.next();
		
		//Use switch for choose the interest rate chosen by the user
		switch (BankAccount) {
		case "a", "A", "c", "C" -> earnMoney = money * INTEREST_AC;
		case "b", "B" -> earnMoney = money * INTEREST_B;
		case "x", "X"-> earnMoney = money * INTEREST_X;
		default -> System.out.println("That option does not exist");
		}
		
		System.out.println("The money earned by the chosen account in a year is " + earnMoney);		
		
		sc.close();
	}

}
