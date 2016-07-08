import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 5 - Outputs to a file
//------------------------

public class UserOutput 
{

	public static void main(String[] args) throws IOException 
	{
		String file = "userStrings.dat";
		
		String[] userStrings = new String[5];
		
		Scanner scan = new Scanner(System.in);
		
		FileWriter fw = new FileWriter (file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);
		
		for (int line = 1; line < userStrings.length; line ++)
		{
			for (int num = 1; num < userStrings.length; num++)
			{
				System.out.println("Enter something:");
				userStrings[num] = scan.nextLine();
			}
			outFile.println();
		}
		outFile.close();
		System.out.println("Output file has been created: " + file);

	}

}
