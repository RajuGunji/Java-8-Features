package $Stream_APIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(24, 32, 76, 14, 9, 67);
		/*Stream<Integer> stream=list.stream();
		Stream<Integer> filter=stream.filter(fi-> fi>20);
		filter.forEach(i->System.out.println(i));*/
		
		list.stream().filter(fi-> fi>20).forEach(i->System.out.println(i));
	}

}
