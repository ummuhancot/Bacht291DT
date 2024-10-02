package d16methodcreation_overloading_varargs_passbyvalue;

public class D2_MethodOverloading01 {
    public static void main(String[] args) {

        /*
        Polymorphism:(polimorfizm)
        Method Overloading (static polymorphism) + Method Overriding(dynamic polymorphism)

        OOP'nin (Object Oriented Programming-Nesne yönelimli programlama) prensiplerinin biridir.
        Polymorphism (cok bicimlilik) demektir.
        Bir method'u, istedigimiz sonuclari alacak sekilde, farkli farkli sekilllerde calistirabilmek icin kullanilir.
        */

        /* i.Method Overloading : Java'da Method Overloading (Metot Aşırı Yükleme), aynı class içerisinde
        aynı isme sahip ancak farklı parametre listelerine sahip birden fazla metodun tanımlanması işlemidir.*/


        String s = "Java";
        //s.substring(int beginIndex); ==> tek parametre almis
        //s.substring(int beginIndex, int endIndex); ==> iki parametre almis
        //java lengt paketindeler

        add(3,5);//8

        //-------------------- static --- non-static-----//soru 2 nin cevabı
        // String s = "Java";
        //s.substring(); // => bu methodu bir String objesi üzerinden çağırırız .Böyle metotlara non-static denir.
        //Math.min(); //=> bu methodu direkt class üzerinden cagrılır. böyle metotlara static denir



    }//main disi

    //ornek 1 : Toplama islemi yapan bir method olusturun ve sonra da overload edin.
    //example 1 : A method that performs an addition operation create and then overload

    public static void add(int a, int b){
        System.out.println(a + b);
    }
   //etkisi olmayanlar aynını yazınca
   //1-static etkisi yok 2- return etkisi yok 3-acces modifaylın etkisi yok hataya düşer yine
    /*public  void add(int a, int b){
        System.out.println(a + b);
    }
    public static void add(int a, int b){
        return a + b;
    }
    private static void add(int a, int b){
        System.out.println(a + b);
    }*/

    public static void add(double a, double b){
        System.out.println(a + b);//data tipi değişince farklı bir değişken olarak belirler ovurlood bu
    }

    public static void add(double a, int b){
        System.out.println(a + b);
    }

    public static void add(int a, double b){
        System.out.println(a + b);
    }

    public static void add(int a, int b,int c){
        System.out.println(a + b + c);
    }

    //----------------------------------

    //s.substring(int beginIndex); ==> tek parametre almis
    //s.substring(int beginIndex, int endIndex); ==> iki parametre almis
    //java lengt paketindeler

    //Method ismi + Parametre = Method Signature(metot imzasi)
    //methot signature, bizim imzamız gibi benzersiz olmalıdır.

    //-------------------------

    /* Method Overloading'de sadece parametreler degistirilir.
   Boylelikle method signature degismis olur ve Java bu methodu yeni bir method gibi kabul eder.

    Method Overloading icin;---aşırı yüklenme ----
    a) Parametre sayisini degistirebilirsiniz.
    b) Parametre data tiplerini degistirebilirsiniz.
    c) Parametre data tipleri farkli ise parametrelerin yerlerini degistirebilirsiniz.
    d)Method overloading olustururken return type'in, access modifier'in,
   static veya non-static olmanin hicbir etkisi yoktur.
   */

    //-------------------------------
    /*
    Soru 1: private method'lar overload edilebilir mi?

    Cevap 1: private method'lar overload edilebilirler cunku;(tek kılas içinde yapıldığı için)
    overload islemi tek class icinde yapilir, private methodlar ayni class'in icinden
    ulasilabilir oldugundan overload'a engel degildir.

    Soru 2: static method'lar overload edilebilir mi?
    Cevap 2: static method'lar overload edilebilir cunku esasinda overload'da biz yeni method'lar olustururuz.
    */




















}
