package day24stringbuilder;

public class Sb03 {
    public static void main(String[] args) {
        /*
        1) StringBuilder java da String üreten diğer bir class tır.
        StringBuffer java nın string üretmek için oluşturduğu ilk class tır.

        2) StringBuffer StringBuilder a çok benzzer, yani ikiside "mutable" string üretir
        3) StringBuffer "multi-thread" (çoklu iş) dir, ama StringBuilder "multi-thread" değildir
        4) StringBuilder "multi-thread" olmadığı için StringBuffer dan daha hızlı çalışır
        5)"multi-thread" yapilirken yapilan islerin siralamasi onem arz eder,
         yapilan isleri mantikli bir siraya koymak "synchronization" olarak adlandirilir
         StringBuffer "multi-thread" oldugundan ayni zamanda "synchronized"dir

        3 tane String oluşturan class öğrendik;
            1) Immutable string lazimsa; String Class
            2) Mutable string lazimsa StringBuffer veya String Builder
                  a)StringBufferi multi thread gerekirse kullaniriz
                  b)StringBuilderi multi thread gerekmez ise kullaniriz
         */


        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);//Java

    }
}
