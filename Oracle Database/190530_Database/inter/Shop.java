package inter;

public interface Shop {
	public void register(); //추상함수지만 abstract 안써도 된다.
	public void login();
	public void logout();
	public void order();
}
