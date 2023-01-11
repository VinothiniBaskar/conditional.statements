package array.programs;

public class MissingNumber {

	public static void main(String[] args) {
		int count=1;
		int a []= {1,2,4,6,7,9,10};
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=i+count) {
				System.out.println("The Missing number in  the array is :"+(i+count));
				count++;
               
			}

		}
	}

}
