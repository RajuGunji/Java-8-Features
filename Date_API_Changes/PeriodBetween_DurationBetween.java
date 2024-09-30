package Date_API_Changes;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodBetween_DurationBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Period p=Period.ofDays(5);
		System.out.println(p.getDays());
		Period p1=Period.between(LocalDate.parse("1998-05-14"), LocalDate.now());
		System.out.println(p1);
	System.out.println(Duration.between(LocalTime.parse("05:19:34"),LocalTime.now()));
	}

}
