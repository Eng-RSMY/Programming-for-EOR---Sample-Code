package reading;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {
		//Specifies the path to the file we are going to read
		Path path = Paths.get("text.txt");
		//Creates a new "reader" this will be used to actually access the file
		BufferedReader reader = Files.newBufferedReader(path);
		
		String line;
		//While we are able to read a line from the reader
		while ((line = reader.readLine()) != null ) {
			//Print the number of characters in that line
			System.out.println("found line with length: " + line.length());
		}
	}

}
