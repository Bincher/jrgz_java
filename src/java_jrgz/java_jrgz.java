//03.�˻�
//���� Q6. binarySearch �̿�(�׷��� ���н� ��������Ʈ�� ����� ���ϴ�)

package java_jrgz;
import java.util.*;

public class java_jrgz {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("��Ҽ� : ");
		int n = s.nextInt();
		int [] a = new int[n];
		
		System.out.print("������������ �Է�\na[0] = ");
		a[0] = s.nextInt();
		for (int i = 1; i < n; i++) {
			do {
				System.out.print("a[" + i + "] = ");
				a[i] = s.nextInt();
			}while(a[i] < a[i-1]);
		}
		System.out.print("ã�� �� : ");
		int key = s.nextInt();
		
		int result = Arrays.binarySearch(a, key);
		if (result >= 0)
			System.out.print("ã�� ���� ��ġ�� a[" + result + "]�Դϴ�.");
		else
			System.out.print("ã�� ���� ������ ���� ����Ʈ�� a[" + -(result + 1) + "]�Դϴ�.");
			
	}
}
