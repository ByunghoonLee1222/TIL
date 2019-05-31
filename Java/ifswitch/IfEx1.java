package ifswitch;

public class IfEx1 {

	public static void main(String[] args) {
		int a = -10;
		String str = "";
		
		str = (a<0)? "음수":"양수";
		
		if(a<0) {
			a *= -1;		
			}


		System.out.println(str);
		System.out.println(a);
	}

}
