/**
 * Created by Regina on 17.11.16.
 */
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;


public class Multadd {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int number = random.nextInt(100) + 1;
        double numberA = 1.0;
        double numberB = 2.0;
        double numberC = 3.0;
        double numberD = 4.0;

        double a = numberA;
        double b = numberB;
        double c = numberC;
        double d = numberD;

        System.out.println("Let's test multadd with invoking it with a few simple parameters, like a = 1.0, b = 2.0, c = 3.0. ");
        System.out.print("a * b + c = ");
        System.out.println(a * b + c);


        double pi;
        pi = 3.14159;

        int x;


        System.out.print("sin(pi/4)  + (cos(pi/4))/2 = ");

        System.out.println(sin(pi/d) + ((cos(pi/d))/b));

        System.out.print("log 10 + log 20 = ");

        System.out.println(log10(10) + log10(20));



        double userNumberX;

        System.out.println("Choose x:");
        userNumberX = input.nextInt();

        System.out.println("x*e^(-x) + sqrt(1-e^(-x)) = ");



    }


}
