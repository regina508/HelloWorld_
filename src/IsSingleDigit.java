/**
 * Created by Nout on 15-Nov-16.
 */

import java.util.Random;
import java.util.Scanner;

public class IsSingleDigit {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int number = random.nextInt(100) + 1;
        int userNumber;
        System.out.println("Please type a number: ");
        userNumber = input.nextInt();

        if (isSingleDigit(userNumber)) {
            System.out.println("On ühekohaline arv");
        } else {
            System.out.println("On mitmekohaline arv");
            System.out.println(isSingleDigit(2));
            boolean bigFlag = !isSingleDigit(17);

        }

    }

    public static boolean isSingleDigit(int x) {
        if (x > -10 && x < 10) {
            return true;
        } else { return false; } }




}



