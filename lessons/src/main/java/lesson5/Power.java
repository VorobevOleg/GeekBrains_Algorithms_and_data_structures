package lesson5;

public class Power {
    public static float pow(int n, int m) {
        float result = n;
        boolean check = false;
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
        if (m > 1) {
            result = result * pow(n, m - 1);
            check = true;
        }
        if (m < -1) {
            result = 1 / (result * pow(n, m + 1));
        }
        if (check) {
            return result;
        } else return 1 / result;

    }
}
