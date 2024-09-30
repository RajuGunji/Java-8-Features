package $Stream_APIs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Matching_Operations
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Employees emp=new Employees("Ashok",1021,"Hyderabad");
		Employees emp1=new Employees("Mahesh",1022,"Warangal");
		Employees emp2=new Employees("Charle",1023,"London");
		Employees emp3=new Employees("Raju",1024,"Hyderabad");
		List<Employees> list=Arrays.asList(emp,emp1,emp2,emp3);
		boolean b=list.stream().anyMatch(am->am.location.equals("Hyderabad"));
		System.out.println("anyone from Hyderabad? :"+b);
		
		boolean result=list.stream().allMatch(am->am.location.equals("Hyderabad"));
		System.out.println("All persond from Hyderabad? ::"+result);
		
		boolean out=list.stream().noneMatch(nm->nm.equals("canada"));
		System.out.println("NoOne from Canada? ::"+out);
		
//		Retrieve the persons Data? If that person belongs to Hyderabad!
		Optional<Employees> opt=list.stream().filter(pr->pr.location.equals("Hyderabad")).findFirst();
		if(opt.isPresent())
		{
			System.out.println(opt+" ");
		}
		
//		Retrieve the Hyderabadis Data from the Collection as the another Collection.
		List<Employees> list2=list.stream()
				.filter(pr->pr.location.equals("Hyderabad"))
			  	.collect(Collectors.toList());
		System.out.println(list2.size());
		System.out.println(list2.get(1));
	}

}
class Employees
{
	String name;
	int id;
	String location;
	public Employees(String name,int id,String location)
	{
		this.name=name;
		this.id=id;
		this.location=location;
	}
	public String toString()
	{
		return "Person_Name::"+name+", Persons_id::"+id+", Person's_location::"+location;
	}
	

}
