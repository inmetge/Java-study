import java.util.Date;
import java.util.Random;
public class exercise_9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[100000];
		Random random = new Random();
		
		for(int i = 0; i<100000; i++) {
			num[i] = random.nextInt(100000);
		}
		
		StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		for(int i =0; i<num.length; i++) {
			int k = i;
			for (int j = k+1; j<num.length; i++) {
				if(num[j]<num[k]) {
					k = j;
				}
			}
			if(i!=k) {
				int temp = num[i];
				num[i] = num[k];
				num[k] = temp;
			}
		}
		stopwatch.stop();
		System.out.println("time: " + stopwatch.getElapsedTime() + "ms");
	}

}

class StopWatch{
	private Date startTime;
	private Date stopTime;
	
	public void StopWatch() {
	}
	
	public void start() {
		startTime = new Date();
	}
	
	public void stop() {
		stopTime = new Date();
	}
	
	public long getElapsedTime() {
		return stopTime.getTime() - startTime.getTime();
	}
	
	public Date getStart() {
		return startTime;
	}
	
	public Date getStop() {
		return stopTime;
	}
}
