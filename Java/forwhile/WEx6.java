package forwhile;

public class WEx6 {

	public static void main(String[] args) {
		//�������� ����Ͻÿ�.
		//7�ܱ����� ����Ͻÿ�
		// ¦�� �ܸ� ����Ͻÿ�.
		
		out:
		for(int i=2; i<10;i++) {
			for(int j=1; j<10;j++) {
				
				int result = i*j;
				if(i %2 != 0) {
				System.out.printf("%d x %d = %d\n",i,j,result);
			  }
				if(result == 49) {
					//flag ����
					//System.exit(0);
					break out;
				}
			}
			System.out.println();
		}

	}

}
