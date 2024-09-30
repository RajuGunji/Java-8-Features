package Date_API_Changes;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class AddHours_to_LocalTime
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LocalTime localTime=LocalTime.now();
		System.out.println(localTime);
		
		localTime=localTime.plusHours(2);
		System.out.println(localTime);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		dateTime=dateTime.plusHours(5);
		System.out.println(dateTime);
	}
}
