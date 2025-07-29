package Assigments;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class Print_manager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayBlockingQueue<String> printQueue = new ArrayBlockingQueue<>(3);

        System.out.println("Enter print job names (type 'exit' to stop):");

        while (true) {
            String job = sc.nextLine();
            if (job.equalsIgnoreCase("exit")) {
                break;
            }
            
            boolean added = printQueue.offer(job);
            if (!added) {
                System.out.println("Queue full. Skipping job: " + job);
            } else {
                System.out.println("Added job: " + job);
            }
        }

        System.out.println("\nPrinting jobs one by one:");
        while (!printQueue.isEmpty()) {
            System.out.println("Printing job: " + printQueue.poll());
        }

        System.out.println("All jobs printed.");
    }
}
