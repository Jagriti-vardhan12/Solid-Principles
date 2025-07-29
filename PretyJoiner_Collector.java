package java8_com.jv;

import java.util.*;
import java.util.stream.Collectors;

public class PretyJoiner_Collector {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Mumbai", "Chennai", "Delhi", "Kolkata", "Pune");
        String result = cities.stream()
                             .collect(Collectors.joining(", "));
        System.out.println("Cities: " + result);
    }
}

