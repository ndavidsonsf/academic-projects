//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 3 - Pair of Dice
//------------------------

public class PairOfDice 
{
	protected Die die1, die2;
	private int fvalue1, fvalue2, diceSum;
	
	// Contructor, creating two die and set initial values
	public PairOfDice()
	{
		die1 = new Die();
		die2 = new Die();
		fvalue1 = 1;
		fvalue2 = 1;
		diceSum = fvalue1 + fvalue2;
		
	}
	
	public int roll()
	{
		die1.roll();
		die2.roll();
		diceSum = fvalue1 + fvalue2;
		return diceSum;
	}
	
	public void setDie1(int value)
	{
		die1.setFaceValue(value);
	}
	
	public void setDie2(int value)
	{
		die2.setFaceValue(value);
	}
	
	public int getDie1()
	{
		return fvalue1;
	}
	
	public int getDie2()
	{
		return fvalue2;
	}
	
	public int getDieSum()
	{
		return diceSum;
	}
	
	public String toString()
	{
		String result = " You have rolled " + diceSum;
		return result;
	}
	
}
