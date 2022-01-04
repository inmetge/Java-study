import java.util.Random;
public class exercise_9_4 {

	public static void main(String[] args) {
		// 创建random对象
		Random random = new Random(1000);
		int n = 0;
		for(int i=0;i<50;i++) {
			n += 1;
			System.out.print(random.nextInt(101)+" ");
			if(n%5==0) {
				System.out.print("\n");
			}
		}

	}

}
