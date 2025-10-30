package english_exercises;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		//Creation a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaration a variable for contain of money
		double amountToPay;
		double amountGiven;
		double change;
		
		//Declaration a variables for contains of coins
		 int coins200 = 0; 
		 int coins100 = 0; 
		 int coins50 = 0; 
		 int coins20 = 0;
	     int coins10 = 0; 
	     int coins5 = 0; 
	     int coins2 = 0; 
	     int coins1 = 0;
		
		//Ask the user for amount the customer must pay
		System.out.println("How much money in euros does the customer have to pay?");
		amountToPay = sc.nextDouble();

		//Ask the user for amount the customer gives
		System.out.println("How much money in euros does the customer give?");
		amountGiven = sc.nextDouble();
		
		//Calculation the change
		change = amountGiven - amountToPay; 
		
		//Calculation of convert from euro to cent
		change *= 100;
        
		//Use of "if" for Calculate of money of change in coin
        if (change >= 200) {
            coins200 = (int) change / 200;
            change %= 200;
        }
        if (change >= 100) {
            coins100 = (int) change / 100;
            change %= 100;
        }
        if (change >= 50) {
            coins50 = (int) change / 50;
            change %= 50;
        }
        if (change >= 20) {
            coins20 = (int) change / 20;
            change %= 20;
        }
        if (change >= 10) {
            coins10 = (int) change / 10;
            change %= 10;
        }
        if (change >= 5) {
            coins5 = (int) change / 5;
            change %= 5;
        }
        if (change >= 2) {
            coins2 = (int) change / 2;
            change %= 2;
        }
        if (change >= 1) {
            coins1 = (int) change;
        }
        
        //Print the final change
        System.out.println("You have to give the customer change: " +  coins200 + " coins of two euros, " + coins100 + " coins of one euro, " + coins50 + " coins of 50 cents, " 
        + coins20 + " coins of 20 cents, " + coins10 + " coins of 10 cents, " + coins5 + " coins of 5 cents, " + coins2 + " coins of 2 cents, " + coins1 + " coins of 1 cents ");

        sc.close();
			
			
		}
		
		
	}

