/**
 * Created by Regina on 17.11.16.
 */

import java.util.Random;
import java.util.Scanner;


public class isDivisible {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int number = random.nextInt(100) + 1;
        double userNumberN;
        double userNumberM;
        System.out.println("Palun vali täisarv n: ");
        userNumberN = input.nextInt();

        System.out.println("Palun vali täisarv m ");
        userNumberM = input.nextInt();

        System.out.println("Nüüd kontrollime, kas täisarv n jagub täisarvuga m: ");
        double n = userNumberN;
        double m = userNumberM;
        System.out.println();
        System.out.print("Vastus: ");
        System.out.println(n / m);


    }
}


