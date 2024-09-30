package $Stream_APIs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Min_Salary_ByUsing_StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinAvgSalary ms1=new MinAvgSalary("Rajesh",2024,45000,"India");
		MinAvgSalary ms2=new MinAvgSalary("Johnson",2025,68000,"Australi");
		MinAvgSalary ms3=new MinAvgSalary("Daniel Vittory",2026,82000,"Newzeland");
		MinAvgSalary ms4=new MinAvgSalary("Cristino",2027,160000,"Argentina");
		MinAvgSalary ms5=new MinAvgSalary("Virat Kohli",2028,150000,"India");
		
		List<MinAvgSalary> list=Arrays.asList(ms1,ms2,ms3,ms4,ms5);
		
		Optional<MinAvgSalary> opt=list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));
		if(opt.isPresent())
		{
			System.out.println(opt.get().salary);
		}
		
		Double avg=list.stream().collect(Collectors.averagingDouble(e->e.salary));
		System.out.println(avg);
	}

}
class MinAvgSalary
{
	String name;
	int id;
	int salary;
	String country;
	
	public MinAvgSalary(String n,int i,int s,String c)
	{
		name=n;
		id=i;
		salary=s;
		country=c;
	}
	public String toString()
	{
		return "Emp_Name::"+name+" Emp_Id::id"+id+"Emp_Salary::"+salary+"Emp_country::"+country;
	}
}