package logical.programs;

public class Factorial {

	public static void main(String[] args) {
		// 5=5*4*3*2*1 -->ans is 120

		//Declare a number
		int num = 5, fact = 1;

		//Iterate the for loop
		for (int i = 1; i <= num; i++) {
			//multiply the current i value  to fact value and store it to fact value
			fact = fact * i;
		}
		//print the value of fact value
		System.out.println(fact);
	}

}
