import java.util.Scanner;
import java.util.ArrayList;

public class Pow_11_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		int n = 1;
		int i = 0;
		
		ArrayList<Integer> factor = new ArrayList<>();
		int initial = m;
		int f = 2;
		while(f<=m) {
			if(m%f == 0) {
				factor.add(f);
				m = m/f;
			}else {
				f++;
			}
		}
		
		while(i < factor.size()-1) {
			if(factor.get(i)!=factor.get(i)+1) {
				n*= factor.get(i);
				i += 1;
			}else {
				i += 1;
			}
		}
		
		if (i == factor.size()-1) {
			n*=factor.get(i);
		}
		System.out.println("The smallest number n for m * n to be a perfect squate is "
				+ n);
		System.out.println("m * n is " + initial*n);
	}

}
