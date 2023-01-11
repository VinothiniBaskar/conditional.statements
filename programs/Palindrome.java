package logical.programs;


public class Palindrome {

	public static void main(String[] args) {
		int number=151, reverse = 0, reminder,temp;
		temp=number;
		
		while (number > 0) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		if (temp==reverse) {
			System.out.println("Palindrome");
		} else {
			System.out.println(" Not Palindrome");

		}

	}

}
