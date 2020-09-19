package utilities;

import java.time.LocalDate;

public class DateHandler {
	public static String getMonth(String date) {
		return LocalDate.parse(date).getMonth().name().toLowerCase();
	}
	
	public static String getDay(String date) {
		return String.valueOf(LocalDate.parse(date).getDayOfMonth());
	}
	
	public static String getYear(String date) {
		return String.valueOf(LocalDate.parse(date).getYear());
	}

}
