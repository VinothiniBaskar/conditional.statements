package conditional.statements;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		String choice;
		System.out.println("Enter the name");
		Scanner obj = new Scanner(System.in);
		choice = obj.nextLine();
		switch (choice) {
		case "vino":
            System.out.println("You have entered as vino");
			break;
		case "vasanth":
            System.out.println("You have entered as vasanth");

			break;
		case "selvi":
            System.out.println("You have entered as selvi");

			break;

		default:
			System.out.println("Name is not entered");
			break;
		}

	}

}
