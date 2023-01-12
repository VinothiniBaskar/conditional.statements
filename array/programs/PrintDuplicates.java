package array.programs;

public class PrintDuplicates {

	public static void main(String[] args) {
		//Initialize array   
		int a[]= {1,2,3,2,1,4,5};
		
		//This for loop is for searching the first element
		for (int i = 0; i < a.length; i++) {
			//This for loop is for comparison of first and second element in the array
			for (int j = i+1; j < a.length; j++) {
				//check the condition,if both elements are same then print that element
				if (a[i]==a[j]) {
					//print the duplicate element 
					System.out.println("The Duplicate elements are :"+a[j]);
				}
			}
		}
       
	}

}
