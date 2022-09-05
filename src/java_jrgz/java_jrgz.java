//02.기본 자료구조
//연습 Q8. 윤년포함한 날짜계산(변수 days,i 삭제버전) 

package java_jrgz;
import java.util.*;

public class java_jrgz {
	static int [][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	static int dayOfYear(int y, int m, int d) {
		m -= 2;
		while(m >= 0)
		{
			d += mdays[isLeap(y)][m--];
		}
		return d;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int retry;
		
		do {
			System.out.print("년 : ");
			int year = s.nextInt();
			System.out.print("월 : ");
			int month = s.nextInt();
			System.out.print("일 : ");
			int day = s.nextInt();
			
			System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year,month,day));
			
			System.out.print("다시 하시겠습니까?(1=yes, 0=no) : ");
			retry = s.nextInt();
		}while(retry == 1);
	}
}
