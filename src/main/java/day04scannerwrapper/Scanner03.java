package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kdu yaziniz
        Scanner input = new Scanner(System.in);

        System.out.println("Iki sayi griniz");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(firstNumber+secondNumber);
        System.out.println(firstNumber-secondNumber);
        System.out.println(firstNumber*secondNumber);
        System.out.println(firstNumber/secondNumber);

        /* farklı yöntem öğrenciden
        Scanner input = new Scanner(System.in);
System.out.println("Lutfen İki Sayı Giriniz");
double firstNumber = input.nextDouble();
double secondNumber = input.nextDouble();

System.out.println("Topla = " + firstNumber+secondNumber);
System.out.println("Çıkar = " + (firstNumber-secondNumber));
System.out.println("Çarp = " + firstNumber*secondNumber);
System.out.println("Böl = " + firstNumber/secondNumber);
         */

    }
}
