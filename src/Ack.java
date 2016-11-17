/**
 * Created by Regina on 17.11.16.
 */
public class Ack {
    public static void main(String[] args){
        System.out.println(a(1,2));


    }

    public static int a (int m, int n){
        if (m < 0 && n < 0 ) {
            throw new IllegalArgumentException("Numbrid PEAVAD olema positiivsed!");
        } else if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return a(m - 1, 1);
            // alati kui (m>0 && n > 0)

        } else if (m > 0 && n > 0) {
            return a(m-1, a(m, n-1));
        }


        return m;

    }
}
