

public class TimePeriods {
	
	String daysToPeriod(int days){
		String period = "no match";
		if (days == 1) {
			period = "day";
		}
		else if (days == 7) {
			period = "week";
		}
		else if (days == 31) {
			period = "month";
		}
		else if (days == 365) {
			period = "year";
		}
		else if (days == 3652) {
			period = "decade";
		}
		
		return period;
	}
	
	int periodToDays(String period){
		int days = -1;;
		if (period.equals("day")) {
			days = 1;
		}
		else if (period.equals("week")) {
			days = 7;
		}
		else if (period.equals("month")) {
			days = 31;
		}
		else if (period.equals("year")) {
			days = 365;
		}
		else if (period.equals("decade")) {
			days = 3652;
		}
		return days;
	}

}
