//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 3 - Die
//------------------------


import java.util.Random;

public class Die
{
      // Declarations
	  private int faceValue;
      private final int MAX=6;
      private Random dieGen; // random die generator
      
      public Die()
      {
    	  faceValue = 1;
    	  dieGen = new Random();
        
      }
      
      // dieGen generates random integer between 1 and MAX 
      public void roll()
      {
        faceValue = dieGen.nextInt(MAX) +1;
      }
      
      //Sets face value
      public void setFaceValue(int value)
      {
        faceValue=value;
      }
      //Gets face value using the setFaceValue method

      public int getFaceValue() 
      {
        return faceValue;

      }
      //Converts values into a String
      public String toString()
      {
        String result = "You rolled a " + faceValue;
        return result;
      }
      
}// end class Die
