package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr3 {

	public static void main(String[] args) {
		int a[] = new int[30];
		//10~99������ ���ڸ� �����ϰ� �迭�� �Է�
		//�հ� ����� ���Ͻÿ�.
		Random r = new Random();
		int sum=0;
		double avg=0;
		for(int i=0;i<a.length;i++) {
		
			a[i] = r.nextInt(90)+10;
			sum += a[i];
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println("-------------------------------");
		avg = (double)sum / a.length;
		System.out.printf("�հ� : %d \n",sum);
		System.out.printf("��� : %.3f \n",avg);
		System.out.println("-------------------------------");
		//�ִ� ���� �ּ� ���� ��� �Ͻÿ�.
		int max = a[0];
		int min = a[0];
		for(int data :a) {
			if(data>max) {
				max=data;
			}
			if(data<min) {
				min =data;
			}
		}

		System.out.printf("�ִ� : %d \n",max);
		System.out.printf("�ּ� : %d \n",min);
		System.out.println("-------------------------------");
		//���� �� ���� ����
		
		
		for(int i =0;i<a.length;i++) {
			for(int j = 0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
		}
	}
		System.out.print("�������� ���� : ");
		System.out.println(Arrays.toString(a));
		System.out.println("-------------------------------");
		
		//ū �� ���� ����
		for(int i =0;i<a.length;i++) {
			for(int j = 0;j<a.length-1-i;j++) {
				if(a[j]<a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
		}
	}
		System.out.print("�������� ���� : ");
		System.out.println(Arrays.toString(a));
		System.out.println("-------------------------------");
		//�迭�� �ִ� ���ڵ��� ���� ���Ͻÿ�.
		int []count = new int [100];
		for(int i=0;i<a.length;i++) {
			count[a[i]]++;
			
		}
		for(int i=0;i<count.length;i++) {
			System.out.println(i +":"+count[i]);
		}
	
	}

}
