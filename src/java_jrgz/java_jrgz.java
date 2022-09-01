//01.기본알고리즘
//연습 Q17. n숫자 피라미드

package java_jrgz;
import java.util.Scanner;

public class java_jrgz {
	static void npira(int n){
		for (int i = 1; i < n + 1 ; i++)
		{
			for(int j = i; j < n + 1; j++)
				System.out.print(" ");
			for(int j = i; j > 1; j--)
				System.out.print(i%10);
			for(int j = i; j >= 1; j--)
				System.out.print(i%10);
			System.out.println();
		}
	}
	public static void main(String[] args) {
	npira(4);
	}
}
