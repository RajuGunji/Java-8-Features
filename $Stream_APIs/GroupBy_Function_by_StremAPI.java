package $Stream_APIs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy_Function_by_StremAPI 
{
	public static void main(String[] args)
	{
		Players p1=new Players("Rajat Patidar",2024,45000,"India");
		Players p2=new Players("Johnson",2025,68000,"Australi");
		Players p3=new Players("Daniel Vittory",2026,82000,"Newzeland");
		Players p4=new Players("Cristiano Ronaldo",2027,160000,"Argentina");
		Players p5=new Players("Virat Kohli",2028,150000,"India");
		
		List<Players> list=Arrays.asList(p1,p2,p3,p4,p5);
		Map<String,List<Players>> data=list.stream().collect(Collectors.groupingBy(e->e.country));
		System.out.println(data);
	}

}
class Players
{
	String name;
	int id;
	int salary;
	String country;
	
	public Players(String n,int i,int s,String c)
	{
		name=n;
		id=i;
		salary=s;
		country=c;
	}
	public String toString()
	{
		return "Emp_Name::"+name+", Emp_Id::id"+id+", Emp_Salary::"+salary+", Emp_country::"+country;
	}

}