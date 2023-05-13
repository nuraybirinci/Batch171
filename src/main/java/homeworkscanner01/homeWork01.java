package homeworkscanner01;

import java.util.Scanner;

public class homeWork01 {
    public static void main(String[] args) {
        //odev olarak bunu yap;
        //kullanicidan yaricap isteyelim ve cemberin cevresi  ve dairenin alanin hesaplayalim
//cemberin cevresi = 2*pi*r
//dairenin alani   = pi*r*r
        Scanner scam =new Scanner(System.in);

        System.out.println("lutfen cemberin yaricapini giriniz");
        double pi = 3.14;
        double r = scam.nextDouble();

        System.out.println("cemberin cevresi = " + (2*pi*r));
        System.out.println("cemberin alani = " + pi*r*r);
    }
}
