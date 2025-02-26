public class ciftsayi {
    public static int coupsum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return n + coupsum(n - 2);
        } else {
            return coupsum(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        int sum = coupsum(n);
        System.out.println(sum);


    }
}