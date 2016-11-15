/**
 * Created by Nout on 15-Nov-16.
 */
public class Countdown {
    public static void countdown(int n) {
        System.out.println("Let's make countdown from 10 to 1: ");
        while (n > 0) {

            System.out.println(n); n = n - 1;
        }
        System.out.println("Blastoff!");
    }

    public static void main (String[] args){
        countdown(10);




    }

}
