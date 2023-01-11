package logical.programs;

import java.util.Scanner;

public class ReverseNumberUsingScanner {

	public static void main(String[] args) {
		
		int inputNumber,reverse=0,reminder;
		
		System.out.println("Enter the number ");

		Scanner s=new Scanner(System.in);
		//nextInt()-->read the int type of data from user
		//nextLine()-->Read the string type of dara from user
		inputNumber=s.nextInt();
		
		
		
		
		while (inputNumber>0) {
			reminder=inputNumber%10;
			reverse=reverse*10+reminder;
			inputNumber=inputNumber/10;
		}
		System.out.println("Reversed number is "+reverse);

	}

}
