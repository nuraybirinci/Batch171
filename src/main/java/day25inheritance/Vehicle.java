package day25inheritance;

public class Vehicle {
    public Vehicle(){
        this(3000);
        System.out.println("Vehicle 1");
    }
    public Vehicle (int price){
        System.out.println("Vehicle 2");
    }
    /*
    1) Child Class tan bir object olusturdugunuzda Constructorlar en ustteki
    parent classtan baslatilarak alta dogru calisir
    2) Child Class'taki constructor dan Parent Clas'taki constructor a gidebilmek icin
    super() kullanilir
    3) Parent classta birden fazla constructor varsa istenilen constructor
    super() ifadesinin parantezi icine yazilan parametereler yardimi ile secilebilir
    4) Ayni Class icindeki constructorlari secmek icin this() kullanilir
    Ayni classta birden fazla constructor varsa istenilen constructor
    this() ifadesinin parantezi icine yazilan parametereler yardimi ile secilebilir
    5) super() ifadesini yazmak istege baglidir, yazmasanizda java sanki super() varmis
    gibi davranir. Ama kodunuzu daha okunur kılmak icin yazabilirsiniz
    6)super() ve this() ifadeleri constructor içinde her zaman ilk satırda olmalıdır
    7)Bir constructor içinde super() ve this() ifadeleri sadece bir kere kulanılabilir (Bakınız 6.)
    8)Inheritance da variable ları ve methodları çağırmak için this veya super kullanılır
    this aynı class içindeki variable veya methodları çağırmak için kullanılır
    super parent class içindeki variable veya methodları çağırmak için kullanılır


     */
}
