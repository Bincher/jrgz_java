//01.기본알고리즘
//연습 Q7. 1+2+3+4+5+6+7=28

package java_jrgz;
import java.util.Scanner;

public class java_jrgz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int sum = 0;
		int i;
		
		for (i = 1; i <= a; i++)
		{
			sum += i;
			System.out.print(i);
			if (i != a)
				System.out.print("+");
		}
		System.out.print("=" + sum);
	}

}
