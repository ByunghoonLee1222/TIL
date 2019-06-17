package lesson;

import java.util.Random;

public class Test03 {

	public static void main(String[] args) {
		Random r = new Random();
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(90) + 10;
		}
//		for (int a : arr) {
//			System.out.println(a);
//		}
		//내림차순
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.print("내림차순 정렬: ");
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		//오름차순
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.print("오름차순 정렬: ");
		for(int a : arr) {
			System.out.print(a+" ");
		}

	}

}
