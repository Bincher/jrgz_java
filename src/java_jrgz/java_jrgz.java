//01.�⺻�˰���
//���� Q10. a�� b �Է��ϰ� b-a ���ϱ� 

package java_jrgz;
import java.util.Scanner;

public class java_jrgz {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		while(true)
		{
			System.out.print("a �Է� : ");
			a = s.nextInt();
			System.out.print("b �Է� : ");
			b = s.nextInt();
			if (a>=b)
				System.out.println("a���� ū ���� �Է��ϼ���!");
			else
				break;
		}
		System.out.print(b-a);
	}
}
