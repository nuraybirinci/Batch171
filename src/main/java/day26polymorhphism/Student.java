package day26polymorhphism;

public class Student {
    //Encapsulation ==> kapsulleme
    /*
    Encapsulation nedir? Data Hiding (veri saklama)
    Data nasil saklanir ?
    Access modifierlarini private yaparak datayi diger classlardan gorunmez hale getiririm.
    Boylece datayi saklarim
    Encapsulation yaptigimiz datayi istersek diger classlardan okuyabiliriz
    Nasil okuruz?
    getmethod olusturarak encapsulate edilmis datanin degerini okuyabiliriz
    1)get methodlar public olur
    2)get methodun return type i okudugu variable in return type i ile ayni olur
    3)get method bir boolean variable icin olusturulduysa ismi is ile baslar
    ornek=>isSuccessful()

     */
    private String stdId ="AC202306014";
    public  String stdName="Ali Can";
    public int age =13;
    private double notOrt=3.13;
    private boolean successful=false;

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccessful() {
        return successful;
    }
    /*
    Encapsulation yaptığımız datayı istersek diğer classlardan nasıl değiştirebiliriz?
    "set method" oluşturarak Encapsulate edilmiş datanın değerini değiştirebiliriz
    1) set methodlar hep public olur
    2) set methodların return type ı hep void olur
    3) set methodlar parametre kullanır, parametrenin data typei variable ile aynı olur

    NOT 1: Set method kullanarak varolan object üzerinde değişiklikler yaparak o object i sanki yeni bir object miş gibi kullanabiliriz

    NOT 2: get methodların diğer adı getter, set methodların diğer adı setter dır
           getter ve setter ların ikisine birden (ortak ismi) "Java Beans" denir.
     */

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
