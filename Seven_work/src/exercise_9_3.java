import java.util.Date;
public class exercise_9_3 {

	public static void main(String[] args) {
		// ���ó�ʼ����ʱ��
		long t = 10000;
		// ����Date����
		Date date = new Date(t);
		// ͨ��ѭ�������µ�����ʱ��
		for(int i = 0;i < 7;i++) {
			date.setTime(t);
			printDate(t,date);
			t *= 10;
		}

	}
	// �������
	public static void printDate(long t,Date date) {
		System.out.println(t + ": " + date.toString());
	}
	
}
