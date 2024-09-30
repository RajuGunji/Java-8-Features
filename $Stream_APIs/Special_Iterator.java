package $Stream_APIs;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Special_Iterator
{
	public static void main(String[] args)
	{
		List<String> list=Arrays.asList("Ram","Krishna","Vishnu","Mahesh");
		
		Spliterator<String> si=list.stream().spliterator();
		si.forEachRemaining(e->System.out.println(e));
	}
}
