import java.util.Scanner;
public class exercise_3_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year: (e.g., 2012): ");
		int year = input.nextInt();
		System.out.println("Enter month: 1-12: ");
		int m = input.nextInt();
		System.out.println("Enter the day of the month: 1-31: ");
		int d = input.nextInt();
		
		if(m==1) {
			m = 13;
			year -= 1;
		}else if(m==2) {
			m = 14;
			year -= 1;
		}
		
		int a = year/100;
		int b = year%100;
		int c = (d + 26 * (m + 1) / 10 + b + b / 4 + a / 4 + 5 * a) % 7;
		if(c==0) {
			System.out.println("Day of the week is Saturday");
		}else if(c==1){
			System.out.println("Day of the week is Sunday");
		}else if(c==2){
			System.out.println("Day of the week is Monday");
		}else if(c==3){
			System.out.println("Day of the week is Tuesday");
		}else if(c==4){
			System.out.println("Day of the week is Wednesday");
		}else if(c==5){
			System.out.println("Day of the week is Thursday");
		}else if(c==6){
			System.out.println("Day of the week is Friday");
		}
	}
}
