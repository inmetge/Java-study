import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AdditionQuiz_11_16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> answer = new ArrayList<>();
		Random ran = new Random();
		int num1 = ran.nextInt();
		int num2 = ran.nextInt();
		
		System.out.println("what is " + num1 + " + " + num2 + "?");
		
		answer.add(input.nextInt());
		while(!answer.contains(num1 + num2)) {
			System.out.println("wrong answer.try again, what is " + num1 +
							" + " + num2 + "?");
			answer.add(input.nextInt());
		}
		
		System.out.println("You got it!");

	}

}
