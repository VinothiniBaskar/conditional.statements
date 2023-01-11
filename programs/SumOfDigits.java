package logical.programs;

public class SumOfDigits {

	public static void main(String[] args) {
		int number=1234,sum=0,reminder;
		
		while (number>0) {
			reminder=number%10;
			sum=sum+reminder;
			number=number/10;
			
		}
System.out.println("The sum of digits is :"+sum);
	}

}
