package ifswitch;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("해당 월 입력: ");
		int month = Integer.parseInt(sc.next());
		int lastDayOfMonth = 0;
		
		//해당 월의 마지막 일자
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			lastDayOfMonth = 31;
			break;
			
		case 2:	
			lastDayOfMonth = 28;
		break;
		
		case 4: case 6: case 9: case 11:
			lastDayOfMonth = 30;
			
			
		}
		sc.close();
		System.out.println(lastDayOfMonth);

	}

}
