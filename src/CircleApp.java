import java.util.*;
import java.io.InputStream;
import java.lang.Math;
import java.text.NumberFormat;


public class CircleApp {
	
	//Create Circle class
	//public class Circle{
		
	//Circle class constructors
	public void Circle(double radius){

	}//end constructor*/
	
	//Methods
	public static double getCircumference(double radius){
		double area = 2 * Math.PI * radius;
		return area;
	
	}// end getCircumference method
	
	//public String getFormattedCircumference(){
		
		
	//}//end getFormattedCircumference method
	
	public static double getArea(double radius){
	  
		double area = Math.PI * radius * radius;
		return area;
		
	}//end getArea method
	
	//public String getFormattedArea(){
		
		
	//}//end getFormattedArea method
	
	//public static int getObjectCount(){
		//Circle myCircle = new Circle (number);
	//}//end getObjectCount
	
	

	public static void main(String[] args) {
		
		//Variables
		int number; 
		String answer = "y";
		
		//Create scanner;
		Scanner input = new Scanner(System.in);
		
		do{
		// Welcome message
		System.out.println("Welcome to the Circle Tester");
		System.out.println();
		
		//Prompt user to enter a radius
		System.out.println("Enter radius:");
		number = input.nextInt( );
		
		//Display error if input invalid
		
		
		//Calculate area and circumference of circle 
		System.out.printf("Circumference: %.2f \n", getCircumference(number));
        System.out.printf("Area: %.2f \n", getArea(number));
		
		//Prompt user to continue
		System.out.println("Continues? (y/n): ");
		input.nextLine();
		
		//Clears out scanner
		input.nextLine();
		
		//While loop to allow user to continue
		}while(answer.equalsIgnoreCase("y"));
	
		//Display goodbye message that includes number of circles user built
		//System.out.println("Goodbye. You created" +number +"");
		
		
		

	}//psvm

	}//end circle class
		
//}//ends class CircleApp


