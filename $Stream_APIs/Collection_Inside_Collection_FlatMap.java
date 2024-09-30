package $Stream_APIs;

import java.util.Arrays;
import java.util.List;

public class Collection_Inside_Collection_FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=Arrays.asList("Core","Adv","Spring","MicroServices");
		List<String> list2=Arrays.asList("HTML","CSS","BS","JS","Angular");
		List<List<String>> list=Arrays.asList(list1,list2);
		
		list.stream().flatMap(fm->fm.stream()).forEach(fe->System.out.print(fe+","));
	}

}
