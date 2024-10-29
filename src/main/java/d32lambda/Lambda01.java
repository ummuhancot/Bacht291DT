package d32lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) throws IOException {


        /*Bir dosyadan(txt), harf harf degil de satir satir secme yapabilecegiz

        Ornek 1: Verilen text file icindeki text'i console'a yazdiran code'u yaziniz.
        Example 1: Write the code that prints the text in the given text file to the console.

            a) lines,Files sınıfına ait bir metottur.Belirtilen bir dosya yolundan satır satır
            veri okumak için bir Stream<String> döndürür.Bu sayede dosyadaki her satır üzerinde
            akış işlemleri yapabilirsiniz.
            b) Paths.get, Paths sınıfının statik bir metodudur.
            Verilen dosya yolu dizgesini (string) temsil eden bir Path nesnesi döndürür.
            Bu Path nesnesi, dosya ve dizin işlemleri için kullanılır. (oralara ulasimi saglar)*/

        //Files.lines(Paths.get("src/main/java/d32lambda/lambdaTextFile.txt")).forEach(System.out::println);
        Path path = Paths.get("src/main/java/d32lambda/lambdaTextFile.txt");
        Files.lines(path).forEach(System.out::println);



        /*Ali, kitapligina bakti ve aradigi kitabi bulamadi.
        Bahceye cikti, belki orada unutmus olabilirdi.
        Ancak, orada da yoktu.
        Birden aklina geldi.
        Salonda bir masa vardi.
        Masa uzerinde bircok kitap vardi.
        Hizla salona kostu ve evet, oradaydi.
        Kitabini aldi ve rahatca koltuguna oturdu.
         */

        //-------------------------
        System.out.println("----------------------");
        //Ornek 2: Verilen text file icindeki text’i buyuk harflerle console’a yazdiran kodu yaziniz.
        //Example 2: Write the code that prints the text in the given text file to the console in capital letters

        /*
        Files.lines(Paths.get("src/main/java/d32lambda/lambdaTextFile.txt")).
                map(String::toUpperCase).forEach(System.out::println);*/

        Files.lines(path).
                map(String::toUpperCase).forEach(System.out::println);


        /*
        ALİ, KİTAPLİGİNA BAKTİ VE ARADİGİ KİTABİ BULAMADİ.
        BAHCEYE CİKTİ, BELKİ ORADA UNUTMUS OLABİLİRDİ.
        ANCAK, ORADA DA YOKTU.
        BİRDEN AKLİNA GELDİ.
        SALONDA BİR MASA VARDİ.
        MASA UZERİNDE BİRCOK KİTAP VARDİ.
        HİZLA SALONA KOSTU VE EVET, ORADAYDİ.
        KİTABİNİ ALDİ VE RAHATCA KOLTUGUNA OTURDU.
         */

        //-------------------------
        System.out.println("----------------------");

        //Ornek 3: Verilen text file icindeki text'lerde "Veli" kelimesinin olup olmadigini kontrol eden kodu yaziniz.
        //Example 3: Write the code that checks whether the word "Veli" is present in the texts in the given text file.

        //a) anyMatch, Stream’deki herhangi bir elemanın belirtilen koşulu karşılayıp karşılamadığını kontrol eder.
        //Eğer koşulu karşılayan bir eleman bulunursa true döndürür, aksi halde false döndürür.

        boolean result1 = Files.lines(path).anyMatch(t -> t.contains("Veli"));
        System.out.println(result1);//false

        //-------------------------
        System.out.println("----------------------");
        //Ornek 4: Verilen text file icindeki text’lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        //Example 4: Return the different words used in the texts in the given text file in a list.

        /*flatMap,Stream sınıfına ait bir metottur.
        Işlem sonucunda elde edilen tüm akışlar (streams) tek bir akışta (stream) birleştirilir.
        Özellikle iç içe geçmiş veri yapılarını düzleştirmek için kullanılır.
        flatMap'ten once split tum bosluklardan boldugu icin bize Array verir.
        Bu Array yapisini duzlestirerek bize tek bir akis verir*/

        List<String> words = Files.lines(path).
                map(t-> t.replaceAll("\\p{Punct}", "").split(" ")).
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList());
        System.out.println(words);

        //-------------------------
        System.out.println("----------------------");

        //Ornek 5: Verilen text file icindeki text’de toplam kac harf kullanildigini gosteren kodu yaziniz.
        //Example 5: Write the code that shows the total number of letters used in the text in the given text file.

        long numOfLetters = Files.lines(path).
                map(t -> t.replaceAll("[^a-zA-Z]", "")).
                map(t -> t.split("")).flatMap(Arrays::stream).count();
        System.out.println("numOfLetters = " + numOfLetters);//numOfLetters = 228

        //---------------------------
        System.out.println("-------------");
        //Ornek 6: Verilen text file icindeki text'de kullanilan tum harfleri tekrarsiz olarak
        // natural order'da (a'dan z'ye) bir listin icinde return eden kodu yaziniz.
        //Example 6: All letters used in the text in the given text file without repetition
        // Write the code that returns a list in natural order (a to z).

        List<String> letters = Files.lines(path).
                map(t -> t.replaceAll("[^a-zA-Z]", "")).
                map(t -> t.split("")).flatMap(Arrays::stream).
                distinct().
                sorted().
                collect(Collectors.toList());
        System.out.println("letters = " + letters);
        //letters = [A, B, H, K, M, S, a, b, c, d, e, g, h, i, k, l, m, n, o, p, r, s, t, u, v, y, z]

        //-----------------------
        /*
        Intermediate Operasyonlar:
        Bu operasyonlar, bir Stream üzerinde işlem yapar ve yine bir Stream döndürür.
        Bu nedenle, birkaç intermediate operasyonunu bir araya getirerek birbirine zincirleyebilirsiniz.(chain)

        Intermediate operasyonlar "tembel"dir (lazy). Yani gerçek işlem, bir terminal operasyonu
        çağrıldığında gerçekleşir.

        Yaygın kullanılan intermediate operasyonlara örnekler:

        filter: Belirli bir koşulu karşılayan öğeleri filtreler.
        map: Stream'deki her öğeyi dönüştürür.
        flatMap: Her bir öğeyi birden fazla yeni öğeye dönüştürür.
        sorted: Öğeleri doğal sıraya veya belirtilen bir karşılaştırıcıya göre sıralar.
        distinct: Yalnızca benzersiz öğeleri alır.
        */

        //-----------------
        /*Terminal Operasyonlar:
        Bu operasyonlar, Stream üzerinde bir son işlem yapar ve Stream'i sonlandırır veya tüketir.
        Stream üzerinde bir terminal operasyonu gerçekleştirildiğinde,
        o Stream üzerinde başka bir işlem yapılamaz.

        Yaygın kullanılan terminal operasyonlara örnekler:

        forEach: Stream'deki her öğe üzerinde bir işlem yapar.
        collect: Stream'deki öğeleri bir koleksiyona dönüştürür.
        reduce: Stream'deki öğeleri tek bir değere indirger.
        sum, min, max, average: Stream'deki öğelerin toplamını, minimumunu, maksimumunu
        veya ortalamasını hesaplar.
        allMatch, anyMatch, noneMatch: Stream'deki öğelerin belirli bir koşulu karşılayıp
        karşılamadığını kontrol eder.
        findFirst, findAny: Stream'den bir öğe alır.

        Özetle, intermediate operasyonlar bir Stream döndürür ve terminal operasyonları
        Stream'i sonlandırır. Bir Stream üzerinde işlem yapabilmek için en az bir terminal
        operasyonunun çağrılması gerekmektedir, çünkü intermediate operasyonlar tembeldir
        ve sadece terminal operasyon çağrıldığında gerçekte çalıştırılır. Tek bir terminal olur*/




    }
}
