package ifswitch;

public class Game2 {

	public static void main(String[] args) {
		String out = "";
		String domain = "";
		String str = "hoonlee9212@gmail.com";
		int len = str.length();
		int c = str.indexOf("@");
		System.out.println(c);
		System.out.println(len);
		
		out = str.substring(0,c); 
		domain = str.substring(c+1,str.indexOf("."));
		System.out.println(out+"\n"+domain);
	}

}
