import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ArrayApp {
    //arrayle ilgili işlemlerin yapıldığı class
    public static void array_one(int[] array) {      //array yazdırma
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "inci eleman " + array[i]);
        }

    }

    public static void addvals(int[] array) {    //random sayı
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(51); //0-50 arası rastgele
        }
    }

    public static void assignvals(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " sayıyı giriniz ");
            array[i] = input.nextInt();
            System.out.println();

        }
    }

    public static int[] assignvals() {

        Scanner input = new Scanner(System.in);
        System.out.println("boyutunu girin");
        int length = input.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " sayıyı giriniz ");
            array[i] = input.nextInt();
            System.out.println();
        }
        return array;
    }
}
