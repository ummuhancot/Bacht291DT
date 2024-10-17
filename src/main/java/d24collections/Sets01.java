package d24collections;

import java.util.*;

public class Sets01 {
    public static void main(String[] args) {

        //Set’ler tekrarsiz(unique) datalari depolamak icin kullanilir. Ornegin; e-mail, tc kimlik no, il plaka no
        //herkes için farklı

        /*Java'da üç tür set vardır:

        //----------hızlıdır
        1) HashSet: Bu set, elemanların hash kodlarına göre depolandığı bir settir. Elemanlar,
        her birinin benzersiz bir hash kodu (kimlik numarası) ile depolandığı bir yapıda tutulur.
        Bir eleman eklediğinizde, bu elemanın hash kodu hesaplanır ve o hash koduna karşılık gelen
        bir hücreye yerleştirilir.

        HashSet'ler, en hızlı performansı sunar.Ancak, elemanların sırasını korumazlar.
        null'i eleman olarak kabul ederler */

        //-------------ek bilgi
        //Hash Code gormek istersek

        String a = "Ali can";
        System.out.println(a.hashCode());

        String a1 = "ali can";
        System.out.println(a1.hashCode());

        String a3 = "Aliye canan";
        System.out.println(a3.hashCode()); //hashcode'lari benzersiz (unique) degildir

        //-------------kayıt sıralamasına göre düzenler
        /*2) LinkedHashSet: Bu set, elemanların eklenme sırasına göre(insertion order) depolandığı
        bir settir. LinkedHashSet class'i, HashSet class'inin child'idir.
        LinkedHashSet'ler, elemanların sırasını korumaya ihtiyaç duyulan uygulamalar için iyi bir seçimdir.
        Ancak, HashSet'lerden daha yavaş performans sunarlar. (orta)

        Ornegin; Okullarda kayit sirasina gore ogrenci bilgilerini tutmak isterseniz kullanabilirsiniz

        //----------------doğal sıralar küçükten büyüge
        3) TreeSet: Bu set, elemanların doğal sırasına(natural order-kucukten buyuge) göre depolandığı bir settir.
        HashSet'ler ve LinkedHashSet'lerden daha yavaş performans sunarlar.
        Java'da TreeSet, SortedSet arayüzünü(interface) uygulayan bir class'tir.
        Bu nedenle, TreeSet bir Sorted Set'tir.*/

        //--------------------
        //HashSet nasil olusturulur?

        HashSet<String> hs = new HashSet<>();
        System.out.println(hs); //[]

        //HashSet’e nasil eleman eklenir?
        hs.add("Sinan");
        hs.add("Kerem");
        hs.add("Tuba");
        hs.add("Onur");
        hs.add("Ummuhanı");
        System.out.println(hs);//[Kerem, Ummuhanı, Sinan, Tuba, Onur]---karışık tutar hashset
        System.out.println(hs.hashCode());

        hs.add("Kerem");//tekrarli eleman hata vermez, üzerine yazar
        System.out.println(hs);//[Kerem, Ummuhanı, Sinan, Tuba, Onur]

        hs.add(null);
        System.out.println(hs);//[Kerem, Ummuhanı, null, Sinan, Tuba, Onur]

        hs.add(null);//üstüne yazar birilerinin boş geçtiğini ifade eder
        System.out.println(hs);//[Kerem, Ummuhanı, null, Sinan, Tuba, Onur]

        //HashSet<String> ekleme = new HashSet<>(Set.of("ekleme","ekleme")) kısa yolla eklemeye bak

        //LinkedHashSet nasil olusturulur?

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(14);
        lhs.add(19);
        lhs.add(7);
        lhs.add(1);
        lhs.add(null);
        System.out.println(lhs);//[14, 19, 7, 1, null] - insertion order - ekleme sırası

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(14);
        ls.add(19);
        ls.add(17);
        ls.add(11);
        System.out.println(ls); //[14, 19, 17, 11]

        //retainAll() metodu, bir koleksiyondaki öğelerin başka bir koleksiyonla kesişimini
        // (yani her iki koleksiyonda da bulunan öğeleri-ortak) bulmak için kullanılır.

        lhs.retainAll(ls);
        System.out.println(lhs);//[14, 19]--ortakları aldı
        System.out.println(ls);//[14, 19, 17, 11]

        //ODEV: Farkli olanlari bulan bir metot var mi?

        //---------------------
        //TreeSet nasil olusturulur?
        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        //ts.add(null);//exception fırlatıyor null kabul etmez//HATA, null koyamazsın çünkü null ın doğal bir sıralaması yok
        System.out.println(ts);//[A, G, R, U, Z]--natural order-- doğal sıralama - A dan Z ye

        //subset() belirli bir aralıktaki elemanları içeren yeni bir küme oluşturmak için kullanılır.
        //subSet() methodu, belirtilen aralıkta bulunan elemanlardan oluşan bir sorted set alt kümesi
        // oluşturur. Bu nedenle, subSet() yöntemini kullanmak için,
        // SortedSet türünden bir değişken oluşturmanız gerekir.

        //TreeSet<Character> sortedSet = ts.subSet('G', 'U'); // beklenen treeset olsa bile perıntının ismini yazarsınız gelen sortedset olur
        SortedSet<Character> sortedSet = ts.subSet('G', 'U');
        System.out.println(sortedSet);//[G, R]






    }
}
