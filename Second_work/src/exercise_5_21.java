import java.util.Scanner;

public class exercise_5_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Loan Amount: ");
		double loan = input.nextDouble();
		System.out.println("Number of Years: ");
		double year = input.nextDouble();
		
		double x,y,z;
		System.out.println("Interest Rate    Monthl Payment    Total Payment");
		for(int i = 0; i<= 24; i++) {
			x = (5+i/8.0)*0.01/12;
			y = loan*x/(1-1/Math.pow(1+x, 12*year));
			z = y*year*12;
			System.out.printf("%13.3f%13.2f%13.2f\n",5+i/8.0,y,z);
		}
	}

}
