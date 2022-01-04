import java.util.Scanner;

public class exercise_5_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = 0,i = 0,r;
		while(x>0) {
			r = x%2;
			i++;
			y += r*Math.pow(10, i);
			x/=2;
		}
		System.out.println("The number in binary is " + y);
	}

}
