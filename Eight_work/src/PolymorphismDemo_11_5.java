
public class PolymorphismDemo_11_5 {

	public static void main(String[] args) {
		// Display circle and rectangle properties
		displayObject(new Circle_11_2(1,"red",false));
		displayObject(new Rectangle_11_3(1,1,"black",true));

	}
	public static void displayObject(GeometricObject_11_1 object) {
		System.out.println("Created on " + object.getDateCreated() + 
				". Color is " + object.getColor());
	}

}
