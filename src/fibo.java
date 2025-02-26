public class fibo {
    public static void printFibonacciTree(int n, String indent) {
        if (n < 0) {
            return;
        }
        System.out.println(indent + "n=" + n + " -> " + fibonacci(n));
        if (n > 1) {
            printFibonacciTree(n - 1, indent + "  ");
            printFibonacciTree(n - 2, indent + "  ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        printFibonacciTree(5, "");
    }
}