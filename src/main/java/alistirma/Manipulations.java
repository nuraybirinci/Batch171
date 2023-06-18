package alistirma;

import java.util.Arrays;

public class Manipulations {

    public static void main(String[] args) {

        String str= "   Nuray    Birinci   ";

        int uzunluk= str.length();
        System.out.println(uzunluk);

        char harf =str.charAt(12);
        System.out.println(harf);

        String[] str1= str.split("y");
        System.out.println(Arrays.toString(str1));

        System.out.println(str1[0]);

        String str2 = str.trim();
        System.out.println(str2);

        int str3=str2.indexOf('y');
        System.out.println(str3);



        char str5=str.charAt(str.indexOf('B'));
        System.out.println(str5);
        System.out.println(str.indexOf('B'));



        String str7=str2.replaceAll("\\s+"," ");
        System.out.println(str7);

        int str4=str7.indexOf(" ");
        System.out.println(str4);
        int str6= str7.lastIndexOf(" ");
        System.out.println(str6);




    }

}
