import java.util.Scanner;

public class GuessingGame {
    GuessingGame game = new GuessingGame();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Greetings, what's your name?");
        System.out.println("(Please type your name.) ");

        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
    }
}
