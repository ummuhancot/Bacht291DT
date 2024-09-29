package d13array;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Ornek 1: Bir int array olusturun ve 5 ten kucuk olan elemanlari yazdirin.
        //Example 1: Create an int array and write the elements less than 5.
        //      [12, 3, -3, 5, 23] ==> 3, -3

        // kısa yolu ARRAY oluşturma bu veriye tek bir veri olarak görüyor daha hızlı oluşturuyor
        //kullanıcıdan veri almak istersem uzun yolu kullanmam lazım
        //kullanım ve okunabilirlikle ilgili

        int[] nambers = {12,3,-3,5,23};
        System.out.println(Arrays.toString(nambers));//[12, 3, -3, 5, 23]

        for (int w : nambers){


            if (w < 5){
                System.out.print(w + " " );// 3 -3 yan yana yazdırmak için ln sildim
            }

        }

        //----------------------

        //Ornek 2: Spesifik bir elemanin Array’de olup olmadigini anlamak icin gereken kodu yaziniz.
        //Example 2: Write the code to find out if a specific element is in Array

        //binarySearch() methodu var olan elemanlar icin size o elemanin index’ini verir
        //binarySearch() methodunu sort() kullanmadan kullanmayiniz----sıralama gerekiyor------sort sıralama demek-----
        //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
        // “-” ==> isaretinin anlami eleman yok demektir


        /*
        Yani, metot şu şekilde çalışır:
            Diziyi ikiye bölün.
            Aranan değer, ortadaki elemana eşitse, arama tamamlanır.
            Aranan değer, ortadaki elemandan küçükse, dizinin sol yarısında aramaya devam edilir.
            Aranan değer, ortadaki elemandan büyükse, dizinin sağ yarısında aramaya devam edilir.
            Bu işlem, aranan değer bulunana veya dizi içinde aranacak bir alt dizi kalmayana kadar tekrar edilir.
            --hiç de olmayabilir-- */

        System.out.println("----------------------");
        String names[] = {"A","T","K","E","B"};

        System.out.println(names);
        System.out.println(Arrays.toString(names));//[A, T, K, E, B]

        int result = Arrays.binarySearch(names, "B");//arama yapar bak bakim B var mı orada dedik.
        // 1  =  B birinci index de old için verdi
        // C icin -3 olsaydı kaçıncı index de olur
        // teknik hesaplaması bulunan değeri çıkar -1 den
        // - lerde normalde index de çalışıyor
        // -3 aslında -2 oluyor
        // olsaydı kaçıncı sırada olurdu
        //----------------------

        int[] arr = {2,1,7,6};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 2));//1
        System.out.println(Arrays.binarySearch(arr, 7));//3
        System.out.println(Arrays.binarySearch(arr, 3));// 3 yok olsaydı kaçıncı sırada olurdu -3
        System.out.println(Arrays.binarySearch(arr, 9));//-5 9 olsaydı 9 u ben nereye yazardım 1,2,3,4,9 olurdu ama yok -5 olurdu


        String[] s = {"A","B","C","D"};
        Arrays.sort(s);

        System.out.println(Arrays.toString(s));//[A, B, C, D]

        System.out.println(Arrays.binarySearch(s,"A"));// 0 ilk s ninci kılasa git A yı getir dedik
        System.out.println(Arrays.binarySearch(s,"C"));// 2
        System.out.println(Arrays.binarySearch(s,"E"));// -5 E olsaydı [A, B, C, D] , E yi buraya yazardık
        System.out.println(Arrays.binarySearch(s,"G"));// -5 E olsaydı [A, B, C, D] , G yi buraya yazardık
        //-5 benim 4. öndeksim oluyor yani -5+1 =4 indexde olur

        //404 hata
        //200 başarı anlamına gelir

        //  ARAŞTIRMA ÖDEVİ: javada char ve boolean türünde bir Array oluşturabilir misiniz?

        //-------------------------------

        //Ornek 3: Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        //Example 3: Write the code that shows you how many words are in a given sentence.
        //String s = “Java is easy. Learn Java earn money.“;


        String s1 = "Java is easy. Learn Java earn money.";
        System.out.println(s1);//Java is easy. Learn Java earn money.

        String[] words = s1.split(" ");//kelimeler demek
        System.out.println(Arrays.toString(words));//[Java, is, easy., Learn, Java, earn, money.]

        System.out.println(words.length);//7
        //bir siplitle veriyi bölünce çoklu veri ortaya çıkar.







    }
}
