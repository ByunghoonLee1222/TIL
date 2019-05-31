package ws;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// 6���� ���� �Է�(���� 1~10)
		// �� ���� ��÷��ȣ 6�� ����(����:1~10) �ߺ����� �ʴ� ���� ����
		// ��÷�� ����( ���� : 10��~100��)
		// �Է� ���� ���ڿ� ��÷��ȣ Ȯ��
		// -3�� ������ 4�� (��÷�� 5%)
		// -4�� ������ 3�� (10%)
		// -5�� ������ 2�� (20%)
		// -6�� ������ 1�� (50%)
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int num[] = new int[6];  // 6�� ���� �迭
		int goal[] = new int[6]; // ��ȣ���� �迭
		double money = 0; // ��÷�� ����
		double gold = 0; // ���� �ݾ�
		int cnt = 0; //���
	    // 6���� ���� �Է�
		System.out.println("6���� ���ڸ� �Է��ϼ���(1~10) :");
		for(int i=0; i<num.length;i++) {
			num[i] = sc.nextInt(); 
		}
		System.out.print("��      ��ȣ:");
		for(int i=0;i<num.length;i++) {
				
			System.out.print(num[i]+"\t");
				
			}
		// ��÷��ȣ 6�� ����
		for(int i=0;i<goal.length;i++) {
			goal[i] = r.nextInt(10)+1;
			for(int j=i-1;j>=0;j--) {	
			if(goal[j] == goal[i] ) {
				goal[i]=r.nextInt(10)+1;
				j=i;
			}
				
			
		}
		}
		System.out.print("\n��÷ ��ȣ��:");
		for(int i =0;i<goal.length;i++) {
			System.out.print(goal[i]+"\t");
		}
		// ��÷�� ����
		money = r.nextDouble()*10000000000F;
		
		// �Է¹��� ���ڿ� ��÷�� Ȯ��
		int count = 0;
		for(int j=0;j<num.length;j++) {
			for(int c =0; c< goal.length;c++) {
				if(num[j]==goal[c]) {
					count++;
				}
			}
			
		}
		System.out.printf("\n���� ����: %d\n",count);
		
		//��÷ �ݾ� Ȯ��
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
		System.out.printf("��� : %d\n", cnt);
		System.out.printf("�� ��÷�� :  %s�� �Դϴ�. \n", money1);
		System.out.printf("��÷����  :  %s�� �Դϴ�. \n", gold1);
		sc.close();
	}

}

