package day02datatypesmethodcreation;

public class DersTekrarMethodCreation01 {
    public static void main(String[] args) {

        System.out.println(ilkIkisiniCarpUcuncuyuTopla(5,2,6)); // Ornek 3 3 sayidan ilk ikisini carpan ve ucuncu sayi ile sonucu toplayan  ==> sonuc :16

        System.out.println(dikdortgeninAlani(59,23));  // Ornek 1 Dikdortgenin alani  ==> sonuc :1357

        System.out.println(dikdortgeninCevresi(48, 18));  // Ornek 2 dikdörtgenin çevresi  ==> sonuc :132

        System.out.println(ucgeninCevresi(26,35,29)); // Ornek 3 üçgenin çevresi ==> sonuc: 90


    }
    //Ornek 3 verilen 3 sayidan ilk ikisini carpan ve ucuncu sayi ile sonucu toplayan methodu olusturun ve kullanin (methodcreation01 sayfasından tekrar ettim)
    public static int ilkIkisiniCarpUcuncuyuTopla(int a, int b, int c) {
        return a * b + c;
    }

    // Homework;
    //1) Dikdortgenin alanini hesaplayan methodu olusturun ve kullanin

    public static int dikdortgeninAlani (int a, int b){
        return a*b;
    }


    //2) Dikdortgenin cevresini hesaplayan methodu olusturun ve kullaniniz

    protected static long dikdortgeninCevresi (long x,long y){
        return 2*(x+y);
    }

    // 3) Üçgenin çevresini hesaplayan methodu olusturun ve kullaniniz (kendi hazırladığım soru)

    public static int ucgeninCevresi (int x, int y, int z){
        return x+y+z;
    }


}
