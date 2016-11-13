/**
 * Created by Nout on 13.11.2016.
 */
import java.util.Scanner;
import java.util.Random;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int x = random.nextInt();
        int userX;

        System.out.print("Please choose x: ");
        userX = input.nextInt();

        if (x > 0) {
            System.out.println("x is positive!");

        } else if (x < 0) {
            System.out.println("x is negative");

        } else {
            System.out.println("x is zero");
        }





    }
}
