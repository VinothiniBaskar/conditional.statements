package array.programs;


public class DeleteDuplicateElement {

	public static void main(String[] args) {
		
		//Intialze the array
		int a[]= {1,2,1,3,2,4};
		
		
		//This for loop is for  get the first element in the array
		for (int i = 0; i < a.length; i++) {
			//This for loop is for get the second element in the array
			for (int j = i+1; j < a.length; j++) {
				//If the first element and second element is equls the assign that element as -1
				if (a[i]==a[j]) {
					a[i]=-1;
				}
			}
		}
		
		//This for loop is for  print the unique elements in the array
		for (int i = 0; i < a.length; i++) {
			//If the element is not equal to -1 and then print that element in the array
			if (a[i]!=-1) {
				System.out.println("The Unique element in the array is :"+a[i]);
			}
		}
		
	}

}
