//01.�⺻�˰���
//�ǽ� 1C-1. �߾Ӱ����ϱ�

package java_jrgz;
import java.util.Scanner;

public class java_jrgz {
	static int med3(int a, int b, int c) {
		if (a>=b)
		{
			if (b>=c)
				return b;
			else if (a>=c)
				return c;
			else
				return a;
		}
		else if (a>c)
			return a;
		else if (b>c)
			return c;
		else
			return b;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("a : ");
		int a = s.nextInt();
		System.out.print("b : ");
		int b = s.nextInt();
		System.out.print("c : ");
		int c = s.nextInt();
		System.out.print("�߾Ӱ� : " + med3(a,b,c));
	}

}
