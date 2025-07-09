//conditionalstatementschallenge
import java.util.Random;
public class dice {
    public static void main(String[] args) {
        Random rand = new Random();

        // Roll two six-sided dice
        int die1 = rand.nextInt(6) + 1; // 1 to 6
        int die2 = rand.nextInt(6) + 1; // 1 to 6

        int sum = die1 + die2;

        // Display the result
        System.out.println("You rolled:");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total: " + sum);
    }
}
