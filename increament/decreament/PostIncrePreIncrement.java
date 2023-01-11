package increament.decreament;

public class PostIncrePreIncrement {

	public static void main(String[] args) {
		int a=10;
		int b=++a;
		System.out.println(a);//11
		System.out.println(b);//11
		
		int x=12;
		int y=x++;
		System.out.println(x); //13
		System.out.println(y);//12
		
		int i=34;
		int j=--i;
		
		System.out.println(i); //33
		System.out.println(j);//33
		
		int k=30;
		int l=k--;
		
		System.out.println(k); //29
		System.out.println(l);//30
		
		
	}

}
