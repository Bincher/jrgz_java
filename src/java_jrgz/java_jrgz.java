//01.기본알고리즘
//연습 Q10. a와 b 입력하고 b-a 구하기 

package java_jrgz;
import java.util.Scanner;

public class java_jrgz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		while(true)
		{
			System.out.print("a 입력 : ");
			a = s.nextInt();
			System.out.print("b 입력 : ");
			b = s.nextInt();
			if (a>=b)
				System.out.println("a보다 큰 값을 입력하세요!");
			else
				break;
		}
		System.out.print(b-a);
	}
}
