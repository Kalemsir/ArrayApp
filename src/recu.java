public class recu {
    public static int yazdir(int n) {
        System.out.println(n+" ");
        if(n==0){
            return 0;
        }
        return yazdir(n-1);
    }
    public static void main(String[] args) {
        yazdir(5);
    }
}