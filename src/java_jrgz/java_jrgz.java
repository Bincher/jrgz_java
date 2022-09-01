//01.기본알고리즘
//연습 Q8. 가우스덧셈

package java_jrgz;
import java.util.Scanner;

public class java_jrgz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		if (n % 2 == 0)
		{
			sum = (1 + n) * (n / 2);
		}
		else
			sum = (n) * (n / 2 + 1);
		
		System.out.print(sum);
	}

}
