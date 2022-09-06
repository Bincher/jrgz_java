//03.검색
//연습 Q6. binarySearch 이용(그런데 실패시 삽입포인트값 출력을 겸하는)

package java_jrgz;
import java.util.*;

public class java_jrgz {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("요소수 : ");
		int n = s.nextInt();
		int [] a = new int[n];
		
		System.out.print("오름차순으로 입력\na[0] = ");
		a[0] = s.nextInt();
		for (int i = 1; i < n; i++) {
			do {
				System.out.print("a[" + i + "] = ");
				a[i] = s.nextInt();
			}while(a[i] < a[i-1]);
		}
		System.out.print("찾는 수 : ");
		int key = s.nextInt();
		
		int result = Arrays.binarySearch(a, key);
		if (result >= 0)
			System.out.print("찾는 값의 위치는 a[" + result + "]입니다.");
		else
			System.out.print("찾는 값이 없으며 삽입 포인트는 a[" + -(result + 1) + "]입니다.");
			
	}
}
