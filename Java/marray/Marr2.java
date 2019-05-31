package marray;

import java.util.Random;

public class Marr2 {

	public static void main(String[] args) {
		// int ma[][] = new int [3][4];
//		int ma[][] = {
//				{2,4,3,5},
//				{8,4,3,5,2,4,5},
//				{3,4,3},
//				{1,4,3,5,2},
//		};
		int ma[][]= new int [3][];
		ma[0] = new int [4];
		ma[1] = new int [3];
		ma[2] = new int [6];
		
		Random r = new Random();
		for(int i=0;i<ma.length;i++) {
			for(int j=0;j<ma[i].length;j++) {
				ma[i][j] = r.nextInt(10)+1;
			}
		}
		for( int temp[]: ma) {
			for(int data:temp) {
				System.out.printf("%d\t",data);
			}
			System.out.println();
		}
	}

}
