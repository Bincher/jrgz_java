//03.검색
//실습 3-3. 선형 검색(보초법)

package java_jrgz;
import java.util.*;

public class java_jrgz {
	
	static int swqSearchSen(int[] a, int n, int key){
		
		int i = 0; 
		while(true) {
			if (a[i] == key)
				break;
			i++;
		}
		return (i == n) ? -1 : i;
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("요소수 : ");
		int num = s.nextInt();
		int [] arr = new int[num + 1];
		
		for (int i = 0; i < num; i++) {
			System.out.print("arr[" + i + "] : ");
			arr[i] = s.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		arr[num] = s.nextInt();
		
		int idx = swqSearchSen(arr, num, arr[num]);
		
		System.out.print(arr[num] + "은(는) x[" + idx + "]에 있습니다.");
	}
}
