/**
 * Created by Regina on 18.11.16.
 */
import java.util.Scanner;
import java.util.Random;

public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;

        double userNumberX;
        int userNumberN;

        System.out.println("We have formula: x^n = x * x^(n-1). Let's check it. ");

        System.out.print("Please choose x: ");
        userNumberX = input.nextInt();

        System.out.print("Please choose n: ");
        userNumberN = input.nextInt();

        double x = userNumberX;
        int n = userNumberN;

        System.out.print("x^n = ");
        System.out.println(Math.pow(x, n));

        System.out.print("x * x^(n-1) = ");
        System.out.println(x * Math.pow(x, n-1));

        System.out.println("As we see x^n = x * x^(n-1). So formula is correct!");

    }

}
