import java.util.GregorianCalendar;
public class exercise_9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar g = new GregorianCalendar();
		
		System.out.println("now1: " + g.get(GregorianCalendar.YEAR)+ "/" +
				(g.get(GregorianCalendar.MONTH)+1) + "/" + g.get(GregorianCalendar.DAY_OF_MONTH));
		
		g.setTimeInMillis(1234567898765L);
		System.out.println("now2: " + g.get(GregorianCalendar.YEAR)+ "/" +
				(g.get(GregorianCalendar.MONTH)+1) + "/" + g.get(GregorianCalendar.DAY_OF_MONTH));
		
	}

}
