package lesson3;

public class SerchBin {

    public static int binSearchX(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int base;
        int i = 0;


        while (end >= start) {
            i++;
            base = (start + end) / 2;

            if (arr[base + 1] - arr[base] == 2) {
                System.out.println("Кол-во итераций: " + i);
                return arr[base] + 1;
            } else if (((arr[start] + arr[base]) * (arr[base] - arr[start] + 1) / 2) ==
                        ((start + 1 + base + 1) * (base + 1 - (start + 1) + 1) / 2))  {
                start = base + 1;
            } else {
                end = base - 1;
            }
        }

        System.out.println("Кол-во итераций: " + i);
        return -1;
    }

}
