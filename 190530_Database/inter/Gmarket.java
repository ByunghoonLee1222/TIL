package inter;

public class Gmarket implements Shop {

	@Override
	public void register() {
		System.out.println("Gmarket Register.");

	}

	@Override
	public void login() {
		System.out.println("Gmarket Login.");

	}

	@Override
	public void logout() {
		System.out.println("Gmarket Logout.");

	}

	@Override
	public void order() {
		System.out.println("Gmarket Order.");

	}

}
