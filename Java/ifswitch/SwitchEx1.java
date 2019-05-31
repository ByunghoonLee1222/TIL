package ifswitch;

public class SwitchEx1 {

	public static void main(String[] args) {
		// admin Permission Control
		int a= 2;  // int, value ,String
		String str = "";
		switch(a) {
		case 1: str += "Super Admin";
		case 2: str += "Middle Admin";
		case 3: str += "Admin";
		break;
		default: str = "FAIL";
		
		}
		System.out.println(str);

	}

}
