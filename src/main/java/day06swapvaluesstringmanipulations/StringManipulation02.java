package day06swapvaluesstringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {
        String s = "Learn Java earn money";

        //Ornek 1: "s" string inin "money" ile bitip bitmedigini kontrol ediniz
        boolean isEnd =s.endsWith("money");
        System.out.println(s); //true

        //Ornek2 : "s" string deki "money" keimesini "dollar"kelimesine ceviriniz
        String s1 =s.replace("money","dollar");
        System.out.println(s1);

        //Ornek3 : "s" string deki "earn" keimesini "win"kelimesine ceviriniz
        String s2 =s.replace("earn","win");
        System.out.println(s2); //Lwin Java win money

        //Ornek 4 : "s" string deki "a" harflerini "*" a ceviriniz
        String s3 =s.replace('a','*');
        System.out.println(s3); //Le*rn J*v* e*rn money

        //Ornek 5 : "s" string deki "n" harflerini "xxx" a ceviriniz

        String s4 =s.replace("n","xxx");
        System.out.println(s4); //Learxxx Java earxxx moxxxey

        //Ornek 6 : "s" string deki "e" harflerini siliniz
        String s5=s.replace("e","");
        System.out.println(s5); //Larn Java arn mony

        String t= "Ali 13 yasindadir!...";
        //Ornek 7: "t" string deki tüm rakamlari "*" ceviriniz
        //Note:bir grup datayı ifade etmek için "Regular Expressions" Regex kullaniriz
        //Note: bir grup datayı degistirmek icin replaceAll () kullanilir
        /*
                        Meshur Regex
          1)Tum rakamlar==> [0-9]
          2)Tum kucuk harfler ==> [a-z]
          3)Tum buyuk harfler ==> [A-Z]
          4)Tum kucuk be buyuk harfler ==> [a-zA-Z]
          5)Tum harfler ve rakamlar ==> [a-zA-Z0-9]
          6)Tum noktalama isaretleri ==> \\p{Punct}
          7)Tum sesli harfler ==> [aeiouAEIOU]
           Tüm x,q,w         ==> [xqw]
          8)kucuk harflerden farkli tum characterler ==>[^a-z]
          9)Tum harflerden farkli tum characterler ==> [^a-zA-Z]



         */
        String t1 =t.replaceAll("[0-9]","*");
        System.out.println(t1); //Ali ** yasindadir!...


    }
}
