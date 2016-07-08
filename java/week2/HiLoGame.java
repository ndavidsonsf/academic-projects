//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 2 - Hi-Lo Game
//------------------------

import java.util.Scanner;
import java.util.Random;


public class HiLoGame 
{

	public static void main(String[] args) 
	{
		// variable declaration
		int answer, userguess, count;
		int newgame;
		System.out.println("This is a Hi-Lo Guessing Game.  I am thinking of a number between 1 and 100...");
		System.out.println();
		
		Random generator = new Random();
		
		do
		{
			
			count = 0;
			
			answer = generator.nextInt(10) + 1;
			
			// uses a while loop to set useryear equal to the input of the user by calling the class to retrieve it and using "0" and the sentinal value
			while ((userguess = userinput()) != 0)
			{
				count++;
				
				if (userguess == answer)
				{
					System.out.println("You guessed correctly!  The number I was thinking of was " + answer + ".");
					System.out.println("It took you " + count + " guesses.");
					break;
				}
				
				if (userguess < answer)
				{
					System.out.println("Sorry, " + userguess + " is too low.  Try again.");
					continue;
				}
				
				if (userguess > answer)
				{
					System.out.println("Sorry, " + userguess + " is too high.  Try again.");
					continue;
				}
			
			} // closes the inner game while loop
		} 
		while ((newgame = gamecontinue()) != 0); // closes the outer continue game while loop
		
		return;
		
	}
	
	public static int userinput()
	{
		// declaration of user input variable
		int userguess;
		
		// creating instance of scanner
		Scanner scan = new Scanner(System.in);
		
		// INPUT
		System.out.println();
		System.out.print("Please enter a guess (0 to exit): ");
		userguess = scan.nextInt();
		System.out.println();
		
		return userguess;

	}
	
	public static int gamecontinue()
	{
		// declaration of user input variable
		int newgame;
		
		// creating instance of scanner
		Scanner scan = new Scanner(System.in);
		
		// INPUT
		System.out.println();
		System.out.print("Would you like to play again?  Type 0 to exit. ");
		newgame = scan.nextInt();
		System.out.println();
		
		return newgame;

	}

}
