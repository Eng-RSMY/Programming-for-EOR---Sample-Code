package writing;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteAFile {
	
	// If the caller doesn't specify we will assume we append
	public void write(String filename, String text) throws IOException{ write(filename, text, true); }
	
	// If only single string is given, create an array of 1 string and call the function for array
	// This way we have as little copy/paste code as possible.
	public void write(String filename, String text, boolean append) throws IOException{
		String[] array = {text};
		this.write(filename, array, append);
	}
	
	// If the caller doesn't specify we will assume we append
	public void write(String filename, String[] array) throws IOException{ write(filename, array, true); }
	
	public void write(String filename, String[] array, boolean append) throws IOException{
		// Specify the file we are writing too
		Path path = Paths.get(filename);
		Writer writer;
		if ( append ){
			// If we are appending give that argument when creating the writer
			writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND);
		} else {
			// If not, not.
			writer = Files.newBufferedWriter(path);
		}
		
		for (String text : array){
			// Actually writing to the file
			// Adding a new line (\n) after each String in the array
			writer.write(text + "\n");
		}
		
		// Especially with files, make sure to close it when you are done,
		// If your program crashes and the file was not closed it might
		// become unreadable
		writer.close();
	}

}
