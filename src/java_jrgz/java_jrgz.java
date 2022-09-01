//01.기본알고리즘
//연습 Q9. a와 b 사이의 총합 

package java_jrgz;
import java.util.Scanner;

public class java_jrgz {
	static int sumof(int a, int b)
	{
		int i = 0;
		int sum = 0;
		if (a >= b)
		{
			i = a;
			a = b;
			b = i;
		}
		for (i = a; i <= b; i++)
		{
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("a 입력 : ");
		int a = s.nextInt();
		System.out.print("b 입력 : ");
		int b = s.nextInt();
		System.out.print(sumof(a,b));
	}

}
