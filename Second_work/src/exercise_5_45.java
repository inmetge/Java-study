import java.util.Scanner;

public class exercise_5_45 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double n,sum1=0,sum2=0;
		double average=0,deviation=0;
		System.out.print("Enter 10 numbers:");
		for(int i = 0;i<=10;i++) {
			n = input.nextDouble();
			sum1 += n;
			sum2 += n*n;
		}
		average = sum1/10;
		deviation = Math.sqrt((sum2-sum1*sum1/10)/9);
		System.out.printf("The mean is %.2f\n",average);
		System.out.printf("The deviation is %.5f",deviation);

	}

}
