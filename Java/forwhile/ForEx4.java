package forwhile;

public class ForEx4 {

	public static void main(String[] args) {
		// 주사위를 3개 던졌을때 나올수 있는 눈경우 출력
		for(int i=1; i<=6;i++) {
			for(int j=1; j<=6;j++) {
				for(int k=1; k<=6; k++) {
					System.out.printf("%d,%d,%d\t", i,j,k);
				}
				System.out.println();
			}
			System.out.println();
		}
		

	}

}
