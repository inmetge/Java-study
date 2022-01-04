import java.util.Date;
public class exercise_9_3 {

	public static void main(String[] args) {
		// 设置初始流逝时间
		long t = 10000;
		// 创建Date对象
		Date date = new Date(t);
		// 通过循环设置新的流逝时间
		for(int i = 0;i < 7;i++) {
			date.setTime(t);
			printDate(t,date);
			t *= 10;
		}

	}
	// 输出日期
	public static void printDate(long t,Date date) {
		System.out.println(t + ": " + date.toString());
	}
	
}
