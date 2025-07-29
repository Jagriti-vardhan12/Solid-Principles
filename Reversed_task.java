package Assigments;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.ListIterator;

public class Reversed_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> tasks = new LinkedList<>();

        System.out.println("Enter 4 tasks:");
        for (int i = 0; i < 4; i++) {
            String task = sc.nextLine();
            if (task.endsWith("I")) {
                tasks.addFirst(task);
            } else {
                tasks.addLast(task);
            }
        }

        System.out.println("Tasks in reverse order:");
        ListIterator<String> iterator = tasks.listIterator(tasks.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}