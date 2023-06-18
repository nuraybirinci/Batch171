package alistirma;

import java.util.Scanner;

public class IfStatement02 {
   /*
    Bir restoranın menüsündeki yemeklerin fiyatlarını kontrol eden bir Java programı yazmanız istendi.
    Program, kullanıcıdan yemek adını ve miktarını girmesini isteyecek.
    Ardından, seçilen yemeğin fiyatını kontrol edecek ve toplam tutarı hesaplayacaktır.

    Programı çalıştırıp kullanıcıdan bir yemek adı ve miktarı girmesini istesin.
    Ardından, seçilen yemeğin fiyatını kontrol edip miktarıyla çarpsın ve toplam tutarı ekrana göstersin.
    Menüde olmayan bir yemek seçilirse, kullanıcıya 'Geçersiz yemek seçimi' mesajını göstermesi gerekmektedir.
    */
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

       System.out.println("Yemek Menüsü");
       System.out.println("1: çorba = 15 Tl");
       System.out.println("2: pilaki = 18 Tl");
       System.out.println("3: Fasulye yemeği= 30 Tl");
       System.out.println("4: Sac tava = 50 Tl ");
       System.out.println("Seçiminizi Yapınız...");
       int secim=input.nextInt();
       System.out.println("Miktarını giriniz...");
       int miktar= input.nextInt();

       int toplam = 0;

       if(secim==1){
           toplam=15* miktar;
       } else if (secim==2) {
           toplam = 18*miktar;
       } else if (secim==3) {
           toplam=30*miktar;
       } else if (secim==4) {
           toplam=50*miktar;
       }else {
           System.out.println("Geçersiz yemek seçimi...");
       }
       System.out.println("toplam tutar: "+ toplam + " Tl");


   }


}
