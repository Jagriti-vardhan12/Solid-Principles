package Assigments;
import java.util.concurrent.LinkedBlockingQueue;

public class Chat_processor {
    private static final LinkedBlockingQueue<String> messageQueue = new LinkedBlockingQueue<>();
    private static volatile boolean running = true;

    public static void main(String[] args) {
        Thread producer = new Thread(() -> {
            int messageCounter = 1;
            try {
                while (running) {
                    if (messageQueue.size() > 5) {
                        Thread.sleep(100); 
                        continue;
                    }
                    String msg = "Message " + messageCounter++;
                    messageQueue.put(msg);
                    System.out.println("Added: " + msg);
                    Thread.sleep(300);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (running) {
                    String msg = messageQueue.take(); 
                    System.out.println("Processed: " + msg);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

        try {
            Thread.sleep(10000); // run for 10 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        running = false;
        producer.interrupt();
        consumer.interrupt();

        System.out.println("Chat processing stopped.");
    }
}
