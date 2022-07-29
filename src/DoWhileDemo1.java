import java.util.Scanner;

public class DoWhileDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오. : ");
		int su = sc.nextInt();
		System.out.println(su+"는"+((su%2==0)?"짝수입니다":"홀수입니다"));
		System.out.print("Againg(y/n)? :");
		char ch = sc.next().charAt(0);
		while(true) {
			System.out.print("정수를 입력하시오. : ");
			su = sc.nextInt();
			System.out.println(su+"는"+((su%2==0)?"짝수입니다":"홀수입니다"));
			System.out.print("Againg(y/n)? :");
			ch = sc.next().charAt(0);
			if(ch=='n'||ch=='N')break;
		}
		do {
			System.out.print("정수를 입력하시오. : ");
			su = sc.nextInt();
			System.out.println(su+"는"+((su%2==0)?"짝수입니다":"홀수입니다"));
			System.out.print("Againg(y/n)? :");
			ch = sc.next().charAt(0);
			if(ch=='n'||ch=='N')break;
		}while(true);
		
		
	}
}
