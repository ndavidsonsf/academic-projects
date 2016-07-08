//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 1 - Time Converter to Seconds
//------------------------

import java.util.Scanner;

public class TimeConverter 
{

	public static void main(String[] args) 
	{
		// variable declaration
		String[] splittime = new String[0];
		final int SECONDS_IN_DAY = 86400;
		final int SECONDS_IN_HOUR = 3600;
		final int SECONDS_IN_MINUTE = 60;
		final int SECONDS = 60;
		
		// while loop to call userinput and check that it equals 4
		while (splittime.length !=4) 
		{
			// calls function to gather user input and return it in a string array
			splittime = userinput(); 
			
			// prints message if userinput does not meet criteria and starts again
			if (splittime.    length != 4) 
			{
				System.out.println("You did not enter in the correct format.");
				
			}
		}
		
		// coverts string array splittime to integers 
		int days = Integer.parseInt(splittime[0]);
		int hours = Integer.parseInt(splittime[1]);
		int minutes = Integer.parseInt(splittime[2]);
		int seconds = Integer.parseInt(splittime[3]);
		
		// calculaters total number of seconds based on user inputs
		int userseconds = (days * SECONDS_IN_DAY) + (hours * SECONDS_IN_HOUR) + (minutes
						* SECONDS_IN_MINUTE) + seconds;
		
		// outputs - confirms user input and displays results
		System.out.println("You entered: " + days + " day(s), " + hours + " hour(s) " + minutes + " minutes, "
							+ seconds + " seconds.  That is equivalent to " + userseconds + " seconds.");
			
	}
	
	public static String[] userinput()
	{
		// variable declaration
		String time;
		
		Scanner scan = new Scanner (System.in);
		
		// inputs - asks user for time in format DD:HH:MM:SS
		System.out.print("Enter the total time in days, hours, minutes, and seconds in the following"
						+ " format 00:00:00:00: ");
		time = scan.next();
		
		// splits user inputs into string array and returns it
		String[] splittime = time.split(":"); 
		return splittime;
	}

}
