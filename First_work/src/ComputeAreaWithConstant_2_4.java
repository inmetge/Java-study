import java.util.Scanner;
public class ComputeAreaWithConstant_2_4 {

	public static void main(String[] args) {
		final double PI = 3.14159;	// Declare a constant
		
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a radius
		System.out.print("Enter a nember for radius: ");
		double radius = input.nextDouble();
		
		// Compute area
		double area = radius * radius * PI;
		
		// Display results
		System.out.println("The area for the circle of radius " + 
				radius + " is " + area);
	}
}
