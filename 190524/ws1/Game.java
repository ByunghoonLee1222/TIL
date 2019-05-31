package ws1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {


		int num[] = new int[4]; // ��ǻ�� ����
		int number[] = new int[4];// ���� ����
		int strike = 0;
		int ball = 0;
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		// ���� 4�ڸ� ���� �ޱ� (0~9)�ߺ�x
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
		// 4�ڸ� ���� �Է�
		while (true) {
			System.out.println("4�ڸ� ���ڸ� �Է��ϼ���.(0~9,����� 00):");
			for (int i = 0; i < number.length; i++) {
				number[i] = sc.nextInt();
					if (number[i]==99) {
						System.out.println("������ �����մϴ�.");
						sc.close();
						System.exit(0);
					}
			}
			
			// ���ڰ� ������ ball, �ڸ��� ������ strike
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
			// �ƿ� �ȸ����� out		
			// ������ ��ġ�ϰ� �Ǹ� Ȩ������ ���� ��.
			if (strike == 0 && ball == 0) {
				System.out.println("out");
			} else {
				if (strike == 4) {
					System.out.println("Ȩ��!");
					sc.close();
					System.exit(0);
				} else {
					System.out.printf("%dStrike %dball �Դϴ�.\n", strike, ball);
					strike = 0;
					ball = 0;
				}
			}

		}
	}

}
