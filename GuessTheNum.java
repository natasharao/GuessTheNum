import java.util.Scanner;

public class GuessTheNum {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Guess The Number!\n To continue type 'yes' or type 'no' to quit");

        String proceed = input.nextLine();
        if (proceed.equalsIgnoreCase("no")) {
            System.out.println("Thank you for playing!");
        }

        System.out.println("Pick an upper bound:\n");
        int upperBound = input.nextInt();
        System.out.println("Guess the number between 0 and " + upperBound);

        int secretNum = (int) (Math.random() * upperBound);
        int guess = input.nextInt();

        while (guess != -1) {


            System.out.println("Guess again! Type '-1' if you give up.");
            guess = input.nextInt();

            if (guess == secretNum) {
                break;
            }

        } // end "give up" while

        if (guess == secretNum) {
            System.out.println("You Guessed It!");
        }

        if (guess == -1) {
            System.out.println("The number was: " + secretNum);
            System.out.println("Thank you for playing!");
        }

    } // end main


}
