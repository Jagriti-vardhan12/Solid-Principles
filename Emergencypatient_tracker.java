package Assigments;
import java.util.PriorityQueue;

class Patient {
    String name;
    int severity;
    int arrivalOrder; 

    public Patient(String name, int severity, int arrivalOrder) {
        this.name = name;
        this.severity = severity;
        this.arrivalOrder = arrivalOrder;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ", Arrival: " + arrivalOrder + ")";
    }
}

public class Emergencypatient_tracker {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>((p1, p2) -> {
            if (p1.severity != p2.severity) {
                return Integer.compare(p1.severity, p2.severity); 
            }
            return Integer.compare(p1.arrivalOrder, p2.arrivalOrder); 
        });

        int maxSize = 5;
        Patient[] patients = {
            new Patient("Alice", 3, 1),
            new Patient("Bob", 1, 2),
            new Patient("Charlie", 2, 3),
            new Patient("David", 1, 4),
            new Patient("Eve", 5, 5),
            new Patient("Frank", 2, 6) 
        };

        for (Patient p : patients) {
            if (queue.size() < maxSize) {
                queue.offer(p);
                System.out.println("Added patient: " + p);
            } else {
                System.out.println("Queue full, skipping patient: " + p.name);
            }
        }

        System.out.println("\nTreating patients in order:");
        while (!queue.isEmpty()) {
            System.out.println("Treating: " + queue.poll());
        }
    }
}