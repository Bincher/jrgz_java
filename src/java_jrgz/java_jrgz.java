//02.기본 자료구조
//실습 2C-1. for-each문

package java_jrgz;
import java.util.*;

public class java_jrgz {
	public static void main(String[] args) {
		double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("a[" + i + "] = " + a[i]);
		}
		double sum = 0;
		
		for(double i : a)
		{
			sum += i;
		}
		
		System.out.println("배열의 합은 " + sum);
	}
}
