package day16arraysforeachloop;

import java.util.Arrays;

public class Tekrar01 {
    public static void main(String[] args) {

        //Ornekk 1
        String telephoneNumber[] = new String[3];

        telephoneNumber[0] = "07773642";
        telephoneNumber[1] = "07842355";
        telephoneNumber[2] = "07224234";
        System.out.println(Arrays.toString(telephoneNumber)); //(Arrays.toString(telephoneNumber)) uzantısını array in kendisini görmek için koyuyoruz

        //Ornekk 2
        String ogrenciAdi[] = new String[4];
        ogrenciAdi[0] = "Ali Can";
        ogrenciAdi[1] = "Veli Can";
        ogrenciAdi[2] = "Safinaz Reis";
        ogrenciAdi[3] = "Temel Reis";
        System.out.println(ogrenciAdi);// bu şekilde yazdırdığımızda sadece referansını görürüz kendisini görmek için "(Arrays.toString(ogrenciAdi))" yazmak gerekir

        //Ornek 3
        String geometricObjects[] = new String[5];

        geometricObjects[0] = "cube";        //küp
        geometricObjects[1] = "square";      //kare
        geometricObjects[2] = "triangle";    //üçgen
        geometricObjects[3] = "rectangle";   //dikdörtgen
        geometricObjects[4] = "cylinder";    //silindir
        System.out.println(Arrays.toString(geometricObjects)); //köşeli parantezde yazdırır
        //System.out.println(geometricObjects[]); alt alta yazdırır

        //Ornek 4
        String myFamily[] = new String[3];

        myFamily[0] = "cousin";
        myFamily[1] = "brother";
        myFamily[2] = "sister";
        System.out.println(myFamily[0]);
        System.out.println(myFamily[2]);

        //sonuna "#" ekleyin


        for (int i = 0; i < myFamily.length; i++) {
            System.out.println(myFamily[i] + "#");
        }

        // sonuna "'" ekleyin
        for (int i = 0; i <geometricObjects.length ; i++) {
            System.out.println(geometricObjects[i]+"'");
        }

    }
}
