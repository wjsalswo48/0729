
public class WhileDemo {
	public static void main(String[] args) {
		char ch = 'A';
		int count = 0;
		int i = 0;
		while(i<100){
			if(count<5) {
				System.out.printf("%c\t",ch+i);
				count++;
				if(count==5) {
					System.out.println();
				}
			}
			else if(5<=count&&count<10) {
				System.out.printf("%c\t",ch+i+32);
				count++;
				if(count==10) {
					System.out.println();
					count=0;
				}
			}
			if(ch+i+32=='Z'||ch+i+32=='z') {
				break;
			}
			i++;
		}
	}
}
