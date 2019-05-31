package lesson;

public class Test02 {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= 6; j++) {
				int sum = 0;
				if (i + j == 6) {
					sum = i + j;
					System.out.println(i + "+" + j + "=" + sum);
				}
			}
		}

	}

}
