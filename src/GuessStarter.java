/**
 * Created by Nout on 10.11.2016.
 */

import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main (String[] args){ String line;
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int number = random.nextInt(100) + 1;
        int userNumber;
        System.out.println("I am thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.print("Your guess is: ");
        userNumber = input.nextInt();
        System.out.print("The number I was thinking of is: ");
        System.out.println(number);
        System.out.println("You were off by: ");
        System.out.printf("%d", number - userNumber);









    }
}
