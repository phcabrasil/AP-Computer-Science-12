/*
* Name: Pedro Amui
* Date: January 10th 2020
* Assignment Name: Circle Class
* Description: Allows user to input desired radius and outputs desired information of the circle
* Inputs: Radius and Desired Output
* Outputs: Desired Output
*/

import java.util.*;
import java.text.*;

public class Main {
	
	//Static Variables
	private static Scanner userInput;
    private static DecimalFormat df = new DecimalFormat("#.##");

	
	public static void main(String[] args) {
		
		//End Output While Loop
		boolean isOver = false;
		
		userInput = new Scanner(System.in);
		
		//Input Initial Radius
		System.out.println("Please enter the radius of your circle:");
		double inputRadius = userInput.nextDouble();
		
		//Create Circle Object
		Circle userCircle = new Circle(inputRadius);
		
		//Output While Loop
		while(true) {
			
			//Desired Action Menu and Input
			System.out.println("Select desired action:");
			System.out.println("\tA - Area");
			System.out.println("\tC - Circumference");
			System.out.println("\tD - Diameter");
			System.out.println("\tS - Set New Radius");
			System.out.println("\tQ - Quit");
			char inputAction = userInput.next().charAt(0);
			inputAction = Character.toLowerCase(inputAction);
			
			//Case of Desired Action
			switch(inputAction) {
				case 'a': //Area
					System.out.println("Area: " + df.format(userCircle.area()));
				break;
				case 'c': //Circumference
					System.out.println("Circumference: " +  df.format(userCircle.circumference()));
				break;
				case 'd': //Diameter
					System.out.println("Diameter: " +  df.format(userCircle.diameter()));
				break;
				case 's': //Set New Radius
					System.out.println("Set New Radius:");
					inputRadius = userInput.nextDouble();
					userCircle.setRadius(inputRadius);
				break;
				case 'q': //Quit While Loop
					System.out.println("Program is over");
					isOver = true;
				break;
			}
			if(isOver) break; //Break While Loop
		}
		
	}
	
}
