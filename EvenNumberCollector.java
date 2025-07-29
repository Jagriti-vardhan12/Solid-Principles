package java8_com.jv;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberCollector {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 15, 22, 33, 48, 51, 60);
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

	}

}
