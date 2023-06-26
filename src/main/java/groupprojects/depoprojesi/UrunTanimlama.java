package groupprojects.depoprojesi;

public class UrunTanimlama {

    private int id;
    private String urunIsmi;
    private String uretici;
    private int miktar;
    private int birim;
    private int raf;


                  /*private void urunTanimlama() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ürün Adı: ");
        String urunAdi = scanner.nextLine();
        System.out.print("Üretici: ");
        String uretici = scanner.nextLine();
        System.out.print("Birim: ");
        String birim = scanner.nextLine();

        Urun urun = new Urun(idCounter, urunAdi, uretici, birim);
        urunler.put(idCounter, urun);

        System.out.println("Ürün tanımlandı. ID: " + idCounter);
        idCounter++;
        */


    public void urunTanimlama(String urunIsmi, String uretici, int miktar, int birim, int raf) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }


    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ürünler: " +
                "Ürün ismi: " + urunIsmi + "======================================"
                ;
    }

}

