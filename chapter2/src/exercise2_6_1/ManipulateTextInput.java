package exercise2_6_1;

import java.util.Scanner;

public class ManipulateTextInput {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String lineOne = keyboard.nextLine();
		String lineTwo = keyboard.nextLine();
		
		System.out.println(lineTwo);
		System.out.println(lineOne);
		
		keyboard.close();
	}

}
