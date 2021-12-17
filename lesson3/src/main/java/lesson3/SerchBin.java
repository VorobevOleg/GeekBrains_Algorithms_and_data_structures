package lesson3;

public class SerchBin {

    public static int binSearchX(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int base;

        if (arr.length == 0 || arr.length == 1 || arr[0] == 2) {
            return 1;
        }

        if (sumIntervalAB(1, arr.length) == sumIntervalAB(arr[start],arr[end])) {
            return arr.length + 1;
        }

        while (end >= start) {
            base = (start + end) / 2;
            if (arr[base + 1] - arr[base] == 2) {
                return arr[base] + 1;
            } else if (sumIntervalAB(arr[start],arr[base]) ==
                        sumIntervalAB(start+1,base+1))  {
                start = base + 1;
            } else {
                end = base - 1;
            }
        }

        return -1;
    }

    public static int sumIntervalAB(int a, int b) {
        return (a+b)*(b-a+1)/2;
    }

}
