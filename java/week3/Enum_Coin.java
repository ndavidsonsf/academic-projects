//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 3 - Coin - enumerated
//------------------------


public class Enum_Coin
{
	
	// creating enumerated type: Janus
	public enum Janus
	{
		HEADS,
		TAILS
	} 
	
	private Janus face;
   
	//  Sets up this coin by flipping it initially.
   
   public Enum_Coin ()
   {
      flip();
   }

   //  Flips this coin by randomly choosing a face value.
   //  Uses Random class to determine value, 0 = heads, otherwise it's tails
   
   public void flip ()
   {
      int rand = (int)(Math.random() * 2);  
	  face = (rand == 0) ? Janus.HEADS : Janus.TAILS;
   }
   
   // Returns true is the current side of the coin is heads.
   
   public boolean isHeads ()
   {
      return (face == Janus.HEADS);
   }
   
   //  Returns the current side of the coin to a string.
   
   public String toString()
   {
	   return (face == Janus.HEADS) ? "Heads" : "Tails";
   }
}
