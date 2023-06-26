package day31mapsexceptions;

public class E01 {
    /*
    unun nereden kaynaklandigini ve sebebinin verir

    Java Exception firlattiginda kodun calismasini durdurur (stops execution)
    Java Exception olusturan kod icin bizden karar vermemizi ister
     */
    public static void main(String[] args) {

       int a = 12;
       int b = 0;
       divide(a,b);

    }

    public static void divide(int a, int b){
        System.out.println(a / b);
    }

}
