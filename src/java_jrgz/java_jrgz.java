//02.기본 자료구조
//연습 Q11. 서기 년월일과 날짜반환 그리고 클래스

package java_jrgz;
import java.util.*;

public class java_jrgz {
	
	
	static class YMD{
		
		int [][] dYear = {
				{31,29,31,30,31,30,31,31,30,31,30,31},
				{31,28,31,30,31,30,31,31,30,31,30,31},
		};
		
		int getYear(int y) {
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
				return 0;
			else
				return 1;
		}
		
		int y;
		int m;
		int d;
		
		public YMD(int y, int m, int d){
			this.y = y;
			this.m = m;
			this.d = d;
		}
		
		public YMD before(int n) {
			if (n < 0)
			      return after(-n);
			YMD temp = new YMD(y, m, d);
		    temp.d -= n;
		    while (temp.d < 1) 
		    {
		      temp.d += dYear[getYear(temp.y)][temp.m -1];
		      if (--temp.m == 0) 
		      {
		        temp.y--;
		        temp.m = 12;
		      }
		    }
		    return temp;
		}
		
		public YMD after(int n) {
			if (n < 0)
			      return before(-n);
			
			YMD temp = new YMD(y, m, d);
		    temp.d += n;
		    while (temp.d > dYear[getYear(y)][temp.m - 1]) 
		    {
		      temp.d -= dYear[getYear(y)][temp.m-1];
		      if (++temp.m == 13) 
		      {
		        temp.y++;
		        temp.m = 1;
		      }
		    }
		    return temp;
		}
	}
	public static void main(String[] args) {
		YMD a = new YMD(2022, 06, 16);
		a = a.after(31);
		System.out.print(a.y + "년 " + a.m + "월 " + a.d + "일\n");
		a = a.before(31);
		System.out.print(a.y + "년 " + a.m + "월 " + a.d + "일\n");
		
	}
}
