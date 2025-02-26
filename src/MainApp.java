
public class MainApp {
    public static void main(String[] args){
        int[] a = new int[10];
//1.        ArrayApp.addvals(a);
//        ArrayApp.array_one(a);
//2.        ArrayApp.assignvals(a);//// public static kullanmamızın amacı sınıf çağırabilmek için
//        ArrayApp.array_one(a);  // diziyi yazdırma işlemi hazır al kullan
        // method overloading
        int[] c =ArrayApp.assignvals();
        ArrayApp.array_one(c);


    }
}
