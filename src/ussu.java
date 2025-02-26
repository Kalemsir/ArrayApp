public class ussu {
    public static int ussu(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * ussu(x, y - 1);
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int sum = ussu(x, y);
        System.out.println(x + " üzeri " + y + " = " + sum);

    }
}