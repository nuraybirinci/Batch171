package groupprojects.depoprojesi;

public class Urun {

    private int id;
    private String urunIsmi;
    private String uretici;
    private int miktar;
    private int birim;
    private int raf;

    public void id() {
        System.out.println("Ürün id giriniz...");
    }

    public void isim() {
        System.out.println("Ürün ismi giriniz...");
    }

    public void uretici() {
        System.out.println("Üretici adı giriniz.");
    }

    public void adet() {
        System.out.println("Ürün miktarı giriniz.");
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String geturunIsmi() {
        return urunIsmi;
    }

    public void seturunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public int getBirim() {
        return birim;
    }

    public void setBirim(int birim) {
        this.birim = birim;
    }

    public int getRaf() {
        return raf;
    }

    public void setRaf(int raf) {
        this.raf = raf;
    }

   /* @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim=" + birim +
                ", raf=" + raf +
                '}';
    }
*/


    @Override
    public String toString() {
        return "   id        ismi      ureticisi        " +
                "\n---------------------------------------------" +
                   id +  urunIsmi  +   uretici +
                "\n---------------------------------------------" ;



    }


}

