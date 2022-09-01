//01.기본알고리즘
//연습 Q1. 4개의 수 최댓값

package java_jrgz;
//max3라는 내부클래스 생성
public class java_jrgz {
	static int max4(int a, int b, int c, int d) {
		//max에 a삽입
		int max = a;
		//b or c 가 max보다 클시 if문을 이용해 삽입(elseif를 왜쓰나)
		if (b>max)
			max = b;
		if (c>max)
			max = c;
		if (d>max)
			max = d;
		//max 반환
		return max;
	}
	public static void main(String[] args) {
		//예시로 1,3,2
		int num = max4(1,2,3,2);
		System.out.print(num);
		//테스트
	}

}
