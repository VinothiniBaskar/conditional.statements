package logical.programs;

public class SumOfEvenOddNumbers {

	public static void main(String[] args) {
		
		int a [] ={1,2,1,3,2};
		
		int evenSum=0,oddSum=0;
		
		for (int i = 0; i <a.length; i++) {
			
			if (a[i]%2==0) {
				evenSum=evenSum+a[i];
				
			}
			else {
				oddSum=oddSum+a[i];
			}
		}
	System.out.println("Sum of Even number is :"+evenSum);
	System.out.println("Sum of Odd number is :"+oddSum);
	}

}
