package marray;

import java.util.Arrays;
import java.util.Random;

public class Marr3 {

	public static void main(String[] args) {
		//2차원 배열을 이용하여
		//5명의 학생의 4과목 점수를
		//생성하여 출력하시오
		//단, 배열의 첫번째는 학번이 들어간다.
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
		// 학생 별 평균을 출력 하시오.
		// 과목 별 평균을 출력 하시오.
		// 전체 평균 출력
		
		// 학생 별 평균을 출력 하시오.
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
		System.out.println("학생 별 평균:"+Arrays.toString(s_avg));
		
		// 과목 별 평균
		for(int i=0;i<ma[i].length;i++) {
			int n_sum = 0;
			for(int j=0;j<ma.length;j++) {
				n_sum += ma[j][i];
				
			}
			n_avg[i]= (double)n_sum/ma.length;
	}
		System.out.println("과목 별 평균:"+Arrays.toString(n_avg));
		
		// 전체 평균
		int a_sum = 0;
		for(int i=0;i<ma.length;i++) {
			
			for(int j=0;j<ma[i].length;j++) {
				a_sum += ma[i][j];
				
			}
			
			
	}
		a_avg = (double)a_sum / (ma.length*ma[0].length);
		System.out.println("전체 평균:"+a_avg);
	}
}
