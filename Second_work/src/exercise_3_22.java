import java.util.Scanner;
public class exercise_3_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius = 10.0;
		System.out.println("Enter a point with two coorinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		if(radius>=distance) {
			System.out.println("Point ( " + x + " , " + y + ") is in the circle");
		}else {
			System.out.println("Point ( " + x + " , " + y + ") is not in the circle");
		}

	}

}
