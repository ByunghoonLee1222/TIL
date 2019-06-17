package inter;

public class Oction implements Shop {

	@Override
	public void register() {
		System.out.println("Auction Register.");

	}

	@Override
	public void login() {
		System.out.println("Auction Login.");

	}

	@Override
	public void logout() {
		System.out.println("Auction Logout.");

	}

	@Override
	public void order() {
		System.out.println("Auction Order.");

	}

}
