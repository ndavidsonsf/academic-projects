//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 2 - Leap year calculator
//------------------------

import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args) 
	{
		// variable declaration
		Boolean isby4, isby100, isby400;
		int useryear;
		
		System.out.println("The is program will determine whether a given year is a leap year.");
		System.out.println();
		System.out.println("------------------------------------------------------------------");
		
		// sets useryear equal to the input of the user by calling the class to retrieve it
		useryear = userinput();
		
		// CONDITIONALS
		
		// First check if the year enter is after the Gregorian calendar was adopted
		// Year 400 would execute the error, 1900 does not evaluate and thus continues
		if (useryear < 1582)
		{
			System.out.println("Error: The Gregorian Calendar was adopted in 1582.  You must enter that year or later.");
			return;
		}
		
		
		// CALCULATIONS using modulo -- if something is divisible the result will be zero
		// explicitly setting the modulo to trues or falses
		isby4 = (useryear % 4 == 0) ? true : false;
		isby100 = (useryear % 100 == 0) ? true : false;
		isby400 = (useryear % 400 == 0) ? true : false;
		
		// checks if input is not divisible by 4
		// Example 2000 is divisible by 4, so it continues, 1323 is not so it would execute the following line and end the program
		if (isby4 == false)
		{
			System.out.println("The year" + useryear + " is NOT a leap year.");
			return;
		}
		// Checks if the input is divisble by 400
		// Example 2000 is, and if it made it here, it is also divisible by 4 so it has to be a leap year and ends the program
		if (isby400 == true)
		{
			System.out.println("The year " + useryear + " is a leap year.");
			return;
		}
		// Checks if input is divisible by 100
		// Example 1900 is divisible by 4, not by 400, and is by 100 - executes the following line and ends the program
		if (isby100 == true)
		{
			System.out.println("The year " + useryear + " is NOT a leap year.");
			return;
		}
		// The catch all statement, is divisble by 4, but isn't divisible by 400 or 100 also means a leap year, executes and ends the program.
		System.out.println("The year " + useryear + " is a leap year.");
		return;
		
	}
	
	public static int userinput()
	{
		// declaration of user input variable
		int useryear;
		
		// creating instance of scanner
		Scanner scan = new Scanner(System.in);
		
		// INPUT
		System.out.print("Please enter a year: ");
		useryear = scan.nextInt();
		System.out.println();
		
		return useryear;

	}

}
