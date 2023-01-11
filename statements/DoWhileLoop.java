package conditional.statements;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		//intialze the x value as 1
		//do while -->first do block is executed and then check the condition
		//if the condition is valid then again to the do block statements execute the statement 
		//untill the while condition is exit
		int x=1;
		
		do {
			//
			System.out.println(x);
			x++;
		} while (x<=0);//while condition is false but above the do while statements are executed
		System.out.println(x);

		
		
		int a=2,sum=0;
		do {
			sum=sum+a;
			a++;
		} while (a<=5);
		
		System.out.println(sum);

	}

}
