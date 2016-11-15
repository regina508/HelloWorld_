/**
 * Created by Nout on 15-Nov-16.
 */
public class PrintTable {
    public static void main(String[] args) {
            printTable(6);

    }


    public static void printRida(int n, int tulbad) {
        int i = 1;
        while (i <= tulbad) {
            System.out.printf("%4d", n * i);
            i = i + 1; }
        System.out.println();

    }

    public static void printTable(int read) {
        int i = 1;
        while (i <= read){
            printRida(i, read);
            i++;
        }

}
    public static void printRidafor(int n, int tulbad) {
        for (int i = 1; i <= tulbad; i = i + 1) {
            System.out.printf("%4d", n * i);
        }
        System.out.println();
    }

    public static void printRidaDo(int n, int tulbad){
        int i = 1;

        do{
            System.out.printf("%4d", n * i);
            i++;
        }
        while(i <= tulbad);
    }




}



