
public class Rectangle_11_3 extends GeometricObject_11_1 {
	private double width;
	private double height;
	
	public Rectangle_11_3() {
	}
	
	public Rectangle_11_3(double width,double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle_11_3(
			double width,double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	/** Return width */
	public double getWidth() {
		return width;
	}
	
	/** Set a new width */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/** Return height */
	public double getHeight() {
		return height;
	}
	
	/** Set a new height */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/** Return area */
	public double getArea() {
		return width * height;
	}
	
	/** Return perimeter */
	public double getPerimeter() {
		return 2 * (width + height);
	}
}

