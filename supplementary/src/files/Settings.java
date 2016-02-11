package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Settings {
	private int[] settings = new int[SettingOptions.values().length];
	
	public int[] getSettings() {
		return settings;
	}

	public void setSettings(int[] settings) {
		this.settings = settings;
	}

	public void readSettings(String fileName) throws IOException{
		File inputFile = new File(fileName);		
		Files.lines(inputFile.toPath()).forEach(s -> interpretLine(s));
		writeSettings(fileName);
	}
	
	public void interpretLine(String line){
		String settingName = line.substring(0, line.indexOf("="));
		String setting = line.substring(line.indexOf("=")+1);
		System.out.println("Setting name: " + settingName + " Setting:" + setting);
		
		for ( int settingNo = 0; settingNo < settings.length; settingNo++){
			if (settingName.equals(SettingOptions.values()[settingNo].toString())) {
				settings[settingNo] = Integer.parseInt(setting);
				System.out.println(setting + "Integer setting:" + Integer.parseInt(setting));
			}
		}
	}
	
	public void writeSettings(String fileName) throws IOException {
		List<String> lines = new ArrayList<String>();
		File outputFile = new File(fileName);
		for ( int settingNo = 0; settingNo < settings.length; settingNo++){
			lines.add(SettingOptions.values()[settingNo] + "=" + settings[settingNo]);
		}

		Files.write(outputFile.toPath(), lines);
	}

}
