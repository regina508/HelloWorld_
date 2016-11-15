/**
 * Created by Nout on 15-Nov-16.
 */


import java.util.Scanner;
import java.util.Random;


public class Factorial {
    public static void main(String[] args){
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int number = random.nextInt(100) + 1;
        int userNumber;

        System.out.print("Please choose n: ");
        userNumber = input.nextInt();
        System.out.print("n! = ");
        System.out.print(factorial(userNumber));

    }


    public static int factorial(int n) {
        if (n == 0) { return 1;
        } int recurse = factorial(n - 1);
        int result = n * recurse;
        return result; }




}
