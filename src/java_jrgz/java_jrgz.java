//01.�⺻�˰���
//���� Q2. 3���� �� �ּڰ�

package java_jrgz;

public class java_jrgz {
	static int min3(int a, int b, int c) {
		
		int min = a;
		
		if (b<min)
			min = b;
		if (c<min)
			min = c;
		
		return min;
		
	}
	public static void main(String[] args) {
		int num = min3(3,1,2);
		System.out.print(num);
	}

}
