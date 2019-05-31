package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr1 {

	public static void main(String[] args) {
//		int i = 10;
//		int a[] = new int[3];
//		a[0] =10;
//		a[1] =30;
//		a[2] =20;
		// a 배열의 각 인덱스에
		//1~9까지의 난수를 발생하여 입력
		// for문 사용
		
		Random r = new Random();
		
		int a[] = new int[6];
		for(int i=0; i<a.length;i++) {
			a[i] = r.nextInt(9)+1;
			for(int j = i-1; j>=0;j--) {
			if(a[j] == a[i]) {
				
				a[i] = r.nextInt(9)+1;	
				j = i;
				
			}
			}
		}
		System.out.println(Arrays.toString(a));
		}
		
		//System.out.println(a);
		//System.out.println(a.length);
//		for(int ind=0; ind<a.length;ind++) {
//			System.out.println(a[ind]);
//			System.out.println(ind);
//		}
//		for(int temp:a) {
//			System.out.println(temp);
//		}
	}


