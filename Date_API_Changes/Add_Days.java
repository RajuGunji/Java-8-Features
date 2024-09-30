package Date_API_Changes;

import java.time.LocalDate;

public class Add_Days 
{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		
		date=date.plusDays(2);
		System.out.println(date);
		date=date.plusMonths(3);
		System.out.println(date);
		date=date.plusYears(2);
		System.out.println(date);
		
		boolean leapyr=LocalDate.parse("2024-09-06").isLeapYear();
		if(leapyr==true)
		{
			System.out.println("Given Year is a Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}

}
