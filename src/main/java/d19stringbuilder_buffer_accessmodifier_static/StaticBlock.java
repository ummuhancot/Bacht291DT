package d19stringbuilder_buffer_accessmodifier_static;

public class StaticBlock {


    //-----------------static blooklar herzaman önce calışır------------
    //Bir variable olusturup deger atamazsaniz o variable’i initialize etmediniz demektir
    static double pi;// global//pi tanımladım değer atamadım initialize etmedim başlatmadım demek

    static {// static block
        pi = 3.14;
        System.out.println("static block 1");
    }

    //---------------------------------
    public static void main(String[] args) {

        /*"static" blok, bir class'in yüklenmesi sırasında otomatik olarak çalışan ve class'in başlatılmasını
         veya başlangıç ayarlarını yapmayı sağlayan bir özelliktir. Statik blok, yalnızca bir kez çalıştırılır.

          Bu bloklar örneğin, veritabanı bağlantıları için kullanılır.
          Bu, uygulamanın herhangi bir bölümünde veritabanına erişim gerektiğinde bağlantının hızlı
          bir şekilde hazır olmasını sağlar.*/

        System.out.println(pi);
        System.out.println("main method ici");




    }
}
