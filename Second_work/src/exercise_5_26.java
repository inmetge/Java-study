import java.util.Scanner;

public class exercise_5_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("i =  ");
		int i = input.nextInt();
		double e=1.0,mul=1.0;
		for (int j=0; j<i; j++ ) {
			mul *= j+1;
			e += 1.0/mul;
		}
		System.out.printf("e =  " + e);
	}

}
