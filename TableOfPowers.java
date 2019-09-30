// Author: Jackie Zablah. Java Bootcamp 2019.
// Pair programming and display a table of powers. 

package lab4;

import java.util.Scanner;

public class TableOfPowers {

	public static void main(String[] args) {
		int userInt = 0;
		Scanner scnr = new Scanner(System.in);
		int square = 0;
		int cube = 0;
		String userChoice = "";
		String title1 = "Number";
		String title2 = "Squared";
		String title3 = "Cubed";
		String dashes = "----------";

		System.out.println("** Table of powers **\n");

		do {

			System.out.print("Enter an integer: <<");
			userInt = scnr.nextInt();
			System.out.println(">>Display Squares and Cubes\n");

			System.out.printf("%8s %11s %8s %n", title1, title2, title3);
			System.out.printf("%s %s %s %n", dashes, dashes, dashes);
			System.out.printf("%s %s %s %n", dashes, dashes, dashes);

			for (int i = 1; i <= userInt; i++) {
				square = (int) Math.pow(i, 2);
				cube = (int) Math.pow(i, 3);
				System.out.printf("%-10d %-10d %-8d\n", i, square, cube);
			}

			// Extra Challenge Multiplication Table
			System.out.println();
			System.out.println("            Display Multiplication Table");
			System.out.printf("%s%s%s%s%s%s%n", dashes, dashes, dashes, dashes, dashes, dashes);

			System.out.print("     ");
			for (int i = 1; i <= userInt; i++) {
				System.out.printf("%4d", i);
			}
			System.out.println();
			System.out.printf("%s%s%s%s%s%s\n", dashes, dashes, dashes, dashes, dashes, dashes);

			for (int j = 1; j <= userInt; j++) {
				System.out.printf("%4d|", j);
				for (int i = 1; i <= userInt; i++) {
					System.out.printf("%4d", j * i);
				}
				System.out.println();
			}

			System.out.println();

			System.out.print(">> Would you like to continue (y/n)?");
			userChoice = scnr.next();

			if (userChoice.equalsIgnoreCase("n")) {
				System.out.println(">> Goodbye!");
			}

		} while (userChoice.equalsIgnoreCase("y"));
		scnr.close();

	}


	/*
	 * Given an int n, return true if it is within 10 of 100 or 200. Note:
	 * Math.abs(num) computes the absolute value of a number.
	 *  
	 * nearHundred(93)true nearHundred(90)true nearHundred(89)false
	 */
	
	// coding bat (Near Hundred)
	public boolean nearHundred(int n) {

		int abs1 = Math.abs(100 - n);
		int abs2 = Math.abs(200 - n);
		if ((abs1 <= 10) || (abs2 <= 10))
			return true;
		else
			return false;

	}

   // other way without using Math.abs
	public boolean nearHundred1(int n) {
		if ((n >= 90 && n <= 110) || (n >= 190 && n <= 210)) {
			return true;
		} else {
			return false;
		}

	}
}
