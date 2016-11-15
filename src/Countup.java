/**
 * Created by Nout on 15-Nov-16.
 */
import java.util.Scanner;

public class Countup {
    public static void countup(int n) {
        if (n == 0) { System.out.println("Blastoff!");
        } else {
            countup(n - 1); System.out.println(n); }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        countup(3);
        System.out.println("Have a nice day.");


    }




}
