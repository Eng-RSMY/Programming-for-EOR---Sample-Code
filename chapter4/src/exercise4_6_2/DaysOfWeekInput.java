package exercise4_6_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DaysOfWeekInput {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("input.txt");
		BufferedReader reader = Files.newBufferedReader(path);
		
		String line;
		
		Scanner keyboard = new Scanner(System.in);
		
		String firstDay = keyboard.nextLine();
		keyboard.close();
		
		int weekDayOffset = 0;
		if ( firstDay.equals(DaysOfTheWeek.MONDAY.toString())){
			weekDayOffset = 0;
		} else if (firstDay.equals(DaysOfTheWeek.TUESDAY.toString()) ){
			weekDayOffset = 1;
		} else if (firstDay.equals(DaysOfTheWeek.WEDNESDAY.toString()) ){
			weekDayOffset = 2;
		} else if (firstDay.equals(DaysOfTheWeek.THURSDAY.toString()) ){
			weekDayOffset = 3;
		} else if (firstDay.equals(DaysOfTheWeek.FRIDAY.toString()) ){
			weekDayOffset = 4;
		} else if (firstDay.equals(DaysOfTheWeek.SATURDAY.toString()) ){
			weekDayOffset = 5;
		} else if (firstDay.equalsIgnoreCase(DaysOfTheWeek.SUNDAY.toString()) ){
			weekDayOffset = 6;
		}
		
		System.out.println("First day of the year is " + DaysOfTheWeek.values()[weekDayOffset].toString());

		while((line = reader.readLine()) != null){
			//System.out.println("Line read: " + line);
			
			int day = Integer.parseInt(line);
			//System.out.println("Number Parsed: " + day);
			// this program is incomplete, you have to write the rest of the code to finish it
			// here you have to "compute" which day of the week is the "day" of the year you just read  
		
			String dayOfWeek = DaysOfTheWeek.values()[(day-1+weekDayOffset)%7].toString();
			System.out.println(day + " " + dayOfWeek);
		
		}

	}

}
