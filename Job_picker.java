package Assigments;
import java.util.PriorityQueue;
import java.util.Scanner;

class Job {
    String name;
    int urgency;

    public Job(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }

    @Override
    public String toString() {
        return "Job{name='" + name + "', urgency=" + urgency + "}";
    }
}

public class Job_picker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Job> jobQueue = new PriorityQueue<>(
            (j1, j2) -> {
                if (j1.urgency != j2.urgency) {
                    return Integer.compare(j1.urgency, j2.urgency);
                } else {
                    return Integer.compare(j1.name.length(), j2.name.length());
                }
            }
        );

        System.out.println("Enter number of jobs:");
        int n = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter job name and urgency (1-5) separated by space:");
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] parts = input.split("\\s+");
            if (parts.length != 2) {
                System.out.println("Invalid input. Please enter job name and urgency separated by space.");
                i--;
                continue;
            }
            String jobName = parts[0];
            int urgency;
            try {
                urgency = Integer.parseInt(parts[1]);
                if (urgency < 1 || urgency > 5) {
                    System.out.println("Urgency must be between 1 and 5.");
                    i--;
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Urgency must be a number between 1 and 5.");
                i--;
                continue;
            }
            jobQueue.offer(new Job(jobName, urgency));
        }

        System.out.println("Jobs in priority order:");
        while (!jobQueue.isEmpty()) {
            System.out.println(jobQueue.poll());
        }
    }
}