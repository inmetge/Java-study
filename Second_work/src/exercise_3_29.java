import java.util.Scanner;

public class exercise_3_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r1's x- and y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		System.out.print("Enter r2's x- and y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		if((x1*x1-x2*x2)+(y1*y1-y2*y2)<=(r1-r2)*(r1-r2)) {
			System.out.println("circle2 is inside circle1");
		}else if((x1*x1-x2*x2)+(y1*y1-y2*y2)<=(r1+r2)*(r1+r2)){
			System.out.println("circle2 overlaps circle1");
		}else {
			System.out.println("circle2 does not overlap circle1");
		}

	}

}
