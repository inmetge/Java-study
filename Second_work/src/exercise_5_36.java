import java.util.Scanner;

public class exercise_5_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int n = input.nextInt();
		int initial = n;
		int total=0;
		for(int i=9; i>0;i--) {
			total += (n%10)*i;
			n /= 10;
		}
		System.out.print("The ISBN-10 number is " + initial);
		if(total%11 != 10) {
			System.out.print(total%11);
		}else {
			System.out.print("X");
		}
		
	}

}
