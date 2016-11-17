/**
 * Created by Regina on 17.11.16.
 */
import java.util.Scanner;
import java.util.Random;


public class checkFermat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1;
        int userNumberA;
        int userNumberB;
        int userNumberC;
        int userNumberN;


        System.out.println("Let's check Fermats theorem that says that there are no integers a, b, and c such that a^n + b^n = c^n, except when n <= 2. ");
        System.out.println("You can choose a, b, c and n integers.");

        System.out.print("a = ");
        userNumberA = input.nextInt();

        System.out.print("b = ");
        userNumberB = input.nextInt();

        System.out.print("c = ");
        userNumberC = input.nextInt();

        System.out.print("n = ");
        userNumberN = input.nextInt();

        int a = userNumberA;
        int b = userNumberB;
        int c = userNumberC;
        int n = userNumberN;

        System.out.print("a^n + b^n = ");

        System.out.println(Math.pow(a, n) + Math.pow(b, n));

        System.out.print("c^n = ");

        System.out.println(Math.pow(c, n));




    }
}
