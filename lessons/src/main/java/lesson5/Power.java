package lesson5;

public class Power {
    public static double pow(double n, double m) {
        double result = n;
        boolean positivePower = true;
        if (n == 0 && m == 0) {
            System.out.println("Так нельзя делать");
            return 0;
        }
        if (m == 0) {
            return 1;
        }
        if (m == 1) {
            return n;
        }
        if (m == -1) {
            return 1 / n;
        }
        if (m < -1) {
            m = m * -1;
            positivePower = false;
        }
        if (m > 1) {
            result = result * pow(n, m - 1);
        }
        if (positivePower) {
            return result;
        } else return 1 / result;

    }
}
