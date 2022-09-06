//03.검색
//연습 Q5. 이진 검색 알고리즘 개선(중복값 중 중앙이 아닌 맨 앞의 요소) 

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
		System.out.print("요소수 : ");
		int n = s.nextInt();
		int [] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = s.nextInt();
		}
		System.out.print("찾는 수 : ");
		int key = s.nextInt();
		
		int result = binSearchX(a, n, key);
		System.out.print("찾는 값의 위치는 a[" + result + "]입니다.");
	}
}
