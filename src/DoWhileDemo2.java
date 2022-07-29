
public class DoWhileDemo2 {
	public static void main(String[] args) {
		//1부터 6까지의 랜덤값을 추출하되 서로 다른 2개를 출력하는 프로그램
		int num1;
		int num2;
		
		do {
			num1 = (int)(Math.random()*6+1);
			num2 = (int)(Math.random()*6+1);
			System.out.printf("num1의 숫자는 %d\n",num1);
			System.out.printf("num2의 숫자는 %d\n",num2);
			if(num1!=num2)System.out.println("다시 돌리겠습니다\n");
		}while(num1!=num2);
		System.out.printf("두 숫자는 %d로 동일합니다",num1);
		System.out.println();
		
		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		int n6;
		do {
			n1 = (int)(Math.random()*45+1);
			n2 = (int)(Math.random()*45+1);
			n3 = (int)(Math.random()*45+1);
			n4 = (int)(Math.random()*45+1);
			n5 = (int)(Math.random()*45+1);
			n6 = (int)(Math.random()*45+1);
		}while(((n1==n2)||(n1==n3)||(n1==n4)||(n1==n5)||(n1==n6))||((n2==n3)||(n2==n4)||(n2==n5)||(n2==n6))||
				((n3==n4)||(n3==n5)||(n3==n6))||((n4==n5)||(n4==n6))||(n5==n6));
		System.out.printf("%d %d %d %d %d %d",n1,n2,n3,n4,n5,n6);
	}
}
