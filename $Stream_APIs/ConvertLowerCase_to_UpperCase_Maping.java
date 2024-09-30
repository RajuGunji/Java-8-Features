package $Stream_APIs;

import java.util.Arrays;
import java.util.List;

public class ConvertLowerCase_to_UpperCase_Maping {

	public static void main(String[] args) {
		
//      Convert the LowerCase Collection Elements into UpperCase Character Elements.
	    /*List<String> list=Arrays.asList("Java","Html","Css","JavaScript","BootStrap","Angular");
	  	list.stream().map(name->name.toUpperCase()).forEach(fe->System.out.println(fe));*/
		
//		Print the lenth of the Strings/Collection Elements.
		/*list.stream().mapToInt(name->name.length()).forEach(fe->System.out.println(fe) );*/
		
//		Print the Names which are Starting from 'A'
		/*List<User> list1=Arrays.asList(new User("Raju"),new User("Ashok"),new User("Rani"),new User("Daniel"));
		list1.stream().filter(fi->fi.name.startsWith("A")).map(m->m.name+"-->"+m.name.length()).forEach(fe->System.out.println(fe));*/
		
//		Print the User_Name & User_Location where User_Age is >22.
		List<User> list2=Arrays.asList(new User("Raju",24,"Hyderabad"),new User("Ashok",36,"Hyderabad"),new User("Rani",24,"Banglore"),new User("Daniel",20,"Kerala"));
		list2.stream().filter(fi->fi.age>=22).map(m->m.name+"-"+m.location).forEach(fe->System.out.println(fe));
	}
}
class User
{
	String name;
	int age;
	String location;
	public User(String name,int age,String location)
	{
		this.name=name;
		this.age=age;
		this.location=location;
	}
	
	public User(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return name+age+location;
	}
}