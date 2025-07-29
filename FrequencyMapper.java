package java8_com.jv;

import java.util.*;
import java.util.stream.Collectors;

public class FrequencyMapper {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Alice", "Eve", "Bob", "Alice", "David");
        Map<String, Long> nameFrequencies = names.stream()
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        System.out.println("Name frequencies: " + nameFrequencies);
    }
}