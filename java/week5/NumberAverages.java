//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 5 - 10 integer averages
//------------------------

import java.util.Scanner;

public class NumberAverages 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		// variable declaration
		double average, numbersOut = 0;
		int i = 0;
		
		// create an array to store user inputs
		int[] usernumbers = new int[10];
		
		// Opening statement of the program
		System.out.println("This program will take 10 values and compute the average.");
		
		// for loop to gather user data
		for (i = 0; i < usernumbers.length; i++)
		{
			System.out.print("Enter a value:");
			System.out.println();
			
			//try-catch to scan user input, turn it to an integer
			try
			{
				String userstring = scan.next();
				usernumbers[i] = Integer.parseInt(userstring); // puts user input into a string array
			}
			catch (NumberFormatException notANum) // used to catch the exception and notify user that input is invalid
			{
				System.out.println(notANum + " is not in the correct format. Please try again.");
				i --;
			}
		}
		
		// prints user inputs to the variable numbersOut
		for (i = 0; i < usernumbers.length; i++)
		{
			numbersOut += usernumbers[i];
		}
		
		// calculations to take user inputs and divide by the length of the string/integer array
		numbersOut /= usernumbers.length;
		
		
		//OUTPUTS - print the average
		System.out.println(numbersOut + " is the average.");
			
		
	}

}
