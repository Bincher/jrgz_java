//02.�⺻ �ڷᱸ��
//���� Q5. rcopy

package java_jrgz;
import java.util.*;

public class java_jrgz {
	static void rcopy(int [] arr1, int [] arr2){
		for (int i = 0; i < arr1.length; i++)
		{
			arr2[i] = arr1[arr1.length - i - 1];
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("�迭�� ũ�� ���� : ");
		int size = s.nextInt();
		
		int [] arr1 = new int[size];
		int [] arr2 = new int[size];
		
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.print((i+1) + "��° ��� �Է� : ");
			arr1[i] = s.nextInt();
		}
		
		rcopy(arr1, arr2);
		
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr2.length; i++)
		{
			System.out.print(arr2[i] + " ");
		}
	}
}
