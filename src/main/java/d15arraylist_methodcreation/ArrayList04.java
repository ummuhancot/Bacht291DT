package d15arraylist_methodcreation;

import java.util.Arrays;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {

        //Bir list olusturmak icin kisayol

        List<Integer> myList = Arrays.asList(1,3,4,9,7);//asList kısayoldan ekleme bir class kullanmaya gerek olmaz
        System.out.println(myList);//[1, 3, 4, 9, 7]

        //1- Arrays.asList() ile oluşturulan liste, sabit boyutludur. Array gibi calismaya baslar.
        // Bu, listenin boyutunu değiştiremezsiniz; yani yeni eleman ekleyemez veya çıkaramazsınız.
        //Listin eleman sayisini degistiren methodlari kullanamazsiniz.
        //2- Arrays.asList() ile oluşturulan liste, bazı liste işlemlerini desteklemez.
        // Örneğin, remove(silme) , add(eleman ekleme), clear(list de ki elemanları toptan siler) gibi yöntemler desteklenmez. Ama set() veya size() kullanabilirsiniz

        //clear() metodu, bir listedeki tüm elemanları silmek için kullanılır.

        //sabit veriler de kullanılır sürekli ekleme cıkarmada hata alınır kullanılmaz

        //myList.remove(0);//HATA
        //myList.add(5);//hata
        //myList.clear();//hata
        //System.out.println(myList);//böyle olunca hata verir sabit boyutta eleman silemez

        myList.set(0, 5);
        System.out.println(myList);//[5, 3, 4, 9, 7]
        System.out.println(myList.size());//5

        //Array’lerin sagladigi bazi methodlari kullanmak istiyorsaniz ve
        // eleman sayisini degistirmeyecekseniz asList kullanabilirsiniz


    }
}
