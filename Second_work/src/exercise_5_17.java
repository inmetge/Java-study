import java.util.Scanner;
public class exercise_5_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��1~15�����֣�");
		
		int n = input.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<=2*n-1; j++) {
				if(j<n-i||j>n+i)
					System.out.println(" ");
				else if(j>=n-i&&j<=n)
					System.out.println(n-j+1);
				else if(j>n&&j<=n+i)
					System.out.println(j-n+1);
			}
			System.out.println();
		}
	}
}
