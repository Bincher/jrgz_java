//01.�⺻�˰���
//�ǽ� 1-2 �ִ񰪸���Ŭ����

package java_jrgz;
//max3��� ����Ŭ���� ����
public class java_jrgz {
	static int max3(int a, int b, int c) {
		//max�� a����
		int max = a;
		//b or c �� max���� Ŭ�� if���� �̿��� ����
		if (b>max)
			max = b;
		else if (c>max)
			max = c;
		//max ��ȯ
		return max;
	}
	public static void main(String[] args) {
		//���÷� 1,3,2
		int num = max3(1,3,2);
		System.out.print(num);
	}

}
