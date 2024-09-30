package $Stream_APIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterData_from_Objects
{
	public static void main(String[] args) {
		Users user=new Users("Akilesh",28,214);
		Users user1=new Users("Ramesh",35,215);
		Users user2=new Users("Kajol",22,216);
		Users user3=new Users("Ameer",38,217);
		List<Users> list=Arrays.asList(user,user1,user2,user3);
		
		/*list.stream().filter(fi->fi.name.startsWith("A") && fi.age>=18).forEach(i->System.out.println(i));*/
		
		list.stream().filter(fi->fi.name.startsWith("A")).filter(fi->fi.age>=18).forEach(fe->System.out.println(fe));
		
	}
}
class Users
{
	String name;
	int age;
	int Id;
	public Users(String name,int age,int Id)
	{
		this.name=name;
		this.age=age;
		this.Id=Id;
	}
	public String toString()
	{
		return "User[ Name:"+name+", Age:"+age+", Id:"+Id+"]";
	}
}
