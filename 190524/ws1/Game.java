package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {


		int num[] = new int[4]; // 컴퓨터 숫자
		int number[] = new int[4];// 유저 숫자
		int strike = 0;
		int ball = 0;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		// 랜덤 4자리 숫자 받기 (0~9)중복x
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(10);
			for (int j = i - 1; j >= 0; j--) {
				if (num[j] == num[i]) {

					num[i] = r.nextInt(10);
					j = i;
				}
			}

		}
		System.out.println(Arrays.toString(num));
		// 4자리 숫자 입력
		while (true) {
			System.out.println("4자리 숫자를 입력하세요.(0~9,종료는 00):");
			for (int i = 0; i < number.length; i++) {
				number[i] = sc.nextInt();
					if (number[i]==99) {
						System.out.println("게임을 종료합니다.");
						sc.close();
						System.exit(0);
					}
			}
			
			// 숫자가 있으면 ball, 자리도 같으면 strike
			for (int i = 0; i < num.length; i++) {
				if (num[i] == number[i]) {
					strike++;
				}
			}
			for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < number.length; j++) {
					if (i != j) {
						if (num[i] == number[j]) {
							ball++;
						}
					}
				}

			}
			// 아예 안맞으면 out		
			// 완전히 일치하게 되면 홈런으로 게임 끝.
			if (strike == 0 && ball == 0) {
				System.out.println("out");
			} else {
				if (strike == 4) {
					System.out.println("홈런!");
					sc.close();
					System.exit(0);
				} else {
					System.out.printf("%dStrike %dball 입니다.\n", strike, ball);
					strike = 0;
					ball = 0;
				}
			}

		}
	}

}
