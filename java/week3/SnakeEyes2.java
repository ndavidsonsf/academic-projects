//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 3 - SnakeEyes2
//------------------------

public class SnakeEyes2 
{

	public static void main(String[] args) 
	{
		final int ROLLS = 500;
		int count = 0;
		
		Die dice1 = new Die();
		Die dice2 = new Die();
		
		for (int roll = 1; roll <= ROLLS; roll++)
		{
			dice1.roll();
			dice2.roll();
			
			if (dice1.getFaceValue() == 1 && dice2.getFaceValue() ==1 )
				count++;
		}
		
		System.out.println("Number of rolls: " + ROLLS);
		System.out.println("Number of Snake Eyes rolled: " + count);
		System.out.println("Ratio: " + (float)count / ROLLS);
		


	}

}
