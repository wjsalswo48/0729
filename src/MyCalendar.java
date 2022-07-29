import java.util.GregorianCalendar;
import java.util.Scanner;
public class MyCalendar {
	static GregorianCalendar gc = new GregorianCalendar();
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.print("Year : ");
		int year = sn.nextInt();
		System.out.print("Month : ");
		int month = sn.nextInt();
		//System.out.print("Day : ");
		//int day = sn.nextInt();
		//day-=1;
		int sum = 0;
		for(int i = 1 ; i<year; i++) {
			if(year%400==0||(year%4==0&&year%100!=0)) {
				sum += 366;
			}else {
				sum += 365;
			}
		}
		for(int i =1; i<month;i++) {
			sum += getLastDay(year,i);
			//sum -= day;
		}
		sum++;
		System.out.println("<<<"+year+"년, "+month+"월>>>");
		System.out.println("日\t月\t火\t水\t木\t金\t土");
		int space = sum%7;
		int count = 0;
		int count2 = 0;
		for(int i = 0 ; i<space;i++) {
			System.out.print("★\t");
			count++;
			count2++;
		}
		int lastday = getLastDay(year, month);
		for(int i=1;i<=lastday;i++) {
			System.out.printf("%d\t",i);
			count++;
			count2++;
			if(count%7==0)System.out.println();
		}
		int r = 42-count2;
		for(int i = r; i>0; i--) {
			System.out.print("★\t");
		}
//		switch(sum % 7) {
//		case 0:System.out.println("SUN");break;
//		case 1:System.out.println("MON");break;
//		case 2:System.out.println("TUE");break;
//		case 3:System.out.println("WED");break;
//		case 4:System.out.println("THU");break;
//		case 5:System.out.println("FRI");break;
//		case 6:System.out.println("SAT");break;
//		}
	}
	static int getLastDay(int year,int month) {
		int lastDay = 0;
		if(month==2) {
			if(year%400==0||(year%4==0&&year%100!=0)) lastDay = 29;
			else return lastDay = 28;
		}else if(month != 2) {
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
				lastDay = 31;
			else lastDay = 30;
		}
		return lastDay;
	}
}

