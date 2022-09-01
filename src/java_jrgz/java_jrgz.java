//01.기본알고리즘
//실습 1-2 최댓값리턴클래스

package java_jrgz;
//max3라는 내부클래스 생성
public class java_jrgz {
	static int max3(int a, int b, int c) {
		//max에 a삽입
		int max = a;
		//b or c 가 max보다 클시 if문을 이용해 삽입
		if (b>max)
			max = b;
		else if (c>max)
			max = c;
		//max 반환
		return max;
	}
	public static void main(String[] args) {
		//예시로 1,3,2
		int num = max3(1,3,2);
		System.out.print(num);
	}

}
