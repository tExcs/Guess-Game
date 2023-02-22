import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int toGuess = random.ints(1, 10)
                .findFirst()
                .getAsInt();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a guess: ");
            int userGuess = Integer.parseInt(scanner.nextLine());

            if (userGuess < toGuess) {
                System.out.println("Too low. Try Again...");
            } else if (userGuess > toGuess) {
                System.out.println("Too high. Try Again...");

            } else {
                System.out.println("Correcto!");
                break;
            }
        }
    }
}