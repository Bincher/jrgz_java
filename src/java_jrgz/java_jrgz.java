//01.기본알고리즘
//연습 Q6. WHILE문과 변수 I값 확인

package java_jrgz;
import java.util.Scanner;

public class java_jrgz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int i = 1;
		int sum = 0;
		
		while (i <= a)
		{
			sum += i;
			i++;
		}
		
		System.out.print("sum = " + sum + " / i = " + i);
	}

}
