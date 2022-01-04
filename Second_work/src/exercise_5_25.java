import java.util.Scanner;

public class exercise_5_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("i =  ");
		int i = input.nextInt();
		double p=0;
		for (int j=0; j<i; j++ ) {
			p += Math.pow(-1, j+1)/(2*j-1);
		}
		System.out.printf("¦° =  " + 4*p);

	}

}
