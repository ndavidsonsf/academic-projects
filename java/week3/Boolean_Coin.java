//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 3 - Coin - boolean
//------------------------

public class Boolean_Coin
{
   private boolean isFaceHeads;
   
   //-----------------------------------------------------------------
   //  Sets up this coin by flipping it initially.
   //-----------------------------------------------------------------
   public Boolean_Coin ()
   {
      flip();
   }

   //-----------------------------------------------------------------
   //  Flips this coin by randomly choosing a face value.
   //-----------------------------------------------------------------
   public void flip ()
   {
      int rand = (int)(Math.random() * 2);  
	  isFaceHeads = (rand == 0) ? true : false;
   }
   
   public boolean isHeads ()
   {
      return isFaceHeads;
   }

   public String toString()
   {
	   return (isFaceHeads == true) ? "Heads" : "Tails";
   }
   
   
   
   
   
   
   /*//-----------------------------------------------------------------
   //  Returns true if the current face of this coin is heads.
   //-----------------------------------------------------------------
   public boolean isHeads ()
   {
      return (face == HEADS);
   }

   //-----------------------------------------------------------------
   //  Returns the current face of this coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      return (face == HEADS) ? "Heads" : "Tails";
   }
   */
}
