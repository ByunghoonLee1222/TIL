package ws;

public class User {

	public int usermoney;
	private String id;
	private String pw;
	private String account;
	private double balance;

	Lotto lotto = new Lotto();

	public User() {

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public User(String id, String pw, String account, int balance) {

		this.id = id;
		this.pw = pw;
		this.account = account;
		this.balance = balance;

	}

	public boolean UserInfo(String id, String pw) {
		if(this.id.equals(id) && this.pw.equals(pw)) {
			return true;
		}else {
			return false;
		}
		 
	}

	public double deposit(double money) {

		this.balance += money;

		return balance;
	}

	public double withdraw(double money) throws Exception {
		if (this.balance - money < 0) {

			throw new Exception("E1");
		}
		this.balance -= money;

		return balance;
	}

	public double balance(double gamemoney, int[] usernumber) {

		try {
			this.balance = withdraw(gamemoney);

		} catch (Exception e) {
			return 0;
		}
		lotto.GenerateNum();
		int count = lotto.CompareNum(usernumber);
		double money = lotto.Money(gamemoney, count); // count = ´çÃ· ¼ýÀÚ °¹¼ö
		this.balance = deposit(money);
		return balance;
	}
}
