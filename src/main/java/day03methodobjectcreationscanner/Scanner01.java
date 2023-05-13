package day03methodobjectcreationscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //1. adim: Scanner Class dan obje olustur
        Scanner input = new Scanner(System.in);

        //2. adim: kullaniciya ne istediğinize dair mesaj veriniz
        System.out.println("Lutfen yasinizi giriniz");

        //3. adim: Uygun methodu kullanarak kullanicinin verdigi datayi memory e yerlestiriniz
        byte age = input.nextByte();
        System.out.println("age = "+age);



    }

}
