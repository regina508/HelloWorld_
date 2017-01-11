/**
 * Created by Regina on 11.1.17.
 */

import java.util.Arrays;
import java.util.Random;

public class PrintArray {
    public static void main(String[] args) {
        int[] counts;
        double[] values;
        int size = 7;
        counts = new int[4];
        values = new double[size];
        counts[0] = 7; counts[1] = counts[0] * 2; counts[2]++; counts[3] -= 60;


        System.out.println("The zeroth element is " + counts[0]);
        System.out.println("The first element is " + counts[1]);
        System.out.println("The second element is " + counts[2]);
        System.out.println("The third element is " + counts[3]);


        for (int i = 0; i < 4; i++) {
            System.out.println(counts[i]); }

        int[] a = {1, 2, 3, 4};
        System.out.println(a);

        printArray(a);

        System.out.println(Arrays.toString(a));

        int numValues = 8;
        int[] array = randomArray(numValues);
        printArray(array);






    }
    public static void printArray(int[] a) {
        System.out.print("{" + a[0]); for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]); }
        System.out.println("}");
    return;}

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) { a[i] = random.nextInt(100); }
        return a; }

    

    }
