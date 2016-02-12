package exercise2_6_4;

public class Factorial {

	public static void main(String[] args) {
		for ( int i = 0; i < 20; i++ ){
			System.out.println(i + "! = " + factorial(i));
		}
	}
	
	static long factorial(int n){
		int result = 1;
		
		for(int i = n; i > 0; i--){
			result = result*i;
		}
		
		return result;
	}

}
