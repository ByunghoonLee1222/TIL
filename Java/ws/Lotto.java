package ws;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// 6개의 숫자 입력(범위 1~10)
		// 그 날의 당첨번호 6개 생성(범위:1~10) 중복되지 않는 숫자 생성
		// 당첨금 생성( 범위 : 10억~100억)
		// 입력 받은 숫자와 당첨번호 확인
		// -3개 맞으면 4등 (당첨금 5%)
		// -4개 맞으면 3등 (10%)
		// -5개 맞으면 2등 (20%)
		// -6개 맞으면 1등 (50%)
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int num[] = new int[6];  // 6개 선택 배열
		int goal[] = new int[6]; // 번호생성 배열
		double money = 0; // 당첨금 생성
		double gold = 0; // 수령 금액
		int cnt = 0; //등수
	    // 6개의 숫자 입력
		System.out.println("6개의 숫자를 입력하세요(1~10) :");
		for(int i=0; i<num.length;i++) {
			num[i] = sc.nextInt(); 
		}
		System.out.print("내      번호:");
		for(int i=0;i<num.length;i++) {
				
			System.out.print(num[i]+"\t");
				
			}
		// 당첨번호 6개 생성
		for(int i=0;i<goal.length;i++) {
			goal[i] = r.nextInt(10)+1;
			for(int j=i-1;j>=0;j--) {	
			if(goal[j] == goal[i] ) {
				goal[i]=r.nextInt(10)+1;
				j=i;
			}
				
			
		}
		}
		System.out.print("\n당첨 번호는:");
		for(int i =0;i<goal.length;i++) {
			System.out.print(goal[i]+"\t");
		}
		// 당첨금 생성
		money = r.nextDouble()*10000000000F;
		
		// 입력받은 숫자와 당첨금 확인
		int count = 0;
		for(int j=0;j<num.length;j++) {
			for(int c =0; c< goal.length;c++) {
				if(num[j]==goal[c]) {
					count++;
				}
			}
			
		}
		System.out.printf("\n맞은 갯수: %d\n",count);
		
		//당첨 금액 확인
		switch(count) {
		case 3:	
			cnt = 4;
			gold = money * 0.05;
			break;
		case 4:	
			cnt = 3;
			gold = money * 0.1;	
			break;
		case 5:	
			cnt = 2;
			gold =money * 0.2;
			break;
		case 6:	
			cnt = 1;
			gold =money * 0.5;	
			break;
		default:	
		}
		String money1 = String.format("%,3.0f", money);
		String gold1 = String.format("%,3.0f", gold);
		System.out.printf("등수 : %d\n", cnt);
		System.out.printf("총 당첨금 :  %s원 입니다. \n", money1);
		System.out.printf("당첨금은  :  %s원 입니다. \n", gold1);
		sc.close();
	}

}

