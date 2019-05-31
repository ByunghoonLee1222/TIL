package array1;

import java.util.Arrays;
import java.util.Random;

public class Arr4 {

	public static void main(String[] args) {
		int a[]= new int[100];
		
		Random r = new Random();
		for(int in =0;in<a.length;in++) {
			a[in] = r.nextInt(4)+1;
		}
		System.out.println(Arrays.toString(a));
		
		int count[]= new int[4];
		//투표 결과를 count 배열에 합산하시오.
		for(int i=0;i<a.length;i++) {
			for(int c =0; c<count.length;c++) {
				if(a[i]==c+1) {
					count[c]++;
				}
			}
			
		}
		for(int c =0; c<count.length;c++) {
			System.out.println((c+1)+":"+count[c]);
		}
	}

}
