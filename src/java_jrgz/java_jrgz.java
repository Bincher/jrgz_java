//03.�˻�
//���� Q5. ���� �˻� �˰��� ����(�ߺ��� �� �߾��� �ƴ� �� ���� ���) 

package java_jrgz;
import java.util.*;

public class java_jrgz {
	
	static int binSearchX(int[] a, int n, int key) {
		
		int pl = 0;
		int pr = n - 1;
		
		do {
			int pc = (pl + pr) / 2;
			if (a[pc] == key){
				do{
					pc--;
				}while(a[pc] == key);
				return (pc + 1);
			}
			else if (a[pc] > key) {
				pr = pc - 1;
			}
			else {
				pl = pc + 1;
			}
		}while(pl <= pr);
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("��Ҽ� : ");
		int n = s.nextInt();
		int [] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = s.nextInt();
		}
		System.out.print("ã�� �� : ");
		int key = s.nextInt();
		
		int result = binSearchX(a, n, key);
		System.out.print("ã�� ���� ��ġ�� a[" + result + "]�Դϴ�.");
	}
}
