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
		//1. 사용자는 1~ 3값을 입력한다.
		//2. 1~3 이외의 문자가 들어오면 "안녕" 프로그램 종료.
		//3. 컴퓨터는 1~3의 숫자를 랜덤하게 만든다.
		//4. 사용자 숫자와 비교하여 이겼는지 졌는지 출력한다.
		String user1 = "";
		String com1 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("1(가위),2(바위),3(보)의 값중 하나를 입력하세요. :");
		int user = sc.nextInt();
		if(user>3 || user<1) {
			System.out.println("안녕");
			sc.close();
			return;
		}
		Random r = new Random();
		int com = 0;
		com = r.nextInt(3)+1;
		switch(user) {
		case 1: user1 = "가위";
		break;
		case 2: user1 = "바위";
		break;
		case 3: user1 = "보";
		
		}
		switch(com) {
		case 1: com1 = "가위";
		break;
		case 2: com1 = "바위";
		break;
		case 3: com1 = "보";
		
		}
		
		System.out.println("당신은 "+user1+" 입니다.");
		System.out.println("com은 "+com1+" 입니다.");
		switch(user-com) {
		case 2: case -1:
			System.out.println("당신이 졌습니다.");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다.");
			break;
		case 0:
			System.out.println("비겼습니다.");
		}
		sc.close();
	}

}
