//02.기본 자료구조
//연습 Q3. 배열의 합

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
		System.out.print("배열의 크기 지정 : ");
		int size = s.nextInt();
		
		int [] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print((i+1) + "번째 요소 입력 : ");
			arr[i] = s.nextInt();
		}
		
		System.out.print("합 : " + sumOf(arr));
	}
}
