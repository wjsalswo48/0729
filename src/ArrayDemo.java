
public class ArrayDemo {
	public static void main(String[] args) {
		int [] arr = new int[100];
		for(int i = 0; i<100;i++) {
			arr[i]=i;
		}
		for(int i = 0; i<100;i++) {
			System.out.printf("%d\n",arr[i]);
		}
	}
}
