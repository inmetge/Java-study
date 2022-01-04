import java.util.Scanner;
public class exercise_3_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter r1's x- and y-coordinates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		System.out.print("Enter r2's x- and y-coordinates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();
		if(x2-w2/2>=0&&y2-h2/2<=0&&x2+w2/2<=x1+w1/2&&y2+h2/2<=y1+h1/2) {
			System.out.println("r2 is inside r1");
		}else if(x2-w2/2<=x1+w1||x2+w2/2>=0||y2-h2/2<=y1+w1/2||y2+w2/2>=0){
			System.out.println("r2 overlaps r1");
		}else {
			System.out.println("r2 does not overlap r1");
		}

	}

}
