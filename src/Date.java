/**
 * Created by Nout on 12.11.2016.
 */
public class Date {
    public static void printEuropean(String day, int date, String month, int year ){
        System.out.print(day+" ");
        System.out.print(date+" ");
        System.out.print(month+" ");
        System.out.print(year);

    }
    public static void printAmerican(String day, String month, int date, int year){
        System.out.print(day+", ");
        System.out.print(month+" ");
        System.out.print(date+", ");
        System.out.print(year);

    }
    public static void main(String[] args){
        System.out.println("European format:");
        printEuropean("Saturday", 12, "November", 2016);
        System.out.println();
        System.out.println("American format:");
        printAmerican("Saturday", "November", 12, 2016);



    }




}
