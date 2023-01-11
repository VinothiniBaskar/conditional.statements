package logical.programs;

public class ReverseNumber {

	public static void main(String[] args) {
		int inputNumber = 1234;
		int reverse = 0, reminder;

		while (inputNumber > 0) {
			reminder = inputNumber % 10;
			reverse = reverse * 10 + reminder;
			inputNumber = inputNumber / 10;
		}
		System.out.println(reverse);
	}

}
