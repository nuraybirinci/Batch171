package day03methodobjectcreationscanner;

public class DersTekrarMethodCreation01 {

    /*
    Homework
    1) Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    2) Dairenin alanini hesaplayan methodu olusturun ve kullaniniz
     */

    public static void main(String[] args) {

        System.out.println(cemberCevre(47)); // Homework 1 sonuc: 295.16
        System.out.println(daireAlan(7));  // Homework 2 sonuc: 153.86

    }

    //Ornek 1 : Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    // Cemberin cevresini hesaplama:  Çevre = 2 * pi sayısı (3,14) *r

    public static double cemberCevre(double r) {
        return (2 * 3.14 * r);
    }

    //Ornek 2: Dairenin alanini hesaplayan methodu olusturun ve kullaniniz
    // Daire Alan hesaplama : Alan = pi sayısı (3,14) * r * r

    public static double daireAlan(double r) {
        return (3.14 * r * r);
    }

    }


