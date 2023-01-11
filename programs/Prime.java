package logical.programs;

public class Prime {

	public static void main(String[] args) {
		int number = 8;
		// prime number means -->it is divisable by itself or 1
        //Deafult value is false ,so we need to assign as true
		boolean prime = true;
		//iterate the for loop with 2
		for (int i = 2; i < number-1; i++) {
			//check the number is divide by the i value and its equal to 0
			if (number % i == 0) {
				//it is divided print not prime
				System.out.println("not prime");
				//set as false
				prime = false;
				//It will break the loop
				break;
			}
		}
		//otherwise the prime value as true and print prime
		//Given number is only divible by itself and 1
		if (prime) {
			System.out.println("prime");
		}
	}

}
