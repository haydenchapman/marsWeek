import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
   //GuessingGame game = new GuessingGame();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Greetings, what's your name?");
        System.out.println("Please type your name below... ");

        //scan name
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        //create random number and counter
        Random random = new Random();
        int number = random.nextInt(100);
        int attempt = 0;

        //gametime!

        while (true) {
            System.out.println("Hello, " + name + ", please pick a number between 0-100!");
            int userGuess;
            try{
                 userGuess = scan.nextInt();
            } catch (InputMismatchException e){
                String err_input = scan.next();
                System.out.println("That is not a valid integer n00b, TRY AGAIN:");
                continue;
            }
            if (userGuess < 1 || userGuess> 100) {
                System.out.println(userGuess + " is outside of the range n00b, TRY AGAIN:");
                continue;
            }
            attempt = attempt + 1;

            if (userGuess < number) {
                System.out.println("TOO LOW! TRY AGAIN:");
            } else if (userGuess > number) {
                System.out.println("TOO HIGH! TRY AGAIN:");
            } else{
                System.out.println(name + ", YOU WIN!!!");
                System.out.println("You found the number in " + attempt + " guesses!");
                break;
            }
        }
    }
}