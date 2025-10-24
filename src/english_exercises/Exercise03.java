package english_exercises;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		//Creation a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaration variables for contain the mirrors hours and mirrors minutes
		int mirrorHour;
		int mirrorMinute;
		
		int realHour;
		int realMinute;
		
		System.out.println("Introduce the hour that you are seeing in the mirror:");
		mirrorHour = sc.nextInt();
		mirrorMinute = sc.nextInt();
		
		realMinute = (mirrorMinute == 0) ? 0 : 60 - mirrorMinute ;
		
		realHour = (mirrorMinute == 0) ? 12 - mirrorHour : 11 - mirrorHour;
		
		if (realMinute < 10) {
			System.out.println("The real hour at " + realHour + ":" + "0" + realMinute + ".");
		} else {
			System.out.println("The real hour at " + realHour + ":" + realMinute + ".");
		}

		
		sc.close();
	}
}
