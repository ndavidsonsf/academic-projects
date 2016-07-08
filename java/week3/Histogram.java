//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 3 -Histogram
//------------------------




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Histogram 
{
	// declarations
	final int MAX = 100; 
	final int MIN = 1; 
	int[] numbers = new int[(MAX + 1) / 10];
	 
	 // Collect the data and count the occurrences.
	public void collect_values() throws IOException 
	{
		BufferedReader stdin = new BufferedReader (new InputStreamReader (System.in));
		int number;
		
		for (int index = 0; index < numbers.length; index++)
			numbers[index] = 0;
		do
		{
			
			System.out.print("Enter a number between " + MIN + " and " + MAX + " (-1 to quit): ");
			System.out.flush();
			
			number = Integer.parseInt (stdin.readLine());
			// Validate input and record frequency
			
			if (number != -1)
			{
				if (number >= MIN && number <= MAX)
				{
					numbers[(number-1) / 10]++;
				}
				else 
				{
					System.out.print("Input ignored. Try again.");
				}
			}
		}
		while (number != -1);
	}// method collect_values
	 
	
	
	public void print_results()
	{
		System.out.println();
		for (int index = 0; index < numbers.length; index++)
		{
			System.out.print (((index*10)+1) + " - " + ((index+1)*10) + " | ");
			
			for (int index2 = 0; index2 < numbers[index]; index2++)
				System.out.print ("*");
			System.out.println();
		}
 } // method print_results
	
} // class Histogram