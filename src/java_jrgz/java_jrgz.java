//02.�⺻ �ڷᱸ��
//���� Q3. �迭�� ��

package java_jrgz;
import java.util.*;

public class java_jrgz {
	static int sumOf(int [] arr){
		int result = 0;
		for (int i = 0; i < arr.length; i++)
		{
			result += arr[i];
		}
		return result;
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
		
		System.out.print("�� : " + sumOf(arr));
	}
}
