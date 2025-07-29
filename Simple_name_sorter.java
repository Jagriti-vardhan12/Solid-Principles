package java8_com.jv;

import java.util.*;

public class Simple_name_sorter {
		    public static void main(String[] args) {
		        List<String> names = Arrays.asList("Alice", "Bob", "Eve", "Charlie", "David");

		        Collections.sort(names, (name1, name2) -> name1.compareTo(name2));
		        System.out.println("Sorted names:");
		        for (String name : names) {
		            System.out.println(name);
		        }
	}

}
