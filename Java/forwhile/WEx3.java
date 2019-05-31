package forwhile;

public class WEx3 {

	public static void main(String[] args) throws InterruptedException {
		int i =5;
		while(i-- != 0) {
			Thread.sleep(1000);  //1000ms -1s
			System.out.println(i);
		}

	}

}
