import java.util.Scanner;

public class WhileDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String y_n;
		do {
			System.out.print("정수를 입력하시오. : ");
			int su = sc.nextInt();
			System.out.println(su+"는"+((su%2==0)?"짝수입니다":"홀수입니다"));
			System.out.print("Againg(y/n)? :");
			y_n = sc.next();
		}while(y_n.equals("Y")||y_n.equals("y"));
		System.out.println("Program is over...");
	}
}