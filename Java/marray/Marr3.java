package marray;

import java.util.Arrays;
import java.util.Random;

public class Marr3 {

	public static void main(String[] args) {
		//2���� �迭�� �̿��Ͽ�
		//5���� �л��� 4���� ������
		//�����Ͽ� ����Ͻÿ�
		//��, �迭�� ù��°�� �й��� ����.
		int ma[][] = new int[5][4];
		
		Random r = new Random();
		for(int i=0;i<ma.length;i++) {
			for(int j=0;j<ma[i].length;j++) {
				ma[i][j] = r.nextInt(100)+1;
			}
		}
		for( int temp[]: ma) {
			
			for(int data:temp) {
				System.out.printf("%d\t",data);
			}
			System.out.println();
		}
		// �л� �� ����� ��� �Ͻÿ�.
		// ���� �� ����� ��� �Ͻÿ�.
		// ��ü ��� ���
		
		// �л� �� ����� ��� �Ͻÿ�.
		double s_avg[] = new double[ma.length];
		double n_avg[] = new double[ma[0].length];
		double a_avg = 0.0;
		
		for(int i=0;i<ma.length;i++) {
			int s_sum = 0;
			for(int j=0;j<ma[i].length;j++) {
				s_sum += ma[i][j];
				
			}
			s_avg[i]= (double)s_sum/ma[0].length;
		
		}
		System.out.println("�л� �� ���:"+Arrays.toString(s_avg));
		
		// ���� �� ���
		for(int i=0;i<ma[i].length;i++) {
			int n_sum = 0;
			for(int j=0;j<ma.length;j++) {
				n_sum += ma[j][i];
				
			}
			n_avg[i]= (double)n_sum/ma.length;
	}
		System.out.println("���� �� ���:"+Arrays.toString(n_avg));
		
		// ��ü ���
		int a_sum = 0;
		for(int i=0;i<ma.length;i++) {
			
			for(int j=0;j<ma[i].length;j++) {
				a_sum += ma[i][j];
				
			}
			
			
	}
		a_avg = (double)a_sum / (ma.length*ma[0].length);
		System.out.println("��ü ���:"+a_avg);
	}
}
