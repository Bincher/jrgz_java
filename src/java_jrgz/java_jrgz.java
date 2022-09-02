//02.기본 자료구조
//연습 Q1. 난수와 배열

package java_jrgz;
import java.util.*;

public class java_jrgz {
	static int maxOf(int a[]){
		int max = a[0];
		
		for (int i = 1; i < a.length; i++)
		{
			if (a[i] > max) max = a[i];
		}
		return max;
		
	}
	public static void main(String[] args) {
		long seed = System.currentTimeMillis();
		Random r = new Random(seed);
		int[] num = new int[100];
		int size = r.nextInt(1,100);
		for (int i = 0; i < size; i++)
		{
			num[i] = 100 + r.nextInt(90);
			System.out.print((i + 1) + "번째 사람의 키는 " + num[i] + "\n");
		}
		System.out.print("가장 키가 큰 사람의 키는 " + maxOf(num));
	}
}
