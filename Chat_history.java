package Assigments;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Chat_history {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> chatHistory = new ArrayDeque<>();

        System.out.println("Enter chat messages (type 'exit' to stop):");
        while (true) {
            String message = sc.nextLine();
            if (message.equalsIgnoreCase("exit")) {
                break;
            }

            if (chatHistory.size() == 4) {
                chatHistory.pollFirst();
            }
            
            chatHistory.offerLast(message);

            System.out.println("Current chat history: " + chatHistory);
        }

        System.out.println("Final chat history:");
        for (String msg : chatHistory) {
            System.out.println(msg);
        }
    }
}
