package array.programs;

public class LargestSmallestNumber {

	public static void main(String[] args) {
		//Intialize the array
		int a []= {2,1,3,9,5};
		
		//Declare a varibles for storing the first element
		int large,small;
		
		//Assign the first value into the variables
		//Based on the loops it will change the values of large and small
		large=small=a[0];
		
		//Iterate the loop to get the elements
		for (int i = 1; i < a.length; i++) {
			//Check if the particular element is greater than large element
			//then store it to that variable
			//For next iteration current large value to be taken
			if (a[i]>large) {
				large=a[i];
			}
			//check if the particular element is leass than small variable then store it 
			//to that small variable
			//Next iteration that small variable to be taken                                                                                                                                                                                                                                                                                   
			else if (a[i]<small) {
				small=a[i];
			}
			
			
		}
		
		System.out.println("The Smallest element in the array is : "+small);
		System.out.println("The Largest element in the array is  : "+large);



	}
                                                                                                                                                                          
}
