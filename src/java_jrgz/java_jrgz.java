//01.�⺻�˰���
//���� Q1. 4���� �� �ִ�

package java_jrgz;
//max3��� ����Ŭ���� ����
public class java_jrgz {
	static int max4(int a, int b, int c, int d) {
		//max�� a����
		int max = a;
		//b or c �� max���� Ŭ�� if���� �̿��� ����(elseif�� �־���)
		if (b>max)
			max = b;
		if (c>max)
			max = c;
		if (d>max)
			max = d;
		//max ��ȯ
		return max;
	}
	public static void main(String[] args) {
		//���÷� 1,3,2
		int num = max4(1,2,3,2);
		System.out.print(num);
		//�׽�Ʈ
	}

}
