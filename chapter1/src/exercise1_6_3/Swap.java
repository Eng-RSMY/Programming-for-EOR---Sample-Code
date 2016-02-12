package exercise1_6_3;

public class Swap {

	public static void main(String[] args) {
		int a = 12;
		int b = 7;
		System.out.println("a: " + a + " b: " + b);
		
		a = a + b;
		System.out.println("a: " + a + " b: " + b);
		b = a - b;
		System.out.println("a: " + a + " b: " + b);
		a = a - b;
		System.out.println("a: " + a + " b: " + b);
	}

}
