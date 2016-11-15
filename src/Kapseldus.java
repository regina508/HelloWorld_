/**
 * Created by Nout on 15-Nov-16.
 */
public class Kapseldus {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 7) {
            printRow(i);
            i = i + 1;
        }


    }


    public static void printRow(int n) {
        int i = 1;
        while (i <= 7) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }

    public static void printTable(int rows) {
        int i = 1; while (i <= rows) {
            printRow(i); i = i + 1; }
    }

}

