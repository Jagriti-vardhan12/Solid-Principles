package Assigments;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Grocery_shuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();

        System.out.println("Enter number of customers:");
        int n = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter customer names:");
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            if (name.length() % 2 == 0) {
                queue.offerFirst(name); 
            } else {
                queue.offerLast(name);  
            }
        }

        System.out.println("Serving customers in order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.pollFirst());
        }
    }
}