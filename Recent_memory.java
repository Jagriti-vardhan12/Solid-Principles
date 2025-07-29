package Assigments;
import java.util.LinkedList;
import java.util.Scanner;

public class Recent_memory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> recentApps = new LinkedList<>();

        System.out.println("Enter names of 5 apps as they are opened:");

        for (int i = 0; i < 5; i++) {
            String app = sc.nextLine();

            recentApps.remove(app);
            recentApps.addFirst(app);
        }

        System.out.println("Final list of recent apps:");
        for (String app : recentApps) {
            System.out.println(app);
        }
    }
}
