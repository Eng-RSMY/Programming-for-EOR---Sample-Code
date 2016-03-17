package cubes;

public class Newton {
	final static double epsilon = 1e-5; 
	
	// A simple formula for determining whether a cube is a perfect cube
	// This would also determine the root for a perfect cube...
	public static boolean perfectCube(double cube){
		for ( int guess = 1; guess < cube; guess++ ){
			if ( guess*guess*guess == cube ) {
				return true;
			}
		}
		
		return false;
	}
	
	// More complicated formula for determining the cube root for any positive number 
	public static double newtonsMethod(double cube, double guess){
		// initialize c0 such that the content of the while loop gets executed at least once
		// a do { } while () might also have done this...
		double c0 = guess + 2 * epsilon;
		double c1 = guess;
		while ( absolute(c1-c0) > epsilon ){
			c0 = c1;
			c1 = ((2*c0+(cube/(c0*c0)))/3);
			// Some debug code
			//System.out.println(c1);
		}
		return c1;
	}
	
	// If I'm not allowed to use the Math package I'll have to define my own helper methods
	// this gives back the absolute value for any input.
	private static double absolute(double value){
		if ( value < 0){
			return -1 * value;
		}
		return value;
	}

}
