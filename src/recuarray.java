public class recuarray {
    public static int findmin(int[] array, int n) {
        if (n == array.length - 1) {
            return array[n];
        }
        int min = findmin(array, n + 1);
        /*if (array[n] < min) {
            return array[n];
        }*/
        min = Math.min(array[n], min);
        return min;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int min = findmin(array, 0);
        System.out.println(min);

    }
}