//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 1 - Time Converter to Seconds
//------------------------

import java.util.Scanner;

public class TimeConverterSeconds 
{

	public static void main(String[] args) 
	{
		// variable declaration
		int userseconds;
		int days, hours, minutes, seconds;
		
		final int SECONDS_IN_DAY = 86400;
		final int SECONDS_IN_HOUR = 3600;
		final int SECONDS_IN_MINUTE = 60;
		final int SECONDS = 60;
		
		Scanner scan = new Scanner(System.in);
		// input - asks user to enter total seconds to convert
		System.out.print("Enter the number of seconds you would like to convert: ");
		userseconds = scan.nextInt();
		scan.close();
		
		// calculations - converting user provided number of seconds to DD:HH:MM:SS through division and modulo
		days = (int) userseconds / SECONDS_IN_DAY; // 4days = 412545sec / 86400 sec per day 
		int daysremain = userseconds % SECONDS_IN_DAY; // 66945sec remaining = 412545sec % 86400 sec per day
		
		hours = (int) daysremain / SECONDS_IN_HOUR; // 18hours = 66945sec remaining / 3600 sec per hour
		int hoursremain = daysremain % SECONDS_IN_HOUR; // 2145sec remaining = 66945sec remaining % 3600 sec per hour
		
		minutes = (int) hoursremain / SECONDS_IN_MINUTE; // 35min = 2145sec remaining / 60 sec per min
		int minutesremain = hoursremain % SECONDS_IN_MINUTE; // 45sec remaining = 2145sec remaining % 60sec per min
		
		seconds = minutesremain;
		
		// output - prints the results on screen in a SECONDS = DD:HH:MM:SS format
		System.out.println("You entered " + userseconds + " seconds, which is the equivalent to " + days
							+ " days " + hours + " hours " + minutes + " minutes " + minutesremain + " seconds.");
		
	}

}
