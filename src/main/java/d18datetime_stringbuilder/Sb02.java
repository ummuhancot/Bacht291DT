package d18datetime_stringbuilder;

public class Sb02 {
    public static void main(String[] args) {

        //capacity() methodu, ayrılmış olan ve henüz kullanılmayan karakter alanının büyüklüğünü ifade eder.
        // Buradaki “karakter” kavramıyla kastedilen şey, Java’daki char veri tipindeki karakterlerdir.
        // char veri tipi, Java’da Unicode karakterleri temsil etmek için kullanılır ve
        // her bir char 2 byte (16-bit) yer kaplar.

        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());//0

        //java bize kaclık yer ayırmış onu görücez
        System.out.println(sb2.capacity());//16 difault kapasite budur eleman yokken

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34 (arttırma : 2 katının 2 fazlası şeklinde arttırır capacity i)

        /*capacity Java'nin size verdigi data depolama yer sayisidir,
        length ise size verilen data depolama yerinin kullanilan kismidir

        ==>Java  baslangic olarak size capacity 16 olarak verir,
        Siz eger verilen bu capacity'i asarsaniz Java yeni capacity'i var olanin 2 katinin 2 fazlasi olacak sekilde ayarlar
        16==> 16*2+2 = 34,  34 ==> 34*2+2 = 70  …..*/

        //---------------

        //Default Capacity'yi (16 karakter) nasil degistirebiliriz?
        StringBuilder sb3 = new StringBuilder(3);//constructor kismina int yazilirsa capacity sayilir
        System.out.println(sb3.append("Alis"));//3 kapasiteli alana 4 kapasiteli alan ekledik alan otomatik arttı
        System.out.println(sb3.capacity());//2 katının 2 fatlasını aldı capacity de --,8 oldu

        //----------------------
        StringBuilder sb4 = new StringBuilder();
        System.out.println(sb4.length());//0
        System.out.println(sb4.capacity());//16

        sb4.append("Java");
        System.out.println(sb4.length());//4
        System.out.println(sb4.capacity());//16

        sb4.append("xxxxxxxxxxxxxxxxxxxx");
        System.out.println(sb4.length());//24
        System.out.println(sb4.capacity());//34


        //tek apentliler de böyle olur özel durum arttırma ilk arttırımıda aşınca length kac ise o kadar yer ayırmaya başlar
        //iki apentlilerde iki katının iki fazlasını devam ettirir.
        sb4.append("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(sb4.length());//44
        System.out.println("mliemak ="+sb4.capacity());//44

        //seneryo dene başka 10 luk ekle

        StringBuilder sb5 = new StringBuilder();
        System.out.println(sb5.length());//0
        System.out.println(sb5.capacity());

        sb5.append("xxxxxxxxxxxxxxxxxxxx");
        sb5.append("xxxxxxxxxxxxxxxxxxxx");
        System.out.println(sb5.length());//40
        System.out.println(sb5.capacity());//70
















    }
}
