//03.�˻�
//���� Q3. ��ġ�� ���� �׸��� ��ڼ� 

package java_jrgz;
import java.util.*;

public class java_jrgz {
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				idx[j++] = i;
			}
		}
		return j;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("��Ҽ� : ");
		int n = s.nextInt();
		int [] a = new int[n];
		int [] idx = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = s.nextInt();
		}
		System.out.print("ã�� �� : ");
		int key = s.nextInt();
		
		int result = searchIdx(a, n, key, idx);
		System.out.print("��ġ�ϴ� ������ " + result + "���Դϴ�.");
	}
}
