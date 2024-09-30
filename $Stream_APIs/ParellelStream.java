package $Stream_APIs;

import java.util.Arrays;
import java.util.List;

public class ParellelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=========Sequential Stream========");
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		list.stream().forEach(e->System.out.println(e+" "+Thread.currentThread()));
		
		System.out.println("=========Parellel Stream========");
		list.stream().parallel().forEach(e->System.out.println(e+" "+Thread.currentThread()));
	}

}
