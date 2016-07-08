//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 3 - BoxTest
//------------------------

public class BoxTest 
{

	public static void main(String[] args) 
	{
		// Creates instances of the box and initialization of values
		Box box1 = new Box(3,5,7);
		box1.full = false;
		Box box2 = new Box(7.3, 6.9, 23.5);
		box2.full = false;
		Box box3 = new Box(99, 23.2, 100);
		box3.full = true;
		
		
		// prints out the data on each both
		System.out.println(box1.toString());
		System.out.println(box2.toString());
		System.out.println(box3.toString());

	}

}
