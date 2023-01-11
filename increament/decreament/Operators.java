package increament.decreament;

public class Operators {
	private void postIncrement() {
		// Post increment means first given value is assigned to the variable and then
		// increment the value
		// count=count+1; -->count++
		int count = 0;
		// count value is 0
		System.out.println("The count value is assign "+count++);
		// count value is 1
		System.out.println("The count value is after the increment "+count);

	}

	private void preIncrement() {
		// Pre increment means first value should be incremented and the prrint the
		// value
		// count=count+1 -->++count
		// count is intially 3 and then increament by 1 and then assign it to the
		// variable
		// count=4
		int count = 3;
		// count value is 4
		System.out.println(" The count is first increment and the value is "+ ++count);
		// count value is 4
		System.out.println("The value of count after the preincrement is "+count);

	}

	private void postDecrement() {

		// PostDecrement means first value will be assigned in to the variable and the
		// decrement the value
		// count=count-1;
		// count--;

		int count = 7;
		//count value is 7
		System.out.println(count--);
		//count value is 6
		System.out.println(count);
		//assign the value 6
		System.out.println(count--);
		//decrement the count value to 5
		System.out.println(count);

	}
	private void preDecrement() {
		//PreDecrement means first value will be decreased then added to that variable
		int count =8;
		//count value is 7
		System.out.println(--count);
		System.out.println(--count);

	}

	public static void main(String[] args) {
		
		
		
		
		Operators obj = new Operators();
		obj.postIncrement();
		obj.preIncrement();
		obj.postDecrement();
		obj.preDecrement();
		}

}
