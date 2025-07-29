package Assigments;
import java.util.Scanner;
import java.util.Stack;

public class Undo_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> commandStack = new Stack<>();

        System.out.println("Enter 3 commands:");
        for (int i = 0; i < 3; i++) {
            String command = sc.nextLine();
            commandStack.push(command);
        }

        String undoneCommand = commandStack.pop();
        System.out.println("Undone command: " + undoneCommand);

        String reversed = new StringBuilder(undoneCommand).reverse().toString();
        commandStack.push(reversed);
        System.out.println("Redone (re-added in reverse): " + reversed);

        System.out.println("Current Stack:");
        for (int i = commandStack.size() - 1; i >= 0; i--) {
            System.out.println(commandStack.get(i));
        }
    }
}