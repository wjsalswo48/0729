import java.util.Scanner;
public class ForDemo1 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		//System.out.print("몇 단 ?:");
		//int dan = sn.nextInt();
//		for(int i = 1; i<dan; i++) {
//			System.out.printf("%d x %d = %d\n",i,i,i*i);
//		}
		//차례로 별찍기
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//반대로 별찍기
//		for(int i=0;i<5;i++) {
//			for(int j=i;j<5;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i = 4; i>=0;i--) {
//			for(int j=0;j<=4;j++) {
//				if(j<i) {
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//		for(int i = 0; i<5;i++) {
//			for(int j=0;j<5;j++) {
//				if(j<i) {
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		//마름모
		for(int i = 5; i>0;i--) {
			for(int j=0;j<6;j++) {
				if(j>=i) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		for(int i=0;i<6;i++) {
			System.out.print("* ");
		}
		System.out.println();
		for(int i = 0; i<5;i++) {
			for(int j=0;j<6;j++) {
				if(j>i) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		//구구단
//		for(int i = 1; i<10;i++) {
//			for(int j =2; j<10;j++) {
//				System.out.printf("%d x %d = %d \t",j,i,i*j);
//			}
//			System.out.print("\n");
//		}
		
	}
}