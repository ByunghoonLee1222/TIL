package forwhile;

public class ForEx2 {

	public static void main(String[] args) {
		
		//���������� ��Ʈ������ ����Ͻÿ�.
		//p 151
		for(int i=1;i<=3;i++) {
			
			for(int j=1; j<=3;j++) {
				if(i-j == 0) {
					System.out.print("���º�\t");
				}
				else if(i-j == 2 || i-j == -1) {
					System.out.print("�Ľ�\t");
				}
				else if(i-j == 1 || i-j == -2) {
					System.out.print("������\t");
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
