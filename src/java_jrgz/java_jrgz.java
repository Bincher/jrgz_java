//03.�˻�
//���� Q2. ���� �˻��� �� ���(���ڸ�����) 

package java_jrgz;
import java.util.*;

public class java_jrgz {
	
	static int swqSearchSen(int[] a, int n, int key){
		
		int i = 0;
		
		System.out.print("  |");
		for (int j = 0; j < n; j++) {
			System.out.print(" " + j);
		}
		System.out.print("\n--+-------------------------------------------");
		for (i = 0; i < n; i++){
			System.out.print("\n  |");
			for (int  j = 0; j < i; j++)
				System.out.print("  ");
			System.out.print(" *\n" + i + " |");
			for (int  j = 0; j < n; j++)
				System.out.print(" " + a[j]);
			if (a[i] == key)
				break;
		}
		
		return (i == n) ? -1 : i;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("��Ҽ� : ");
		int num = s.nextInt();
		int [] arr = new int[num + 1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = s.nextInt();
		}
		
		System.out.print("�˻��� �� : ");
		arr[num] = s.nextInt();
		
		int idx = swqSearchSen(arr, num, arr[num]);
		
		System.out.print("\n" + arr[num] + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}
}
