//02.�⺻ �ڷᱸ��
//���� Q6. ��� ��ȯ(�׷��� �迭������ �ٲ�)

package java_jrgz;
import java.util.*;

public class java_jrgz {
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] temp = new char[32];
		// 0 1 2 3 4 digits = 5
		do {
			temp[digits++] = dchar.charAt(x % r);
			x /= r;
		}while(x != 0);
		for(int i = 0; i < digits; i++)
		{
			d[i] = temp[digits - i - 1];
		}
		
		return digits;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		do {
			do {
				System.out.print("��ȯ�� �� : ");
				no = s.nextInt();
			}while(no<0);
			
			do {
				System.out.print("�������� ��ȯ? : ");
				cd = s.nextInt();
			}while(cd < 2|| cd >36);
			
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd + "�����δ� ");
			for(int i = 0; i < dno ; i++)
			{
				System.out.print(cno[i]);
			}
			
			System.out.print("\n�ݺ��Ͻðڽ��ϳ�? ( 1.�� / 2.�ƴϿ� ) \n >>>>");
			retry = s.nextInt();
		}while(retry == 1);
	}
}
