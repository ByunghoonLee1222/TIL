package forwhile;

import java.util.Random;
import java.util.Scanner;

public class Game4 {

	public static void main(String[] args) {
	
		   Scanner sc = new Scanner(System.in);
		   int win =0;
		   int game=0;
		while(true) {
			
			System.out.println("����(1)����(2)��(3) �Է��ϼ���..(����� q):");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.printf("�÷����� ���Ӽ�: %d\n",game);
				System.out.printf("�̱� ���Ӽ�: %d",win);
				sc.close();
				System.exit(0);
				}
			int user = Integer.parseInt(cmd);
			
			if(user>3 || user<1) {
				System.out.printf("���ڸ� �ٽ� �Է��ϼ���(1,2,3)\n");
				continue;
			}
			
			Random r = new Random();
			int com = 0;
			com = r.nextInt(3)+1;
			
			System.out.println("����� "+user+" �Դϴ�.");
			System.out.println("com�� "+com+" �Դϴ�.");
			switch(user-com) {
			case 2: case -1:
				System.out.println("����� �����ϴ�.");
				break;
			case 1: case -2:
				System.out.println("����� �̰���ϴ�.");
				win +=1;
				break;
			case 0:
				System.out.println("�����ϴ�.");
				break;
				
			}
			game +=1;
			System.out.printf("�÷����� ���Ӽ� :%d\t", game);
			System.out.printf("�̱� ���Ӽ� :%d\n", win);	
	  }

		
  }
}
