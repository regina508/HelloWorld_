/**
 * Created by Nout on 10.11.2016.
 */

import java.util.Scanner;

public class Seconds {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int seconds, minutes, hours;
        System.out.print("Please enter how much seconds you want to convert: ");
        seconds = input.nextInt();
        System.out.printf("You entered %d seconds", seconds);
        System.out.printf("\nConverted it is: \n");
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;
        System.out.printf("%d hours, %d minutes, %d seconds,", hours, minutes, seconds);


    }
}
