package cubes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		// Keep going until you get correct input
		boolean keepGoing = true;
		
		while (keepGoing) {
			
			System.out.println("What number do you want me to anaylyse the cube root for");
			double cube = keyboard.nextDouble();

			if (cube <= 0) {
				// The input was incorrect, tell the user and have them try again
				System.out.println("You should have entered a positive number");
			} else {
				// The input was correct, execute the code for the exercise
				keepGoing = false;
				if (Newton.perfectCube(cube)) {
					System.out.println(cube + " is a perfect cube.");
				} else {
					System.out.println(cube + " is not a perfect cube.");
				}
				
				System.out.println("Give a guess for the cube root");
				double guess = keyboard.nextDouble();
				
				System.out.println("The cube root for " + cube + " is " + Newton.newtonsMethod(cube, guess));
			}
		}
		
		keyboard.close();

	}

}
