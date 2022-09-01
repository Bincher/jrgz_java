//01.기본알고리즘
//연습 Q2. 3개의 수 최솟값

package java_jrgz;

public class java_jrgz {
	static int min3(int a, int b, int c) {
		
		int min = a;
		
		if (b<min)
			min = b;
		if (c<min)
			min = c;
		
		return min;
		
	}
	public static void main(String[] args) {
		int num = min3(3,1,2);
		System.out.print(num);
	}

}
