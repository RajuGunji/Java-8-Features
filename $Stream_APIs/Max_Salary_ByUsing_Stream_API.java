package $Stream_APIs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Max_Salary_ByUsing_Stream_API
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MinMaxAvg minmaxavg=new MinMaxAvg("Krishna",1020, 21000,"Hydearbad");
		MinMaxAvg mma=new MinMaxAvg("Mutthu", 1021, 30000,"Thiruvananthapuram");
		MinMaxAvg mma1=new MinMaxAvg("Rakshith Shetty",1022,33000,"Banglore");
		MinMaxAvg mma2=new MinMaxAvg("Smith",1023, 44000,"sidney");
		MinMaxAvg mma3=new MinMaxAvg("Stokes", 1024,47000,"London");
		MinMaxAvg mma4=new MinMaxAvg("Biden", 1025,60000,"Canada");
		
		List<MinMaxAvg> list=Arrays.asList(minmaxavg,mma,mma1,mma2,mma3,mma4);
		
		Optional<MinMaxAvg> opt=list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
		if(opt.isPresent())
		{
			
			System.out.println("Max Salary is:: "+opt.get().salary);
		}
	}
}
class MinMaxAvg
{
	String name;
	int id;
	int salary;
	String location;
	
	MinMaxAvg(String name,int id,int salary,String location)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.location=location;
	}
	public String toString()
	{
		return "Emp_Name::"+name+" Emp_Id::"+id+" Emp_Salary::"+salary+" Emp_Location::"+location;
	}
}