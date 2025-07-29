package java8_com.jv;
import java.util.*;

public class Wordcounter_StreamFilter{
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Benjamin", "Charlotte", "David", "Alexandra");
        long count = names.stream()
                .filter(name -> name.length() > 5)
                .count();

        System.out.println("Number of names longer than 5 characters: " + count);
    }
}


