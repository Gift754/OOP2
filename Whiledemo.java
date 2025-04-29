import java.util.Scanner;
public class Whiledemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.println("Hello!");
            System.out.print("Type 'h' to say hello again, or anything else to stop: ");
            choice = sc.nextLine();
        } while (choice.equals("h"));

        System.out.println("Goodbye!");
    }
}
    
