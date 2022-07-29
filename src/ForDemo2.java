
public class ForDemo2 {
	public static void main(String[] args) {
		/*
		 * x는 1부터 2씩 증가,
		 * y는 100부터 3씩 감소할 때
		 * 교차할 때의 x,y의 값은?
		 */
		int x,y;
		for(x=1,y=100;x<101;x+=2,y-=3) {
			if(x>y)break;
		}
		System.out.printf("x=%d, y=%d\n",x,y);
		
		//1부터 10까지 출력하기
		int z = 1;
		while(z<11) {
			System.out.print(z+" ");
			z++;
		}
		System.out.println();
		int col=1;
		while(col<10) {
			int row = 2;
			while(row<10) {
				System.out.printf("%d X %d = %d \t",row,col,col*row);
				row++;
			}
			col++;
			System.out.println();
		}
	}
}
