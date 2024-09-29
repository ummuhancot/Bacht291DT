package d12loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


        //Array - dizi--java dilininn bir kızmı obje sınıfının kullanabilirler
        /*
            1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.
            2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
            bir String dizisi sadece String değerler saklayabilir.

            3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum
            değer,
            Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.
            4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir
            5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya
            işlevselliği yoktur.
            6)Array'ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
            (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.
            değişme ihtimali olmayan datalar içindir array (dizi) garanticidir.
         */


        //Array olusturmak int de 0 primitilerde null koyar dizinin boyutu oluşturduktan sonra değiştirilmiyor

        //1. şekil--daha yaygın--
        String[] stdName1 = new String[3];//böyle oluşturulur köşeli parantez icine kaç data kullanmamız gerektini yazmalıyız

        //2.şekil --C-stle tarzından türemiş
        //String  stdName2[] = new String[4];//C style

        //System.out.println(stdName1);//javada arreyler doğrudan yazdırılamaz heap memorideki adresi gösterir
        System.out.println(Arrays.toString(stdName1));//arrays diye bir kılas var onun icinde metodlar var

        //class ismiyle cagırılan bir method varsa statik bir methottur

        //-----------------------------

        //ornek 1: 5 elemanli notes adinda, int bir arrray olusturunuz ve console’a yazdiriniz

        int[] notes = new int[5];
        System.out.println(Arrays.toString(notes));//intlerde 0 olur [0,0,0,0]

        //ornek 2: 10 elemanli integers adinda, Integer bir array olusturunuz ve console’a yazdiriniz
        //Array’ler de non primitive (reference) veri tipleri de saklanabilir.

        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers));
        //repırlara null atanır[null,null,null,null,null,null,null,null,null,null]
        //booleanlarda ne atanır noll mı 0 mı repırhalinde ne olur Booleann da yani null atıyor repper da

        //----------
        //ornek 3: 3 elemanli names adinda, String bir array olusturunuz ve console’a yazdiriniz

        String[] names = new  String[3];
        System.out.println(Arrays.toString(names));

        //-----------------------
        //Array’e eleman eklemek
        //index mantigiyla ekleniyor. 0 ilk index demektir

        names[0] = "Ali Can";
        names[2] = "Veli Han";
        names[1] = "Ayse Hanım";

        //names[3] = "Hasan Kaya";// HATA 3. index yok olmayan bir index olduğu için excepsın atar

        System.out.println(Arrays.toString(names));

        //Bir veriyi görmek icin ise;
        System.out.println(names[1]);//Ayse Hanım 1. indextekini istedim

        names[0] = "Omer Can";
        System.out.println(Arrays.toString(names));//[Omer Can, Ayse Hanım, Veli Han]

        //----------------------------
        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //      icerdigi karakter sayilari toplamini ekrana yazdirin.

        //Example 1: Create a String array, add 5 elements to it, all elements have
        // display the sum of the number of characters it contains.


        String[] cities = new String[5];

        cities[0] = "Bayburt";
        cities[1] = "Sivas";
        cities[2] = "Denizli";
        cities[3] = "Adana";
        cities[4] = "Ankara";

        //1. yol: for loop
        int totalChalr = 0;//değeri icinde saklayacak etkisiz eleman

        for (int i = 0; i < cities.length; i++){//length field dir method değildir alan okuması yapar
            //cities i git alanı oku demek
            totalChalr = totalChalr + cities[i].length();//length() methoddur.
            //i yazdım ki döngüde ne yazarsa o gelsin illeri istediğim ilicin length yazdım

        }
        //Dizilerde: length kullanılır (parantezsiz).
        //String'lerde: length() kullanılır (parantezli).

        System.out.println(totalChalr);//30

        //2. yol: for each loop (anhanced--geliştirilmiş loop da denir--)


        //for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
        //for loop’taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
        //variable ismi olarak da genel kabul w’nun kullanilmasidir.

        /*        for (Datatype variable : array yada collections){
            calisacak kodlar
        }*/

        int sum = 0;
        for (String w : cities){
            sum = sum + w.length();
        }
        System.out.println(sum);//döngü otomatik kırılır.

        //en gelişmişi for each loop tur.

        // indexle ilgili konularda normal for a döneriz, for olur çünkü orada daha fazla kontrol kullanmamız
        //gerecek normal for daha esnek.

    }
}
