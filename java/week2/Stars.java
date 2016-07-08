//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 2 - Star
//------------------------
public class Stars 
{

	public static void main(String[] args) 
	{
		int n = 9;
		
		for (int row = 1; row <= n; row++)
        {
              for (int space = 0; space < (n - row); space++)
                    System.out.print(" ");
              for (int space = 1; space <= row; space++)
                    System.out.print("*");
              for (int star = 1; star < row; star++)
                    System.out.print("*");
              System.out.println();
        }
		for (int row = n - 1; row >= 1; row--)
        {
              for (int space = 0; space < (n - row); space++)
                    System.out.print(" ");
              for (int space = 1; space <= row; space++)
                    System.out.print("*");
              for (int star = 1; star < row; star++)
                    System.out.print("*");
              System.out.println();
        }
	

	}

}

