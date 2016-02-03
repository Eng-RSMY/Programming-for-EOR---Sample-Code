package files;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Settings settings = new Settings();
		
		settings.readSettings("input.txt");
		
		//settings.writeSettings("output.txt");

	}

}
