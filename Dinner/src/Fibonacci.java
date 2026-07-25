public class Fibonacci {

    public static int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void printSeries(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(fib(i) + (i < count - 1 ? ", " : "\n"));
        }
    }

}
