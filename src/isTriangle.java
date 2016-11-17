/**
 * Created by Regina on 17.11.16.
 */
import java.util.Random;
import java.util.Scanner;

public class isTriangle {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int number = random.nextInt(100) + 1;
        int userNumberA;
        int userNumberB;
        int userNumberC;



        System.out.println("You can choose three sticks A, B and C. Let's check is it possible to arrange them into a triangle or not.");
        System.out.println("First of all please choose length of stick A (let's use integers):");
        userNumberA = input.nextInt();

        System.out.println("Now choose length of stick B: ");
        userNumberB = input.nextInt();

        System.out.println("Stick C will be: ");
        userNumberC = input.nextInt();

       int a = userNumberA;
       int b = userNumberB;
       int c = userNumberC;

        if (istriangle(a, b, c)){
            System.out.println("Congratulations! :) You can make a triangle from sticks with this lengths! ");
        } else {
            System.out.println("Ups! You can't form a triangle from sticks with given lengths!");
        }
        

    }

    public static boolean istriangle(int a, int b, int c){
        if (a > b + c) {
            return false;
        } if (b > a + c) {
            return false;
        } if (c > a + b) {
            return false;
        } else {

            return true;
        }

    }



}
