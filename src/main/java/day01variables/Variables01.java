package day01variables; //içinde bulunan package ismi

public class Variables01 {

    public static void main(String[] args) {
        //java bu satiri okumaz, kendimize ve başkalarına aciklamadir.
        /*
        java bu satirlarida okumaz
         */

        //Variable nasil olusturulur?
        //Data Type  +  Variable name  +  Atama Operator (assignment operatoru) + Variable degeri  + noktali virgul
          int             age                     =                                    13                   ;

          //java cumlesi   =>  statement
        //Dilbilgisindeki nokta ne ise javadaki ";" ayni seydir, yani statement in bittigini gosterir
        //Eger variable declaration yapar, assignment yapmazsaniz java kendi default degerlerini koyar
        //Default deger sayilar icin sifirdir
        //Java da "=" assignment operator ve java bu operatoru gordugu zaman once sag tarafi calistirir
        //ve sagdaki degeri alir soldaki kutuya koyar
        //Java da esittir demek ==>  "=="       Matematikte  "=" ,  Java da "=="
        //Data type + VariableName ==> Variable declaration
        //Assignment operator (=) + Variable degeri ==> Assignment

        /*
        java da temelde iki tip data vardir;

        1)primitive data type: (ilkel)
        char, boolean, byte, short, int, long, float, double

        2)non-primitive data type: (ilkel olmayan )
        string

         */
        //Ornek 1:  ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        String ogrenciAdi = "Ali Can" ;

        //String'lere verilen degerler daima cift tirnak icinde olmalidir
        //String ler icin default value (===> varsayilan deger) "null" dir
       /*
        *String variable olusturdugumuzda cogu zaman ona bir deger atariz. Atama yapmazsak java o variable icin varsayilan deger olarak null koyar
        * null demek 0 demek degidir, 0 da coding te bir degerdir, null ise hiclik demektir.
        * null demek icinde variable veya method bulunmayan bos bir objedir
        * {} ===> eleman yok   {0} ===> elemani sifir
        */

        //char data type;
        //Tek karakterler icin kullanilir. Sayi, sembol yada harf farketmez
        //Ornegin ===> A, x, 4, ?
        //Ornek 2: char data type inda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        char isminILKHarfi= 'A' ;

        //Note : char data type inda degerler tek tirnak icine konulmalidir

        //boolean data type:
        //boolean 'lar sadece iki farkli deger alabilir; true (dogru) veya false (yanlis)
        //isimlendirme yapilirken basina is konulur
        //ornek 3 : boolean data type inda emeklimisin sorusu icin bir variable olusturun ve false degerini atayin
        boolean isRetired = false;


        //byte data type:
        //tam sayilar icindir hafizada 1 byte yer kaplar
        //byte: -128 den +127 e (dahil) tamsayi degerleri icin kullanilir
        //ornek 4 : byte data type inda ogrenci yasi icin bir variable olusturun ve deger atayin
        byte ogrenciYasi = 127;

        //short data type:
        //tam sayilar icindir hafizada 2 byte yer kaplar
        //short: -32768 den +32767 e (dahil) tamsayi degerleri icin kullanilir
        //Ornek 5: site nüfusu icin bir variable olusturun ve deger atayiniz
        short siteNufusu =647;

        //int data type:
        //tam sayilar icindir hafizada 4 byte yer kaplar
        //int: -2,147,483,648 den +2,147,483,647 e (dahil) tamsayi degerleri icin kullanilir
        //ornek 6: ulke nufuslari icin bir variable olusturun ve deger atamasi yapiniz
        int ulkeNufusu = 71367168;

        //long data type:
        //tam sayilar icindir hafizada 8 byte yer kaplar
        //long : -9,223,372,036,854,775,808 den +9,223,372,036,854,775,807 e (dahil) tamsayi degerleri icin kullanilir
        //ornek 7 : insan vucudundaki hucre sayisi icin vaiable olusturup deger atamasi yapiniz
        long cellNumberInHumanBody = 35345454545453453L;
        //Note: bir deger long ise sonuna "(buyuk) L " (tavsiye edilir) yada "(kucuk) l " konulur.

        //eger long a atadiginiz deger int'lerin araliginda ise sonuna "L" koymaya gerek   yok
        //long dememize ragmen sonuna L koymazsak eger int araliginda ise java onu int kabul eder
        long weightOfSun = 123456645;


        //float data type:
        //(Decimal Numbers==>ondalikli sayilar) icin kullanilir.(fiyatlandirmalar => 12.99 )

        //Ornek 8: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturunuz
        float shirtPrice = 12.99f;
        float shoesPrice = 15.99f;

        //Note :Java ondalikli sayilari otomatik olarak double kabul eder
        //float olmasina israr ediyorsaniz sonuna "F" veya "f" koymalisiniz
        //4 byte yer kaplar

        //double data type :
        //double memory de 8 byte yer kaplar, ondalikli kisim icin daha fazla rakam alir
        //ondalikli sayilar icin kullanilir

        //Ornek 9: Hucre agirligi ve Amip'in agirligi icin bir varibale olusturunuz

        double weigthCell = 0.0000000000000000000000113;
        double weigthAmip = 0.0000000000000000000000015;

        //Ornek 10: Ogrenci notlari icin iki adet variable olusturunuz ve toplamlarini ekrana yazidiniz

        //-----------ekrana yazdirmak icin------------
        System.out.print(5);//ekrana yazdirmak icindir ve pointer i ayni satirda tutar
        System.out.println(15);//ekrana yazdirir ve pointer i bir sonraki satira koyar
         //-------------------------------------------

        byte note1= 55;
        byte note2 =33;
        System.out.println(note1+note2);

        //homework
        /*
        1) 3 farkli data turunde variable olusturun ve bunlari farkli satirlarda yazdirin
        2) ulke ve sehir isimleri icin iki variable olusturun ve bunlari yazdirin
        3) iki tamsayi turunde variable olusturup toplamini yazdirin.
         */





    }
}

