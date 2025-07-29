package Assigments;
import java.util.concurrent.LinkedBlockingQueue;
class Task {
 int id;
 String description;

 public Task(int id, String description) {
     this.id = id;
     this.description = description;
 }

 @Override
 public String toString() {
     return "Task{id=" + id + ", desc=" + description + "}";
 }
}

public class Stagebased_taskrunner {
 public static void main(String[] args) throws InterruptedException {
     // Queues for each stage
     LinkedBlockingQueue<Task> stage1Queue = new LinkedBlockingQueue<>();
     LinkedBlockingQueue<Task> stage2Queue = new LinkedBlockingQueue<>();

     for (int i = 1; i <= 5; i++) {
         stage1Queue.put(new Task(i, "Task " + i));
     }

     while (!stage1Queue.isEmpty()) {
         Task t = stage1Queue.take();
         System.out.println("Stage 1 processed: " + t);
         if (t.id % 2 == 0) {
             stage2Queue.put(t);
         }
     }

     while (!stage2Queue.isEmpty()) {
         Task t = stage2Queue.take();
         System.out.println("Stage 2 processed: " + t);
     }
 }
}
