package forwhile;

import java.util.Scanner;

public class WEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input Command..");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("Bye...");
				sc.close();
				System.exit(0);
			}else if(cmd.equals("i")) {
				System.out.println("Input Num");
				int a = Integer.parseInt(sc.next());
				System.out.println(a);
			}else if(cmd.equals("s")){
				System.out.println("Selected..");
			}else {
				System.out.println("Re-Try");
				continue;
			}
			System.out.println("Completed...");
			
		}
		
	}

}
