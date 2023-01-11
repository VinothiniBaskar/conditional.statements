package conditional.statements;

public class ForLoop {

	public static void main(String[] args) {
		//For loop -->intialization ,condition,increment/decrement
		int number=10;
		for (int i = 0; i <=number; i++) {
			System.out.println(i);
		}
		
		
		String s []= {"Vino","Vasanth"};
		//data type=String ,obj=eachName,variable name=s 
		for (String eachName : s) {
			System.out.println("The names of the array is :"+eachName);
		}
		
	}

}
