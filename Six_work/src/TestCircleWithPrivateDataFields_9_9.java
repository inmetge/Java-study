
public class TestCircleWithPrivateDataFields_9_9 {
	/** Main method */
	public static void main(String[] args) {
		// Create a circle with radius 5.0
		Circle_9_8 myCircle = new Circle_9_8(5.0);
		System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		// Increase myCircle's radius by 10%
		myCircle.setRadius(myCircle.getRadius()*1.1);
		System.out.println("The area of the circle of radius "
				+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		System.out.println("The number of objects created is "
				+ Circle_9_8.getNumberOfObjects());
	}

}
