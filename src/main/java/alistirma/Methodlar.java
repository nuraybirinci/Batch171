package alistirma;

public class Methodlar {
    public static void main(String[] args) {
        int sayi1 = 5;
        int sayi2 = 8;
        int sayi3 = toplama2(sayi1,sayi2);
        System.out.println(sayi3);


    }
    public static void toplama(int a, int b){
        int toplam = a+b;
        System.out.println(toplam);

    }
    public static int toplama2(int a, int b){
        int toplam = a+b;
      return toplam;

    }



}
