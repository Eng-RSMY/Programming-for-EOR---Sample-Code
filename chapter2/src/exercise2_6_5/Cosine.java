package exercise2_6_5;

public class Cosine {

	public static void main(String[] args) {
		double x = 2.31;
		int n = 11;
		
		System.out.println(cosineNaive(x, n));
		System.out.println(cosine(x, n));
		System.out.println(Math.cos(x));
	}
	
	static double cosineNaive(double x, int iterations){
		double result = 1;
		for(int i = 1; i < iterations; i++){
			result = result + (Math.pow(-1, i)/factorial(2*i))*Math.pow(x, (2*i));
		}	
		return result;
	}
	
	static double cosine(double x, int iterations){
		double sum = 1;
		double term = 1;
		for(int i = 0; i < iterations; i++){
			term = term * -1 * ((x*x)/((2*i+1)*(2*i+2)));
			sum += term;
		}
		return sum;
	}
	
	static int factorial(int n){
		int result = 1;
		
		for(int i = n; i > 0; i--){
			result = result*i;
		}
		
		return result;
	}

}