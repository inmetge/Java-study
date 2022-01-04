
public class exercise_5_7 {

	public static void main(String[] args) {
		double[] dollar = new double[15];
		double rate = 1.005;
		dollar[0] = 10000.0;
		
		for(int i=0; i<15; i++) {
			dollar[i] = dollar[i-1]*rate;
		}
		double money = dollar[11] + dollar[12] + dollar[13] + dollar[14];
		System.out.println("十年后的学费是： " + String.format("%.2f", dollar[11]));
		System.out.println("十年后的总学费是： " + String.format("%.2f", money));
	}

}
