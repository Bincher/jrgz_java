//01.�⺻�˰���
//���� Q11. �ڸ��� ���ϱ� 

package java_jrgz;
import java.util.Scanner;

public class java_jrgz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int a = 10;
		int b = 1;
		while(true)
		{
			if (num / a > 0)
			{
				a *= 10;
				b++;
			}
			else
				break;
		}
		System.out.print(b);
	}
}
