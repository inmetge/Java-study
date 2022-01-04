import java.util.Scanner;

public class exercise_5_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Loan Amount: ");
		double loan = input.nextDouble();
		System.out.println("Number of Years: ");
		double year = input.nextDouble();
		System.out.println("Annual Interest Rate: ");
		double rate = input.nextDouble();
		
		double monthlyRate = rate/1200;
		double monthlyPay = loan*monthlyRate/(1-1/Math.pow(1+monthlyRate, 12*year));
		double totalPay = monthlyPay*12*year;
		double x,y,z;
		
		double interest,principal;
		double balance=loan;
		System.out.printf("Monthly Payment: %.2f\ntTotal Payment: %.2f\nPayment#    Interest    Pricipal    Balance\n",monthlyPay,totalPay);
		for(int i = 0; i<= 24; i++) {
			interest = balance*monthlyRate;
			principal = monthlyPay - interest;
			balance = balance - principal;
			System.out.printf("%-4d%13.2f%13.2f%13.2f\n",i,interest,principal,balance);
		}

	}

}
