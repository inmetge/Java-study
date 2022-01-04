import java.util.Scanner;
public class exercise_3_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		if(a+b<=c || a+c<=b || b+c<=a) {
			System.out.println("Error");
		}else {
			System.out.println(a+b+c);
		}
	}
}
