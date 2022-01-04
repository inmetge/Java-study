import java.util.Scanner;

public class exercise_5_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		for(int i=101; i<2100; i++) {
			if((i%4==0&&i%100!=0||i%400==0)) {
				System.out.print(i+"  ");
				n++;
				if(n%10==0) {
					System.out.println();
				}
			}
		}
		System.out.print("\nThe number of leap year is " + n);

	}

}
