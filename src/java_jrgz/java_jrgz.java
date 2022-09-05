//02.기본 자료구조
//실습 2-11. 소수찾기(제곱근 사용) 

package java_jrgz;
import java.util.*;

public class java_jrgz {
	public static void main(String[] args) {
		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		
		for(int n = 5; n <= 1000; n++)
		{
			boolean flag = false;
			for (int i = 0; prime[i] * prime[i] <= n; i++)
			{
				counter += 2;
				if (n % prime[i] == 0)
				{
					flag = true;
					break;
				}
			}
			if (!flag)
			{
				prime[ptr++] = n;
				counter++;
			}
			
			for (int i = 0; i < ptr; i++)
			{
				System.out.println(prime[i]);
			}
			System.out.println("곱셈과 나눗셈을 수행한 횟수 : "+ counter);
		}
	}
}
