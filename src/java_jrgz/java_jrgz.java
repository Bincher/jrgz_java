//02.기본 자료구조
//연습 Q6. 기수 변환(그런데 배열순서를 바꾼)

package java_jrgz;
import java.util.*;

public class java_jrgz {
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] temp = new char[32];
		// 0 1 2 3 4 digits = 5
		do {
			temp[digits++] = dchar.charAt(x % r);
			x /= r;
		}while(x != 0);
		for(int i = 0; i < digits; i++)
		{
			d[i] = temp[digits - i - 1];
		}
		
		return digits;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		do {
			do {
				System.out.print("변환할 수 : ");
				no = s.nextInt();
			}while(no<0);
			
			do {
				System.out.print("몇진수로 변환? : ");
				cd = s.nextInt();
			}while(cd < 2|| cd >36);
			
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd + "진수로는 ");
			for(int i = 0; i < dno ; i++)
			{
				System.out.print(cno[i]);
			}
			
			System.out.print("\n반복하시겠습니끼? ( 1.예 / 2.아니요 ) \n >>>>");
			retry = s.nextInt();
		}while(retry == 1);
	}
}
