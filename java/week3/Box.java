//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 3 - Box
//------------------------

public class Box 
{
	double height, width, depth, volume;
	boolean full = false;
	
	// Constructor - setting initial values to zero.
	public Box(double height, double width, double depth)
	{
		setBoxHeight(height);
		setBoxWidth(width);
		setBoxDepth(depth);
		setBoxVolume();
	}
	
	// Setter - sets box height
	public void setBoxHeight(double height)
	{
		this.height = height;
	}
	
	// Getter - gets box height
	public double getBoxHeight()
	{
		return height;
	}
	
	// Setter - sets box width
	public void setBoxWidth(double width)
	{
		this.width = width;
	}
	
	// Getter - gets box width
	public double getBoxWidth()
	{
		return width;
	}
	
	// Setter - sets box depth
	public void setBoxDepth(double depth)
	{
		this.depth = depth;
	}
	
	// Getter - gets box depth
	public double getBoxDepth()
	{
		return depth;
	}
	
	// Setter - sets box to full or not
	public void setBoxFull(boolean full)
	{
		this.full = full;
	}
	
	
	// Getter - gets whether box is full
	public boolean setBoxFull()
	{
		return full;
	}
	
	
	// Setter - sets box volume
	public void setBoxVolume()
	{
		volume = height * width * depth;
	}
	
	
	// Getter - gets box volume
	public double getBoxVolume()
	{
		return volume;
	}
	
	// Returns a string representation of a box
	public String toString()
	{
		String text = String.format("Width: %.2f\tHeight: %.2f\tDepth: %.2f\tVolume: %.2f.\t", width, height, depth, volume);
		if (full == true)
		{
			return text + " The box is full.";
		}
		return text + " The box is NOT full.";
	}


}
