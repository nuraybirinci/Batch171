package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
         /*
       Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

       Eger calisan kadin ise;
        60 yasindan buyukse "Emekli Olabilir "yazdirin

       Eger calisan erkek ise;
        65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
    */
// Hocanın kodları ile kendininkini kontrol eksik varmı yokmu ve bu satırı sil

        Scanner input = new Scanner (System.in);
        System.out.println("Cinsiyetinizi giriniz...");

        String gender = input.next();

        System.out.println("Yaşınızı giriniz");
        int age = input.nextInt();
        if(age<0 || age>120){
            System.out.println("Lütfen yasi 0 ile 120 arasinda giriniz");
        }else if(gender.equalsIgnoreCase("Kadin")){
            if(age>60){
                System.out.println("Emekli Olabilir");
            }else{
                System.out.println("CAlismali...");
            }
        }else if(gender.equalsIgnoreCase("Erkek")){
            if(age>65){
                System.out.println("Emekli Olabilir");
            }else{
                System.out.println("Kesinlikle cAlismali...");
            }
        }else{
            System.out.println("Tanimli degil");
        }
    }
}
