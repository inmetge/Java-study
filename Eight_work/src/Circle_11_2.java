
public class Circle_11_2 extends GeometricObject_11_1 {
	private double radius;
	
	public Circle_11_2() {
		
	}
	
	public Circle_11_2(double radius) {
		this.radius = radius;
	}
	
	public Circle_11_2(double radius,
		String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
		
	}
	
	/** Return radius */
	public double getRadius() {
		return radius;
	}
	
	/** Set a new radius */
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}
	
	/** Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	/** Print the circle info */
	public void printCricle() {
		System.out.println("The circle is created " + 
				getDateCreated() + " and the radius is " + radius);
	}
}
