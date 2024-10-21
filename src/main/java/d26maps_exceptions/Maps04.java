package d26maps_exceptions;

import d3_datatypes_concat_operators.Concatenation;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Maps04  {
    public static void main(String[] args) {

        //Thread Safe, Multi Thread, Synchronized kavramlarini inceleyelim

        /*
        Thread Safe: Aynı anda birçok iş parçacığı tarafından güvenli bir şekilde erişilebilen yapılar.
        Veri yarışlarını ve tutarsızlıkları önler.
        Multi Thread: Aynı anda birden fazla iş parçacığı tarafından çalıştırılabilen programlar.
        Paralel işleme ve performans artışı sağlar.
        Synchronized: Aynı anda sadece bir iş parçacığı tarafından erişilebilen metodlar veya kod blokları.
        Eşzamanlılık sorunlarını ve veri tutarsızlıklarını önler.
           */

        /*HashMap, HashTable ve ConcurrentHashMap arasindaki fark nedir?
        1- HashMap--> single treaded yapı onaylanır--tek iş parcacığı için kullanılır
        a) Thread Safety:
        Thread-safe değildir.
        Çok iş parçacıklı (multi-threaded) ortamda veri tutarsızlıkları olabilir.
        b) Multi Thread:
        Tek iş parçacıklı (single-threaded) ortamlar için idealdir.
        Çok iş parçacıklı ortamlar için harici senkronizasyon gerektirir.
        c) Synchronized:--secronayz olması extra kod ister --daha yavaştır bu yüzden--
        Synchronized değildir, yani aynı anda birden fazla iş parçacığı tarafından erişilebilir.
        d) Null Key/Value:
        Bir null key ve birden fazla null value kabul eder.
        e) Performans:
        En hızlısıdır çünkü synchronized değildir.
         */

        /*
        2- Hashtable
                a) Thread Safety:
        Thread-safe'tir.
        Synchronized yapısı nedeniyle aynı anda sadece bir iş parçacığı tarafından kullanılabilir.
                b) Multi Thread:
        ***Çok iş parçacıklı (multi-threaded) ortamlar için uygundur.***
                c) Synchronized:
        Synchronized'dir, yani tüm metotlar synchronized olarak işaretlenmiştir ve aynı anda sadece bir iş parçacığı tarafından erişilebilir.
                d) Null Key/Value:
        Ne null key ne de null value kabul eder. NullPointerException atar.
        e) Performans:
        HashMap'ten daha yavaştır çünkü synchronized'dir*/

        /*
        3- ConcurrentHashMap--cok iş parcacığı için idealdir
                a) Thread Safety:
        Thread-safe'tir.
        Segment-based locking kullanarak senkronizasyon sağlar.
                b) Multi Thread:
        ***Çok iş parçacıklı (multi-threaded) ortamlar için idealdir.***
        Aynı anda birden fazla iş parçacığı tarafından güvenli bir şekilde kullanılabilir.
                c) Synchronized:
        Synchronized'dir, ancak segment-based locking sayesinde daha iyi performans sunar.
                d) Null Key/Value:
        Ne null key ne de null value kabul eder. NullPointerException atar.
                e) Performans:
        HashTable'dan daha hızlıdır çünkü segment-based locking kullanır.
        Çok iş parçacıklı ortamlar için optimize edilmiştir.
        */

        /*HashMap, Hashtable ve ConcurrentHashMap ne zaman kullanılir?
                1- HashMap:
        Tek iş parçacıklı uygulamalar için idealdir  çünkü synchronized değildir(ek bir işlem ve zaman gerektirmez)
        Çok iş parçacıklı ortamda kullanılacaksa, dış senkronizasyon mekanizmaları ile korunmalıdır.
                2- Hashtable:
        Eski kod tabanları ve miras uygulamalar için uygundur(Varolan bir kod tabanını korumak veya mevcut bir projeyi
        güncellemek zorunda olduğunuz durumlar)
        Yeni projeler için genellikle önerilmez çünkü daha modern ve performanslı alternatifler vardır.
                3- ConcurrentHashMap:
        Modern ve yüksek performanslı çok iş parçacıklı uygulamalar için en iyi seçenektir.
        (Web sunucuları, veri işlem sistemleri, yüksek trafikli uygulamalar)
        Thread safety ve performansın önemli olduğu her durumda tercih edilir.*/

        // Hashtable Oluşturma
        Hashtable<String, Integer> studentGrades = new Hashtable<>();
        studentGrades.put("Selma", 70);
        studentGrades.put("Tuba", 75);
        studentGrades.put("İbrahim", 85);
        studentGrades.put("Sefa", 87);
        //studentGrades.put(null, 50);//null kabul etmez HATA VERİR KEY TARAFI
        //studentGrades.put("Ahmet", null);//nul kabul etmez HATA VERİR VOLUE TARAFI
        System.out.println(studentGrades);

        //HashMap omuşturma
        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Ahmet", 41);
        stdAges.put(null, 41);
        stdAges.put(null, 39);
        stdAges.put("a", null);
        stdAges.put("b", null);

        System.out.println(stdAges);

        //ConcurrentHasmap oluşturma
        ConcurrentHashMap<String, Integer> stock = new ConcurrentHashMap<>();

        //Eleman ekleme
        stock.put("Elma", 10);
        stock.put("Muz", 20);

        //Elma erimme
        System.out.println("Elmanin stok miktarı : " + stock.get("Elma"));//Elmanin stok miktarı : 10

        //Güncelleme veya ekleme
        stock.putIfAbsent("Çilek", 30);//Çilek depomda yoksa ekle demek
        System.out.println(stock);//{Muz=20, Çilek=30, Elma=10}

        stock.replace("Muz", 20, 25);
        System.out.println(stock);//{Muz=25, Çilek=30, Elma=10}

        //Eleman silme
        stock.remove("Elma");
        System.out.println(stock);//{Muz=25, Çilek=30}


        for (Map.Entry<String, Integer> entry : stock.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "stok miktarı : " + value);
        }
        /*
        Muzstok miktarı : 25
        Çilekstok miktarı : 30
        */

        //---------------
        /*
        1) TreeMap'ler entry'leri natural order'a gore siraya koyar, bu yuzden yavastirlar
        2) TreeMap'ler  thread-safe ve synchronized degildir.
        3) TreeMap'lerin key'lerinde null kullanilamaz(Comparator istisnasi var ama onerilmez),
        ama value kisimlarinda istediginiz kadar kullanabilirsiniz
        4) TreeMapler key'e bakarak siralama yapar
         */

        //treeMap oluşturalım
        TreeMap<String, Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 18000000);
        //countryPopulation.put(null, 18000000);//HATA NATURAL ORDER OLD İÇİN
        countryPopulation.put("Italy", null);
        countryPopulation.put("France", null);
        System.out.println(countryPopulation);
        //{France=null, Germany=83000000, Italy=null, Netherland=18000000, Turkiye=83000000, USA=400000000}

        //---------------------sıra varsa kullanılır--single tekli--
        /*LinkedHashMap, HashMap'e benzer, ancak ekleme sırasına göre sıralanmış bir şekilde verileri tutar.
        Yani, LinkedHashMap verileri eklediğiniz sırayla tutar ve bu sırayı korur.
        Bu nedenle, verileri eklediğiniz sırayla geri almanız gerektiğinde kullanışlı olabilir.

        **ornegin,bir takvim uygulamasında, etkinlikleri tarih sırasına göre tutmak için kullanılabilir.
        yada bir restoranın sipariş alım sistemi düşünün. Müşterilerin siparişlerini verme sırası,
        restoranın sipariş hazırlama sırasını belirler.

        Aynı mantık, müşteri hizmetleri çağrı merkezleri, sırayla hizmet veren işletmeler veya
        benzeri senaryolarda da kullanılabilir.
        Müşteri veya işlem sıralarını takip etmek için LinkedHashMap tercih edilebilir.LinkedHashMap sınıfı thread-safe degildir
        */

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("Ali", 25);
        lhm.put("Can", 18);
        lhm.put("Mehmet", 30);

        for (Map.Entry<String, Integer> entry : lhm.entrySet()){
            System.out.println(entry.getKey() + " --> " + entry.getValue());
            //Ali --> 25
            //Can --> 18
            //Mehmet --> 30 //insertion order sırası
        }

        //------------------hash map arka pılanda nasıl çalışıyor
        //HashMap arka planda nasil calisiyor?
        //HashMap'in varsayılan boyutu(kapasitesi) 16'dır (0 ila 15).16 adet "bucket" (kova) bulunacağı anlamına gelir.
        // Bu "bucket"lar, HashMap içindeki anahtar-değer çiftlerini tutar. Bucket'in memory'de kapsadigi alan degiskendir.

        HashMap<String, String> capitals = new HashMap<>();
        capitals.get("USA");
        capitals.put("Italy", "Rome");
        capitals.put("Turkiye", "Ankara");

        //yan yana 8 tane olursa Balanced Tree ye geçer hash code 16 bölünür kalar 2 olur ve listede 2 olan yere yazılır
        //bu yazılan lar 8 i geçerse Balanced Tree ye geçer

        capitals.get("Turkiye");
        capitals.put("Turkiye", "Istanbul");
        //bucket 12 tane dolunca 16 daha açıyor ilk 16 ya bölüyordu artık 32 bölmeye başlar






















    }
}
