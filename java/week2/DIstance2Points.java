//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 2 - Distance between two points
//------------------------

import java.util.Scanner;

public class DIstance2Points 
{

	public static void main(String[] args) 
	{
		String[] coordinate1split = new String[0];
		String[] coordinate2split = new String[0];
		
		System.out.println("This program will calculate the distance between two coordinate points.");
		// calls the userinput function twice to gather user inputs for two points
		coordinate1split = userinput();
		coordinate2split = userinput();

		
		// converts string array coordinate1split and coordinate2split to integers
		int x1 = Integer.parseInt(coordinate1split[0]);
		int y1 = Integer.parseInt(coordinate1split[1]);
		int x2 = Integer.parseInt(coordinate2split[0]);
		int y2 = Integer.parseInt(coordinate2split[1]);
		
		// declarations
		double discriminant, distance;
		int xdiff;
		int ydiff;
		
		// calculations (difference of x values and y values, the discriminant and the the distance formula
		xdiff = x2-x1;
		ydiff = y2-y1;
		discriminant = Math.pow(xdiff, 2) + Math.pow(ydiff, 2);
		distance = Math.sqrt(discriminant);
		
		
		// Outputs
		System.out.println(distance);
		System.out.printf("The distance between the points is %.2f", distance);

	}
	
	public static String[] userinput()
	{
		
		//declaration of variable used to gather data
		String coordinate;
		
		Scanner scan = new Scanner(System.in);
		
		// Input - used to gather user inputs
		System.out.println("Enter the coordinates of the point in the following format \"(x,y)\": ");
		coordinate = scan.next();
		
		
		// removes all white spaces from user inputs
		coordinate = coordinate.trim();
		
		// TODO for future assignments; better input sanitization.
		
		// creates substring to gather numberical inputs starting past the parathensis and one before the last
		String coordinatesub = coordinate.substring(1, coordinate.length() -1);
		
		// splits the input by the literal comma
		String[] coordinatesplit = coordinatesub.split(",");
		
		return coordinatesplit;
		
	}
	

}
