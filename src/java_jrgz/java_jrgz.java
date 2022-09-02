//02.기본 자료구조
//연습 Q4. copy

package java_jrgz;
import java.util.*;

public class java_jrgz {
	static void copy(int [] arr1, int [] arr2){
		for (int i = 0; i < arr1.length; i++)
		{
			arr2[i] = arr1[i];
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("배열의 크기 지정 : ");
		int size = s.nextInt();
		
		int [] arr1 = new int[size];
		int [] arr2 = new int[size];
		
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.print((i+1) + "번째 요소 입력 : ");
			arr1[i] = s.nextInt();
		}
		
		copy(arr1, arr2);
		
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
