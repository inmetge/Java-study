import java.util.Scanner;
public class exercise_9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("��ֱ�����a��ֵ�� ");
		double a = input.nextDouble();
		System.out.println("��ֱ�����b��ֵ�� ");
		double b = input.nextDouble();
		System.out.println("��ֱ�����c��ֵ�� ");
		double c = input.nextDouble();
		
		QuadraticEquation q = new QuadraticEquation(a,b,c);
		if(q.getDiscriminant()>0) {
			System.out.println("x1 = " + q.getRoot1());
			System.out.println("x2 = " + q.getRoot2());
		}else if (q.getDiscriminant() == 0) {
			System.out.println("x1 = x2 = " + q.getRoot1());
		}else {
			System.out.println("The equation has no roots.");
		}
	}

}

class QuadraticEquation{
	private double a;
	private double b;
	private double c;
	
	public  QuadraticEquation(double x,double y,double z) {
		a = x;
		b = y;
		c = z;
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	public double getDiscriminant() {
		return b*b-4*a*c;
	}
	
	public double getRoot1() {
		return (-b+Math.sqrt(getDiscriminant()))/(2*a);
	}
	
	public double getRoot2() {
		return (-b-Math.sqrt(getDiscriminant()))/(2*a);
	}
}
