package writing;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteAFile {
	
	public void write(String filename, String text) throws IOException{ write(filename, text, true); }
	
	public void write(String filename, String text, boolean append) throws IOException{
		String[] array = {text};
		this.write(filename, array, append);
	}
	
	public void write(String filename, String[] array) throws IOException{ write(filename, array, true); }
	
	public void write(String filename, String[] array, boolean append) throws IOException{
		Path path = Paths.get(filename);
		Writer writer;
		if ( append ){
			writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND);
		} else {
			writer = Files.newBufferedWriter(path);
		}
		
		for (String text : array){
			writer.write(text + "\n");
		}
		
		writer.flush();
		
		writer.close();
	}

}
