package groupprojects.depoprojesi;

public class Runner {
    public static void main(String[] args) {

        Urun urun = new Urun();
        urun.setRaf(0);
        urun.setMiktar(0);
        urun.setId(12345678);
        urun.setUretici("Hekimoğlu");
        urun.setBirim(0);
        urun.seturunIsmi("Un");
        System.out.println(urun.toString());
    }


}

