//01.기본알고리즘
//연습 Q3. 3개의 수 최솟값

package java_jrgz;

public class java_jrgz {
	static int min4(int a, int b, int c, int d) {
		
		int min = a;
		
		if (b<min)
			min = b;
		if (c<min)
			min = c;
		if (d<min)
			min = d;
		
		return min;
		
	}
	public static void main(String[] args) {
		int num = min4(30,20,10,20);
		System.out.print(num);
	}

}
