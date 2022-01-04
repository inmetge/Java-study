import java.util.Scanner;

public class exercise_5_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 8;
		for(int i=1; i<n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.println("   ");
			for(int k=1; k<=i-1; k++)
				System.out.printf("%4d",(int)Math.pow(2, k-1));
			for(int k=i;k>=1;k--)
				System.out.printf("%4d",(int)Math.pow(2, k-1));
			
			System.out.println();
			}
		}

	}

}
