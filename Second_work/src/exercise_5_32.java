import java.util.Scanner;

public class exercise_5_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		while(num1==num2) {
			num2 = (int)(Math.random()*10);
		}
		System.out.println(num1+num2);
	}

}
