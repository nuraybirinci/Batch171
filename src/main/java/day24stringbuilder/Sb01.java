package day24stringbuilder;

public class Sb01 {
    public static void main(String[] args) {
        /*
    1)StringBuilder classı da string ureten bir classtır
    2)String class kullanarak string üretiriz java niçin StringBuilder classı da oluşturdu?
    String class "immutable" (değiştirilemez) string uretir
    StringBuilder "mutable" (değiştirilebilir) string uretir
    3)"immutable" olmak demek orjinal değerin korunması, değiştirilemez olması demektir
      "mutable" olmak demek orjinal değerin değiştirilebilir olması demektir
     */

        //Immutable
        String s= "java";
        String t =s+"!";
        String w =t+"?";

        //String i değiştirdikten sonra aynı String e assign ederseniz , Java yine yeni bir container oluşturur
        //Değişmiş değeri bu yeni container in içine koyar ve eski container i gösteren pointer yeni container a yönlendirilir
        //Dolayıısyla eski container adressiz kalır ve garbage colector adressiz olan container ları siler.
        String a="Money";
        a=a + "More";


        //Mutable
        //StringBuilder kullanarak string üretmenin 1. yolu:

        StringBuilder sb1 = new StringBuilder("Python");

        System.out.println(sb1);//Python
        sb1.append("!");
        System.out.println(sb1);//Python!

        //StringBuilder kullanarak string üretmenin 2. yolu:
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        sb2.append("XXXXXXXXXXXXXXX");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34

        //capacity() ve length arasındaki fark nedir?
         /*
            capacity() java nin size verdigi data depolama yer sayisidir
            length() ise size verilen data depolama yerinin kullanilan kismidir

            Java baslangic olarak size capacity i 16 olarak verir.
            siz verilen capacity'i asarsaniz java yeni capacity'i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir
            16==> 16*2+2  - 34==> 34*2+2
         */

        //Defualt capacity i nasil degistirebiliriz?
        StringBuilder sb3= new StringBuilder(3);
        sb3.append("ali");
        System.out.println(sb3.capacity());//3
        System.out.println(sb3.length());//3

    }
}
