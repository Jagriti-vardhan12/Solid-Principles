package java8_com.jv;

import java.util.*;

public class MethodReferenceSorter {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Charlie", "Alice", "David", "Bob", "Eve");
        Collections.sort(names, String::compareTo);

        System.out.println("Sorted names:");
        names.forEach(System.out::println);
    }
}

