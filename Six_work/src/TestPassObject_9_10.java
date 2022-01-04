
public class TestPassObject_9_10 {

	public static void main(String[] args) {
		// Create a Circle object with radius 1
		Circle_9_8 myCircle = new Circle_9_8(1); 	// Use the Circle class in Listing 9.8
		
		// Print areas for radius 1,2,3,4,and 5
		int n = 5;
		printAreas(myCircle, n);
		
		// See myCircle.radius and times
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);
	}
	
	/** Print a table of areas for radius */
	public static void printAreas(Circle_9_8 c,int times) {
		System.out.println("Radius \t\tArea");
		while(times>=1) {
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}
}
