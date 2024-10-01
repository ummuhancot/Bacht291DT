package d15arraylist_methodcreation;

import java.util.ArrayList;

public class ArrayList02 {
    public static void main(String[] args) {

        //Ornek 1:  Bir String ArrayList oluşturun ve “a” içeren elemanlari silin.
        //Example 1: Create a String ArrayList and delete the elements containing “a”.

        //-----------------------------
        /*for each kullandiginizda list'lerde eleman sayisini azaltamazsiniz.

        Cunku "for each" döngüsü ile bir koleksiyonu veya diziyi dolaşırken, koleksiyonun veya dizinin
        boyutu değişirse, bu, döngünün tutarlılığını bozar. Özellikle, eleman kaldırıldığında, döngü hâlâ
        eski boyutu dikkate alacak, bu da dizi sınırlarını aşabilir veya yanlış elemanlara erişebilir.
        Ayrıca, diğer elemanların dizin numaraları değişecektir, bu da yanıltıcı sonuçlara yol açabilir.

        Concurrent Modification Exception - Eşzamanlı Değişiklik İstisnası olusur.
        Yani bir dongu sayisi for each tarafindan ornegin 4 olarak ayarlanmissa,
        siz bir elemani silince o 4 uzerinden devam etmeye calisacagi icin tutarsizlik olusur */
       //------------------------------------


        ArrayList<String> r = new ArrayList<>();
        r.add("Manisa");
        r.add("Nigde");
        r.add("Tokat");
        r.add("Van");

        System.out.println(r);//[Manisa, Nigde, Tokat, Van]

       /* for (String w : r){

            if (w.contains("a")){
                r.remove(w); //remove sil demek
            }
        }
        System.out.println(r);//exception fırlattı bu başarılı demek
        //[ConcurrentModificationException exception adı bu HATA */

        for (int i = 0; i < r.size(); i++) {
            if (r.get(i).contains("a")){
                r.remove(i);
               //i--;//burayı silince hata vermez ama yanlış cıkar sonuc
                // 4 defa calışıcak azaltmalıyız ki 3-2-1 defa daha calıştın
            }
        }
        System.out.println(r);

        //ODEV: Bu soruyu i'yi son index'ten baslatarak ta cozebilirdik.i-- yazmaya gerek kalmazdi. Nasil?

       for (int j = r.size()-1; j >= 0; j--) {
            if (r.get(j).contains("a")){
                r.remove(j);
            }
        }
        System.out.println(r);




    }
}
