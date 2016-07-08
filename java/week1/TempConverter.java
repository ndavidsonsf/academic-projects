//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 1 - Temp Converter
//------------------------

import java.util.Scanner;


public class TempConverter 
{
	//--------------------
	// User enters degrees in Celsius and the program converts to Fahrenheit
	// using the formula C = (F - 32) * (5/9)

	public static void main(String[] args) 
	{
		// variable declaration
		final int BASE = 32;
		final double CONVERSION_FACTOR = 5.0 / 9.0;
		
		double celsiusTemp;
		int fahrenheitTemp;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println();
		System.out.println();
		// input - asks user for temperature in F
		System.out.print("Enter the temperature in Fahrenheit: ");
		fahrenheitTemp = scan.nextInt();
		
		// Calculation - converts temp in F to temp in C 
		celsiusTemp = (fahrenheitTemp - BASE) * CONVERSION_FACTOR;
		
		// Output - prints user enter temp and the equal conversion
		System.out.println("Fahrenheit Temperature: " + fahrenheitTemp);
		System.out.println("Celsius Equivalent: " + celsiusTemp);
		
		
	}

}
