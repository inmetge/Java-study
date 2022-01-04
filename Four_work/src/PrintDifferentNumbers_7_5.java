/** 输出不同的数 */
public class PrintDifferentNumbers_7_5 {
	
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int num=0,index = 0;
		int[] number = new int[10];
		System.out.print("Enter 10 numbers: ");
		
		/* input 10 numbers */
		for(int i=0;i<10;i++) {
			num = input.nextInt();
			boolean f=true;
			for(int j=0;j<index+1;j++) {
				if(number[j]== num) {
					f=false;
				}
			}
			if(f==true) {
				number[index++]=num;
			}
		}

		System.out.println("The number of distinct numbers is " +
							(index));
		System.out.print("The distinct numbers are: ");
		for(int i=0;i<index;i++) {
			System.out.print(number[i]+" ");
		}
	}

}
