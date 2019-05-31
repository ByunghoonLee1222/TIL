package forwhile;

import java.util.Random;
import java.util.Scanner;

public class Game4 {

	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
		   int win =0;
		   int game=0;
		while(true) {
			
			System.out.println("가위(1)바위(2)보(3) 입력하세요..(종료는 q):");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.printf("플레이한 게임수: %d\n",game);
				System.out.printf("이긴 게임수: %d",win);
				sc.close();
				System.exit(0);
				}
			int user = Integer.parseInt(cmd);
			
			if(user>3 || user<1) {
				System.out.printf("숫자를 다시 입력하세요(1,2,3)\n");
				continue;
			}
			
			Random r = new Random();
			int com = 0;
			com = r.nextInt(3)+1;
			
			System.out.println("당신은 "+user+" 입니다.");
			System.out.println("com은 "+com+" 입니다.");
			switch(user-com) {
			case 2: case -1:
				System.out.println("당신이 졌습니다.");
				break;
			case 1: case -2:
				System.out.println("당신이 이겼습니다.");
				win +=1;
				break;
			case 0:
				System.out.println("비겼습니다.");
				break;
				
			}
			game +=1;
			System.out.printf("플레이한 게임수 :%d\t", game);
			System.out.printf("이긴 게임수 :%d\n", win);	
	  }

		
  }
}
