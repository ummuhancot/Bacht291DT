package d27exceptions;

public class E01 {
    public static void main(String[] args) {

        /*Exception: Kod çalıştırıldığında akışı bozan hatalardır. "Beklenmedik sorunlar" demektir.
        Her exception, hata mesajını ve hata türüne ait bilgiyi içinde bulundurur.

        1- exception (İstisnalar), normal kod yürütme akışını bozan hatalardir.

        2- exception bir classtir. Methodlari vardir. Kendi icinde hata kodlari, bilgi mesajlari vardir.
        Ornegin; Bir classtaki bir method cagirildigi zaman kod calismaya baslar. Bu andan itibaren kodlar satir satir
        okunmaya baslar. Ve kodlarda bir hata varsa, exception durumu olusur.

        Tabi bu hatalari developer onceden ongorup handler etmeli, duzeltmelidir ama kullanici programimizi
        kullanirken ongorulmeyen durumlar her zaman olusabilir. Bir hata olustugunda neden kaynaklandigini
        ogrenip cozmek, o an cozulemiyorsa da sistemin durmayip calismasinin devam etmesi icin alternatif
        cozumler uretmek gerekiyor

        3- Bir exception oluştuğunda, kod yürütme durur. Exception'lar, hata ayıklama günlüklerinde(log) oturum açar.*/

        /*
        4- Exception Handling, Java'da, akışı kesintiye uğratmadan kodumuzdaki istenmeyen istisnaları
        veya sorunları işlememize olanak tanıyan bir yöntemdir

        5- Exception denince akliniza 3 seyin gelmesi lazim.
        try--matematik işlemlelri--dönüşüm işlemleri--index de çarma yaptımız kodlarda olmayan index i çağırma
        catch
        finally (optional).

        --try--kullanıcının bizi zorlayacak yerleri yakaladığımız yer
        6- Kod başarılı bir şekilde çalışmadığında bile, kullanıcı deneyiminin sorunsuz olmasını sağlamak için,
        tüm yürütmeleri bir try catch ifadesine sarmak programlama dünyasında en iyi uygulama olarak kabul edilir.
        Ancak, tüm kodları körü körüne try-catch blokları içine almak her zaman en iyi pratik değildir.
        Bu, hataları maskeleyebilir ve programın gerçek hataları gizlemesine yol açabilir.

        https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html
         */

        //1) ArithmeticException : Matematik kurallarinda herhangi bir hata yaparsaniz bu exception’i alirsiniz
        //dvision(6, 3);//2
        //dvision(5, 0);//AritmeticExceqtion verir /by zero
        //bu hatayı iflerle düzelticez
        //dvision(5, 0);//Lütfen 0 girmeyiniz
        //1-a
        //division2(7, 0);//Lütfen sifira bölme işlemi yapmayınız
        //division2(8, 4);
        division3(7, 0);


    }//main disi


    //1 önerilmeyen
    public static void dvision(int a, int b){
        //System.out.println(a / b);
        //bu hatayı iflerle düzelticez
        if (b == 0){
            System.out.println("Lütfen 0 girmeyiniz");
        } else {
            System.out.println(a / b);
        }
    }

    //try-catch kullandiginizda sistem tarafindan “try” bolumu calistirilir,
    // eger “try” bolumunde hata ile karsilasilmazsa “catch” blogu hic calismaz
    //Eger “try” bolumunde hata ile karsilasilirsa hata alinan satirda calisma durdurulur
    // ve “catch - yakalamak” bolumu calismaya baslar.

    //1-a önelilen
    public static void division2 (int a, int b){
        try {//hata beklediğin kodu yazarsın
            System.out.println(a / b);
            System.out.println("try içi görev tamamlandı");
        } catch (ArithmeticException e){//exsepsin türü verilir
            System.out.println("Lütfen sifira bölme işlemi yapmayınız");
        }
        System.out.println("try catch sonrasi kod, akisina devam ediyor");
    }
    //ArithmeticException matematikteki exceptionları yakalar

    //---------exceptions biz fırlatabiliriz istediğimiz zaman
    //Throw Exceptions : a/b gibi islem sirasinda degilde, istenmeyen durumu gorunce hatayi biz olusturalim

    public static void division3 (int a, int b){
        try {
            if (b == 0){
                throw new ArithmeticException("Sıfır a bölme hatası");//throw fırlat demek
            }
        } catch (ArithmeticException e){
            System.out.println("Lütfen sifira bölme işlemi yapmayınız");
        }
        System.out.println("try catch sonrasi kod, akisina devam ediyor");
    }






}
