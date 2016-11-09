/**
 * Created by Nout on 09.11.2016.
 */

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double cels;
        double fah;
        System.out.print("Convert Celsius to Fahrenheit ");
        try {
            cels = input.nextDouble();
            fah = cels * (9.0 / 5.0) + 32;
            System.out.println(cels + " Celsius is " + fah + " Fahrenheit");
        } catch (Exception err){
            System.out.print(err);






        }

    }
}
