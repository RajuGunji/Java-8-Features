package $Stream_APIs;

import java.util.Arrays;
import java.util.List;

public class Filter_Names 
{
	public static void main(String[] args)
	{
		List<String> list=Arrays.asList("Ashok","Anjali","Ram","Raju","Rani","Somu");
		list.stream().filter(fi-> fi.startsWith("A")).forEach(i->System.out.println(i));
	}
}
