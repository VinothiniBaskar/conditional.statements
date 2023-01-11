package logical.programs;

public class Fiboannci {

	public static void main(String[] args) {
		//declare a firstnum,secNum as 0,1 
		//sum=0 and inputnumber as 8
		int firstNum=0,secondNum=1,sum=0 ,inputNumber=8;
		//print the firstnum and secondnum
		System.out.print(firstNum + " " + secondNum);
		//iterate the for loop starts with 2 because first and second number is already printed
		for (int i = 2;i<=inputNumber;i++) {
			//add the first and second numbers then store it to sum
			//sum=0+1
			//sum=1+1-->sum=2
			sum=firstNum+secondNum;
			//assign the second num as fn --> for next iteration
			//firstnum=1
			//firstnum=1
			firstNum=secondNum;
			//assign the sum into secondnum-->for next iteration
			//secondnum=1
			//secNum=2 -->for next fistnum=1 secondnum=2
			secondNum=sum;
			//print the sum value
			System.out.print( " " + sum);
			
		}
	}
}