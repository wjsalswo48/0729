import java.util.*;
public class ForDemo {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num = sn.nextInt();
//		for(int i = num; i<10000; i*=num) {
//			System.out.printf("%d \n",i);
//		}
		int result = 1;
		for(int i=num; i>0;i--) {
			result*=i;
		}
		System.out.println(result);
	}
}
