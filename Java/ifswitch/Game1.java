package ifswitch;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		
	//	Scanner sc = new Scanner(System.in);
	//	int user = sc.nextInt();
	//	System.out.println(user);
		//Random
//		int num = 0;
//		//1
//		num =(int)(Math.random()*10)+1;
//		System.out.println(num);
//		
//		Random r = new Random();
//		int num2 = 0;
//		num2 = r.nextInt(3)+1;
//		System.out.println(num2);
	
	//	sc.close();
		//1. ����ڴ� 1~ 3���� �Է��Ѵ�.
		//2. 1~3 �̿��� ���ڰ� ������ "�ȳ�" ���α׷� ����.
		//3. ��ǻ�ʹ� 1~3�� ���ڸ� �����ϰ� �����.
		//4. ����� ���ڿ� ���Ͽ� �̰���� ������ ����Ѵ�.
		String user1 = "";
		String com1 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("1(����),2(����),3(��)�� ���� �ϳ��� �Է��ϼ���. :");
		int user = sc.nextInt();
		if(user>3 || user<1) {
			System.out.println("�ȳ�");
			sc.close();
			return;
		}
		Random r = new Random();
		int com = 0;
		com = r.nextInt(3)+1;
		switch(user) {
		case 1: user1 = "����";
		break;
		case 2: user1 = "����";
		break;
		case 3: user1 = "��";
		
		}
		switch(com) {
		case 1: com1 = "����";
		break;
		case 2: com1 = "����";
		break;
		case 3: com1 = "��";
		
		}
		
		System.out.println("����� "+user1+" �Դϴ�.");
		System.out.println("com�� "+com1+" �Դϴ�.");
		switch(user-com) {
		case 2: case -1:
			System.out.println("����� �����ϴ�.");
			break;
		case 1: case -2:
			System.out.println("����� �̰���ϴ�.");
			break;
		case 0:
			System.out.println("�����ϴ�.");
		}
		sc.close();
	}

}
