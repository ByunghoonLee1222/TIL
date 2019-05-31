package forwhile;

public class ForEx2 {

	public static void main(String[] args) {
		
		//가위바위보 매트릭스를 출력하시오.
		//p 151
		for(int i=1;i<=3;i++) {
			
			for(int j=1; j<=3;j++) {
				if(i-j == 0) {
					System.out.print("무승부\t");
				}
				else if(i-j == 2 || i-j == -1) {
					System.out.print("컴승\t");
				}
				else if(i-j == 1 || i-j == -2) {
					System.out.print("유저승\t");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
//		for(int i=0;i<=5;i++) {
//			for(int j=0;j<=5;j++) {
//				System.out.println(i+" "+j);
//			}
//		}

	}

}
