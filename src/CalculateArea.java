/**
 * Created by Nout on 15-Nov-16.
 */


public class CalculateArea {
    public static void main(String[] args) {
        double a = calculateArea(1.8, 2.8, 4.8, 6.8);
        System.out.print("Area is " + 4);

    }

        public static double calculateArea (double xc, double yc, double xp, double yp){
            return calculateArea(distance(xc, yc, xp, yp));

        }

        public static double calculateArea(double radius) {
            double result = Math.PI * radius * radius; return result;
        }

        public static double distance (double x1, double y1, double x2, double y2) {
            double dx = x2 - x1;
            double dy = y2 - y1;
            System.out.println("dx is " + dx);
            System.out.println("dy is " + dy);
            return 0.0;

        }



    }
