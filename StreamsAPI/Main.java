package StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list);
		
		list.stream().forEach(x -> {
//			System.out.println(x);
			if (x%2==0) {
				System.out.println(x);
			}
		});
		
		System.out.println("___________________");
		System.out.println();
		
		List<String> collect = list.stream().map(i  -> "ABC=>"+i).collect(Collectors.toList());
		
		System.out.println(collect);
		
		System.out.println("___________________");
		System.out.println();
		
		List<Integer> fil = list.stream().filter(t -> {
			if (t>3) {
				return true;
			}
			return false;
		}).collect(Collectors.toList());
		
		System.err.println(fil);
	}
}
