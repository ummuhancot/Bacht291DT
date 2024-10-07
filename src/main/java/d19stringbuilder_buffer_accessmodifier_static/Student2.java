package d19stringbuilder_buffer_accessmodifier_static;

public class Student2 {


        //static, bir değişkenin veya bir method’un Class’a ait olduğunu ve Class’in bir örneği (Object’i)
        // oluşturulmadan kullanılabileceğini belirtmek için kullanılan bir anahtar kelimedir.

        /*
     1) static variable veya static methodlar (class member) tum object'ler icin ortak elemandir
     2) static class member'lar uzerinde yapilan degisiklikler tum objectleri etkiler.
     3) static class member'lar class'a, non-static class member'lar object'lere aittir
     4) static class member'lara ulasmak icin object olusturmaya gerek duyulmaz,
         ama non-static class member'lara ulasmak icin object olusturmak sarttir
     5) static variable'larin diger adi class variable'dir,
         non-static variable'larin diger adi instance(örnek) variable veya object variable'dir
        */

    public static String stdName = "Ali Can";// varaybıls belirledik//static variable

    public int age = 18;// belirlenen varaybılsın üzerinden cağırdık//non static variable

    public static void staticMethod(){//direk clastan cağırdı
        System.out.println("Ben static bir methodum");//c
    }

    public void nonstaticMethod(){//objeden cağırır
        System.out.println("Ben non static bir methodum");
    }

}
