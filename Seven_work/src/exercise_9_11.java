import java.util.Scanner;
public class exercise_9_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a,b,c,d,e,f£º ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation l = new LinearEquation(a,b,c,d,e,f);
		if(!l.isSolvable()) {
			System.out.println("The equation has no roots.");
		}else {
			System.out.println("x is " + l.getX() +
					" and y is " + l.getY());
		}
		
	}

}

class LinearEquation{
	
	private double a,b,c,d,e,f;
	
	public LinearEquation(double x1, double x2, double x3,
					      double x4, double x5, double x6) {
		a = x1;
		b = x2;
		c = x3;
		d = x4;
		e = x5;
		f = x6;
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
	
	public double getD() {
		return d;
	}
	
	public double getE() {
		return e;
	}
	
	public double getF() {
		return f;
	}
	
	public boolean isSolvable() {
		return a*d-b*c!=0;
	}
	
	public double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	
	public double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
}