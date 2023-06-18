package alistirma;

import java.util.Scanner;

public class IfStatements01 {
    /*
    Sizden yaşınızı ve cinsiyetinizi girmenizi isteyen bir Java programı yazmanız istendi.
    Program, yaşınıza ve cinsiyetinize bağlı olarak farklı mesajlar gösterecek.
    Yaş 18 veya daha büyükse, cinsiyetinizi kontrol etsin ve buna göre aşağıdaki mesajları göstersin:
    Eğer cinsiyetiniz 'Erkek' ise: 'Ehliyet alabilirsiniz ve askere gidebilirsiniz.'
    Eğer cinsiyetiniz 'Kadın' ise: 'Ehliyet alabilirsiniz.'
    Eğer cinsiyetiniz diğer bir değer ise: 'Geçersiz cinsiyet bilgisi.'
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Yaşınızı giriniz...");
        int yas = input.nextInt();
        System.out.println("Cinsiyetinizi giriniz...");
        String cinsiyet = input.next();

        if(yas >= 18){
            if ( cinsiyet.equalsIgnoreCase("erkek")){
                System.out.println("Ehliyet alabilirsiniz ve askere gidebilirsiniz.");
            }else if (cinsiyet.equalsIgnoreCase("kadın")){
                System.out.println("Ehliyet alabilirsiniz.");
            }else {
                System.out.println("Geçersiz cinsiyet bilgisi.");
            }
        }else{
            System.out.println("Koşulları oluşturmak için 18 yaşını doldurmalısınız...");
        }



    }
}
