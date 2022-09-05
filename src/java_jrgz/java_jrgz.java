//02.�⺻ �ڷᱸ��
//���� Q10. ��ü�˻�(�׷��� *�� �����)

package java_jrgz;
import java.util.*;

public class java_jrgz {
	
	static final int VMAX = 21;
	
	static class PhyscDate{
		String name;
		int height;
		double vision;
		
		PhyscDate(String name, int height, double vision)
		{
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	static double aveHeight(PhyscDate[] dat) {
		double sum = 0;
		
		for (int i = 0; i < dat.length; i++)
		{
			sum += dat[i].height;
		}
		
		return (sum / dat.length);
	}
	
	static void distVision(PhyscDate[] dat, int []dist) {
		int i = 0;
		
		dist[i] = 0;
		for (i = 0; i < dat.length; i++)
		{
			if (dat[i].vision >= 0.0 && dat[i].vision <= (VMAX/10.0))
			{
				dist[(int)(dat[i].vision * 10)]++;
			}
				
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		PhyscDate[] x = {
				new PhyscDate("������", 162, 0.3),
				new PhyscDate("������", 173, 0.7),
				new PhyscDate("������", 175, 2.0),
				new PhyscDate("ȫ����", 171, 1.5),
				new PhyscDate("�̼���", 168, 0.4),
				new PhyscDate("�迵��", 174, 1.2),
				new PhyscDate("�ڿ��", 169, 0.8),
		};
		int[] vdist = new int[VMAX];
		
		System.out.print("<��ü�˻� ����Ʈ>\n�̸�       Ű �÷�\n----------------\n");
		for (int i = 0; i < x.length; i++)
		{
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}
		System.out.printf("\n��� Ű : %5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist);
		
		System.out.println("\n�÷º���");
		for (int i = 0; i < VMAX; i++)
		{
			System.out.printf("%3.1f~ : ", (i / 10.0));
			for(int j = 0; j < vdist[i]; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
