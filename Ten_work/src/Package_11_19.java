import java.util.Scanner;
import java.util.ArrayList;

public class Package_11_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int j=1;
		System.out.print("Enter the number of objects: ");
		int n = input.nextInt();
		System.out.print("Enter the weights of objects: ");
		int[] number = new int[n];
		int[] weight = new int[n];
 		for(int i=0; i<n; i++) {
			weight[i] = input.nextInt();
		}
 		
 		int count = 0;
 		int position = 1;
 		while(count<n) {
 			int last = 0;
 			System.out.print("Container " + position + " contains objects with weight ");
 			for (int i =1; i<=n ;i++) {
 				if(last + weight[i] <= 10 && number[i] == 0) {
 					System.out.print(" " + weight[i]);
 					number[i] = 1;
 					last += weight[i];
 					count++;
 				}
 			}
 			System.out.println();
 			position++;
 		}
 		
	}

}
