package conditional.statements;

public class WhileLoop {

	public static void main(String[] args) {
		//While loop -->first condtion is check if the condition is true then execute the block of statements
		//Intial the value x=1,sum=0
		int x=1,sum=0;
		//check id the x value is less than or equal to 5
		//if it is true then go to the block
		//while(1<=5)
		while (x<=5) {
			//add the current sum value and x value and store it to the sum variable
			//sum=0+1-->sum=1
			sum=sum+x;
			//increment the x value
			//x=2
			x++;
		}
		System.out.println("The value of x is :"+sum);
	}

}
