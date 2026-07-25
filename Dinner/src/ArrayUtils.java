import java.util.Arrays;

public class ArrayUtils {

    public static int findMax(int[] arr) {
        return Arrays.stream(arr).max().orElseThrow();
    }

    public static int findMin(int[] arr) {
        return Arrays.stream(arr).min().orElseThrow();
    }

    public static double findAverage(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }

    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

}
