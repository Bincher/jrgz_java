//02.기본 자료구조
//연습 Q2. 배열 요소 역순과 과정 설명

package java_jrgz;
import java.util.*;

public class java_jrgz {
	static void swap(int [] arr, int size){
		int temp = 0;
		for(int i = 0; i < (size/2); i++)
		{
			System.out.print("arr[" + i + "]" + "과(와) arr[" + (size-i-1) + "]를 교환합니다.\n");
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
		System.out.print("배열의 크기 지정 : ");
		int size = s.nextInt();
		
		int [] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print((i+1) + "번째 요소 입력 : ");
			arr[i] = s.nextInt();
		}
		swap(arr, size);
	}
}
