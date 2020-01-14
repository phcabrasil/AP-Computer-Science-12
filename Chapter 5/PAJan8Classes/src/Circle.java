/*
* Class Name: Circle
* Date Created: January 10th 2020
* Author: Pedro Amui
* Details: Circle consists of double radius set in constructor
* Methods: area - calculates area of circle
* 		   circumference - calculates circumference of circle
* 		   setRadius - sets new double for radius
* 		   diameter - calculates diameter of circle
*/

public class Circle {
	
	public double radius; //Radius
	
	public Circle(double radius) //Circle Constructor with Radius Parameter
	{
		this.radius = radius;
	}
	
	public double area() //Calculate Area
	{
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double circumference() //Calculate Circumference
	{
		return 2 * Math.PI * radius;
	}
	
	public double diameter() //Calculate Diameter
	{
		return 2 * radius;
	}
	
	public void setRadius(double radius) //Set New Radius
	{
		this.radius = radius;
	}
	
}