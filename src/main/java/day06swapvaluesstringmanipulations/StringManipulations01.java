package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        //String bir non-primitive data type dir ve ayni zamanda bir classdir
        String s = "Java is easy";

        //Ornek 1: "s" String deki tum characterleri buyuk harf yapiniz

        String sUpper = s.toUpperCase();

        System.out.println(sUpper);//JAVA İS EASY

        //Ornek 2: "s" String deki tum characterleri kucuk harf yapiniz

        String sLower =s.toLowerCase();

        System.out.println(sLower);//java is easy

        //Ornek 3: "s" String deki ilk characteri aliniz
        char firstChar = s.charAt(0);
        System.out.println(firstChar); //J

        //Ornek 4: "s" String deki baştan ikinci ve sondan ikinci characteri aliniz

        char secondChar =s.charAt(1);
        System.out.println(secondChar);

        char secondLastChar =s.charAt(10);
        System.out.println(secondLastChar);
       // System.out.println(""+secondChar+secondLastChar); as (bu başka bir yol)

        //Ornek5: "s" String de kullanilan character sayisini bulunuz

        int sLength = s.length();

        System.out.println(sLength); //12

        //Ornek 6: "s" String deki ilk 4 characteri aliniz
        //s.substring(0,4) ==> bu kullanimda ilk index dahildir, ikinci index harictir

         String sub1 =s.substring(0,4);
        System.out.println(sub1); //Java

        //Ornek 7: "s" String deki "is" kelimesini aliniz
        String sub2= s.substring(5,7);
        System.out.println(sub2); //is

        /*String is= s.substring(5,7);
        System.out.println("is = " + is); (başka bi yol)

         */
        //Ornek 8: "s" String deki "easy" kelimesini aliniz

        String sub3 = s.substring(8,12);
        System.out.println(sub3); //easy

        //ikinici yol
        String sub4 = s.substring(8); //tek parametreli olan
        System.out.println(sub4); //easy

        //Ornek 9: "s" String de "money" kelimesinin var olup olmadıgını kontrol ediniz

        boolean isExist = s.contains("money");
        System.out.println(isExist); //false

        //Ornek 10: "s" Stringinin belli bir harf yada harflerle başlayıp başlamadıgını kontrol ediniz

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart); //true

        //Ornek 11: "s" Stringinin 5. index dahil olmak üzere bu indexten itibaren "i" karakteri ile baslayip baslamadigini kontrol eden kodu yaziniz
        boolean index=s.startsWith("i",5);
        System.out.println(index);

        //Ornek 11: "s" Stringinin 2. index dahil olmak üzere bu indexten itibaren "v" karakteri ile baslayip baslamadigini kontrol eden kodu yaziniz
        boolean index2 = s.startsWith("v",2);
        System.out.println(index2); //true

    }
}
