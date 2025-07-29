package Assigments;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Last_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> searchTerms = new ArrayDeque<>();

        System.out.println("Enter search terms (type 'exit' to stop):");
        while (true) {
            String term = sc.nextLine();
            if (term.equalsIgnoreCase("exit")) {
                break;
            }
            if (searchTerms.size() == 3) {
                searchTerms.pollFirst(); 
            }
            searchTerms.offerLast(term); 

            System.out.println("Current last 3 searches: " + searchTerms);
        }

        System.out.println("Final last 3 search terms: " + searchTerms);
    }
}
