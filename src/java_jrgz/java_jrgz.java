//01.�⺻�˰���
//���� Q6. WHILE���� ���� I�� Ȯ��

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
