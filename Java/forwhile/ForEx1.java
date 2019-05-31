package forwhile;

public class ForEx1 {

	public static void main(String[] args) {
//		System.out.println("Start");
//		for(int i=0;i<10;i++) {
//			System.out.print(i);
//			
//		}
//		System.out.println();
//		for(int i=10;i>=0;i--) {
//			System.out.print(i);
//		}
//		//1부터 10까지 출력
//		// 홀수만 출력 하시오.
//		for(int i=1;i<=10;i+=2) {
//			System.out.print(i);
////		}
//		for(int i=1;i<=10;i++) {
//			if(i%2 !=0) {
//				System.out.print(i);
//			}
//		}
//		int i =1,j=10;
//		for(;i<=10 && j>=1; i++,j--) {
//			System.out.println(i+" "+j);
//		}
		//두 수의 곱이 5의 배수인 것들의 합을 구하시오.
		int i =1,j=10;
		int sum = 0;
		int gop = 0;
		for(;i<=10;i++,j--) {
			gop = i*j;
			if((gop)%5 == 0) {
				sum += gop;
			}
		}
		
		System.out.println("Sum :"+sum);
		System.out.println();
		System.out.println("End");
	}

}
