package day24stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1); //Java is easy
        sb1.reverse();
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);//Verilen index teki karakteri siler.
        System.out.println(sb1);// ysae s avaJ , 6. indexteki i harfini sildi

        sb1.delete(4,7);//başlangıç indexi dahil bitiş indexine kadar (hariç) olan karakterleri siler.
        System.out.println(sb1);//ysaeavaJ


        sb1.replace(2,5,"OOO");//sb1.replace(2,5,"O"); methodu 2 dahil 5 hariç yani index 2,3,4 deki karakterlerin yerine "O" koyar.
        System.out.println(sb1);//ysOOOvaJ

        sb1.insert(3,"XXX");
        System.out.println(sb1);//ysOXXXOOvaJ


        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Kava");

        //sonuc 0 ise alfabetik olarak aynı sıradalar demektir
        //sonuc -1 ise sb2 sb3 ten alfabetik olarak bir önde demektir
        //sonuc 1 ise sb2 sb3 ten alfabetik olarak bir sonda demektir

        int r1 = sb2.compareTo(sb3);
        System.out.println(r1);

        //StringBuilder nasıl string e çevirilir?
        String str = sb2.toString().toUpperCase();
        System.out.println(str);//JAVA

        //String nasıl StringBuilder  çevirilir?
        StringBuilder newSb2 = new StringBuilder(str);
        System.out.println(newSb2);


    }
}
