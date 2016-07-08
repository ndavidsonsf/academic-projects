//------------------------
// Name: Nicholas Davidson
// Student ID: 1000891865
// Course: CST 200
// Section: 28317
// Assignment: Week 3 - Sphere
//------------------------

import java.text.Format;


public class Sphere 
{
	private double diameter, volume, area;
	
	// Constructor - sets the value of the diameter
	public Sphere(double diameter)
	{
		setDiameter(diameter);
		
	}
	
	// Mutator or Setter for setting the value of the diameter and calls the other setter methods: Volume and Area
	public void setDiameter(double diameter)
	{
		this.diameter = diameter;
		setVolume();
		setArea();
	}
	
	// diameter getter or accessory
	public double getDiameter()
	{
		return diameter;
	}
	
	// setter for volume
	private void setVolume()
	{
		volume = Math.PI * (4.0/3.0) * Math.pow(diameter, 3); 
	}
	
	//getter for volume
	public double getVolume()
	{
		return volume;
	}
	
	//setter for area
	private void setArea()
	{
		area = Math.PI * 4.0 * Math.pow(diameter/2.0, 2);
	}
	
	// getter for area
	public double getArea()
	{
		return area;
	}
	
	// Returns a string for a representation of a sphere
	public String toString()
	{
		String text = String.format("Diameter: %.2f\tVolume: %.2f\tSurface Area: %.2f", diameter, volume, area);
		return text;
	}

	

	

}
