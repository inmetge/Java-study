/** 计算数字出现的次数 */
public class Countnumberofelements_7_3 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] arr = new int[100];
		int num;
		System.out.println("Enter the integers between 1 and 100: ");
		do {
			num = input.nextInt();
			arr[num] += 1;
		}
		while(num!=0);
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==1) {
				System.out.println(i + " occurs 1 time ");
			}else if(arr[i]>1)
			{
				System.out.println(i + " occurs " + arr[i] + " times ");
			}
		}
	}

}
