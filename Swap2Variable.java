
public class Swap2Variable {
	
	public static void main(String args[]){
		
		int a = 1;
		int b = 5;
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}