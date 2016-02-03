package writing;

import java.io.IOException;

public class Main {
	
	// A poem where going to write to a file
	private static String[] poem = {"The road to wisdom?",
			"—Well, it's plain and simple to express:",
			"\tErr,",
            "and err,",
            "and err again,",
            "\tbut less,",
            "\tand less,",
            "\tand less.",
            "\t\t — Piet Hein"};
	
	public static void main(String[] args) throws IOException{
		WriteAFile fileWriter = new WriteAFile();
		
		// First line we write, 
		// the "false" argument makes sure we clear the file before writing to it
		fileWriter.write("text.txt", "Grook", false);
		// Write the poem
		fileWriter.write("text.txt", poem);
	}

}
