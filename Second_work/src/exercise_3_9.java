import java.util.Scanner;
public class exercise_3_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		String str = input.next();
		
		int n = 0;
		for(int i=0; i<9; i++) {
			int temp = (int)(str.charAt(i)-'0');
			n += temp * (i + 1);
		}
		
		n%= 11;
		if(n==10) {
			str += 'X';
		}else {
			str += n;
		}
		System.out.println("The ISBN-10 number is " + str);
	}

}
