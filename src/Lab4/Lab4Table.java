package Lab4;

import java.util.Scanner;

public class Lab4Table {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum;

		String userChoice = null;

		System.out.println("Well hello there!");

		do {
			int baseNum = 1;
			System.out.println("Would you kindly enter a number?");
			userNum = scnr.nextInt();
			System.out.println("Time to learn your squares and cubes!");

			System.out.printf("%-10s %-10s %-10s %n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-10s %-10s %n", "======", "=======", "=====");

			while (baseNum <= userNum) {
				System.out.printf("%-11d", (baseNum));
				System.out.printf("%-11d", (int) Math.pow(baseNum, 2));
				System.out.printf("%-10d %n", (int) Math.pow(baseNum, 3));
				baseNum++;
			}
			System.out.println("");
			System.out.println("Would you like to continue? (y/n)");
			userChoice = scnr.next();

		} while (userChoice.equalsIgnoreCase("y"));

		System.out.println("Ok, have a nice day!");
		scnr.close();
	}

}
