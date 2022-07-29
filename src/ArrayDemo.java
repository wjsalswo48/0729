
public class ArrayDemo {
	public static void main(String[] args) {
		int []array=new int[4];
		array[0] =4; array[0] =2; array[0] =9; array[0] =5;
		
		int[]array1;
		array1=new int[] {4,2,9,5};
		
		int []array2={4,2,9,5};
		
		double []array3;
		array3 = new double[3];
		array3[0]=67.9;array3[1]=43.7;array3[2]=56.2;
		
		double []array4;
		array4 = new double[] {67.9,43.7,56.2};
		
		double []array5= {67.9,43.7,56.2};
		
		char[] avg;
		avg = new char[5];
		avg[0]='A';avg[1]='B';avg[2]='C';avg[3]='D';avg[4]='F';
		
		char[] avg1 ;
		avg = new char[] {'A','B','C','D','F'};
		
		char[] avg2 = {'A','B','C','D','F'};
		
		boolean[] boolarr = new boolean[3];
		boolarr[0]=true;boolarr[1]=false;boolarr[2]=false;
		
		boolean[] boolarr1;
		boolarr1 = new boolean[] {true,false,false};
		
		boolean[] boolarr2= {true,false,false};
		
		String[] Student = new String[4];
		Student[0]="한지민";Student[1]="박지민";Student[2]="헨리";Student[3]="마이클 잭슨";
		
		String[] Student1;
		Student1 = new String[] {"한지민","박지민","헨리","마이클 잭슨"};
		
		String[] Student2 = {"한지민","박지민","헨리","마이클 잭슨"};
		
		for(int i=0; i<3;i++) {
			System.out.println(boolarr[i]);
		}
	}
}
