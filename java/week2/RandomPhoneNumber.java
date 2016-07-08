//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 2 - Generate random phone number
//------------------------


// imports Random class from the Java Utilities package
import java.util.Random;


public class RandomPhoneNumber 
{

	public static void main(String[] args) 
	{
		// declares and instantiates a new random object 'generator'
		Random generator = new Random();
		// declares the five different sets of numbers for the phone number
		int digit1, digit2, digit3, digit4, digit5;
		
		// generates random numbers with specific parameters
		// although, these are not the actual parameters for telephone number is in North America. The first tuple can not start with 0 or 1.  There are several reserved sets, but other than that a phone number can be any combination.
		digit1 = generator.nextInt(8);
		digit2 = generator.nextInt(8);
		digit3 = generator.nextInt(8);
		digit4 = generator.nextInt(743) + 100;
		digit5 = generator.nextInt(1000) + 1000;
		
		
		// outputs to print the randomly generated phone number
		System.out.print("A random computer generated telephone number is: " + digit1 + digit2 + digit3 + "-" + digit4 + "-" + digit5 + ".");
		

	}

}
