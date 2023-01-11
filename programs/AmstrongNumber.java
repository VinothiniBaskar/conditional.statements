package logical.programs;

public class AmstrongNumber {

	public static void main(String[] args) {
		int number = 371, sum = 0, r = 0, temp;
		temp = number;
		while (number > 0) {
			r = number % 10;
			sum = sum + r * r * r;
			number = number/10;


		}
		if (temp == sum) {
			System.out.println("Amstrong number");
		} else {
			System.out.println("Not Amstrong number");

		}
	}

}
