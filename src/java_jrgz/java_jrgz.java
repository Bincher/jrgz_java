//02.�⺻ �ڷᱸ��
//���� Q2. �迭 ��� ������ ���� ����

package java_jrgz;
import java.util.*;

public class java_jrgz {
	static void swap(int [] arr, int size){
		int temp = 0;
		for(int i = 0; i < (size/2); i++)
		{
			System.out.print("arr[" + i + "]" + "��(��) arr[" + (size-i-1) + "]�� ��ȯ�մϴ�.\n");
			temp = arr[size-i-1];
			arr[size-i-1] = arr[i];
			arr[i] = temp;
			for (int j = 0; j < arr.length; j++)
			{
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�迭�� ũ�� ���� : ");
		int size = s.nextInt();
		
		int [] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print((i+1) + "��° ��� �Է� : ");
			arr[i] = s.nextInt();
		}
		swap(arr, size);
	}
}
