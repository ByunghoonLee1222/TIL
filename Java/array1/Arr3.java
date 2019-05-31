package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr3 {

	public static void main(String[] args) {
		int a[] = new int[30];
		//10~99까지의 숫자를 랜덤하게 배열에 입력
		//합과 평균을 구하시오.
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
		System.out.printf("합계 : %d \n",sum);
		System.out.printf("평균 : %.3f \n",avg);
		System.out.println("-------------------------------");
		//최대 값과 최소 값을 출력 하시오.
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

		System.out.printf("최대 : %d \n",max);
		System.out.printf("최소 : %d \n",min);
		System.out.println("-------------------------------");
		//작은 수 부터 정렬
		
		
		for(int i =0;i<a.length;i++) {
			for(int j = 0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
		}
	}
		System.out.print("내림차순 정렬 : ");
		System.out.println(Arrays.toString(a));
		System.out.println("-------------------------------");
		
		//큰 수 부터 정렬
		for(int i =0;i<a.length;i++) {
			for(int j = 0;j<a.length-1-i;j++) {
				if(a[j]<a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
		}
	}
		System.out.print("오름차순 정렬 : ");
		System.out.println(Arrays.toString(a));
		System.out.println("-------------------------------");
		//배열에 있는 숫자들의 합을 구하시오.
		int []count = new int [100];
		for(int i=0;i<a.length;i++) {
			count[a[i]]++;
			
		}
		for(int i=0;i<count.length;i++) {
			System.out.println(i +":"+count[i]);
		}
	
	}

}
