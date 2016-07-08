//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 2 - Area of Triangle - Heron's formula
//------------------------



import java.util.Scanner;

public class AreaTriangle2 
{

	public static void main(String[] args) 
	{
		
		
		// variable declarations
		String[] splitsides = new String[0];
		int sidea, sideb, sidec;
		double semiperimeter, discriminant, area;
		
		// user interface display and inputs of values
		System.out.println("This program will find the area of a triangle using Heron's formula.");
		System.out.println("---------------------------------------------------------------------");
		
		// while loop to gather user input and that input is sufficient
		while (splitsides.length != 3)
		{
			splitsides = userinput();
			
			if (splitsides.length != 3)
			{
				System.out.println("You did not enter the sides in the correct format!");
			}
		}
		
		// converts string array splitsides to integers
		int user1 = Integer.parseInt(splitsides[0].trim());
		int user2 = Integer.parseInt(splitsides[1].trim());
		int user3 = Integer.parseInt(splitsides[2].trim());
		
		// if statements to order inputs
		int hold; // throw away variable
		if (user1 > user2)
		{
			hold = user1;
			user1 = user2;
			user2 = hold;
		}
		if (user2 > user3)
		{
			hold = user2;
			user2 = user3;
			user3 = hold;
		}
		if (user1 > user2)
		{
			hold = user1;
			user1 = user2;
			user2 = hold;
		}
		
		// converting sides in numerical order to corresponding side lengths a <= b <= c
		sidea = user1;
		sideb = user2;
		sidec = user3;
		
		// triangle check
		if ((sidea + sideb) < sidec)
		{
			System.out.println("That is not a triangle!  The sum of two sides must be equal to or greater than the third. Exiting.");
			return;
		}
		
		// Calulations
		semiperimeter = (sidea + sideb + sidec) / 2; // s = (a+b+c)/2
		
		discriminant = semiperimeter * (semiperimeter - sidea) * (semiperimeter - sideb) * (semiperimeter - sidec); // everything under the sqrt
		
		area = Math.sqrt(discriminant);
		
		
		// Outputs printed to user confirming data entered and printing the area
		System.out.println("-------------------------------------------");
		System.out.println("You entered the following information:");
		System.out.println("         Side a = " + sidea);
		System.out.println("         Side b = " + sideb);
		System.out.println("         Side c = " + sidec);
		System.out.printf("The area of this triangle is %.3f.", area); 
	
	}
	
	public static String[] userinput()
	{
		// variable declaration
		String sides;
		
		Scanner scan = new Scanner (System.in);
		
		// inputs - asks user for lengths of sides in x,y,z format
		System.out.print("Enter the side lengths of the triangle (seperated by commas): ");
		sides = scan.next();
		System.out.println();
		
		
		// trims the user input of white spaces on either side
		sides = sides.trim();
		
		// splits user inputs into string array and returns it
		String[] splitsides = sides.split(",");
		return splitsides;
	}

}
