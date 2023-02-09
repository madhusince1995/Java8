import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		
        al.add(2);
        al.add(6);
        al.add(9);
        al.add(4);
        al.add(20);
        al.add(20);
        filteringData(al);
        mapUsingStreams(al);
        sortedStream(al);
        distinct(al);
	}
	
	private static void distinct(List<Integer> al) {
		List<Integer> distinct=al.stream().distinct().collect(Collectors.toList());
		System.out.println("distinct elements"+distinct);
	}

	private static void sortedStream(List<Integer> al) {
	List<Integer> sort=al.stream().sorted().collect(Collectors.toList());
	System.out.println("sorted list"+sort);
		
	}
	private static void mapUsingStreams(List<Integer> al) {
		
		List<Integer> map=al.stream().map(i->i+6).collect(Collectors.toList());
		System.out.println("map after inc the data"+map);
	}
	static void filteringData(List<Integer> li) {
		List<Integer> filter=li.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("even number"+filter);
	}

}
