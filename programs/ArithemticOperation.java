package logical.programs;

public class ArithemticOperation {

	int number1, number2, number3;

	public void add(int a, int b) {
		this.number1 = a;
		this.number2 = b;
		number3 = number1 + number2;
		System.out.println("The Addition of numbers is :"+number3);

	}
	
	public void sub(int x,int y) {
		this.number1=x;
		this.number2=y;
		number3=number1-number2;
		System.out.println("The substraction of numbers is :"+number3);

	}
	public void mul(int d,int e) {
		this.number1=d;
		this.number2=e;
		number3=number1*number2;
		System.out.println("The Multiplication of numbers is :"+number3);

	}
	public void div(int g,int h) {
		this.number1=g;
		this.number2=h;
		number3=number1/number2;
		System.out.println("The division of numbers is :"+number3);

	}

	public static void main(String[] args) {
		ArithemticOperation a = new ArithemticOperation();
		a.add(10, 10);
		a.sub(50, 10);
		a.mul(5, 2);
		a.div(10, 5);

	}

}
