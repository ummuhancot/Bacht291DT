package d29iterators_lambda;

import java.util.*;

public class Iterators {
    public static void main(String[] args) {


        /*
        1)  Iterator'ler loop'larin yaptigi ayni isi yapar
        2)  Iterator'lerde sonsuz loop olusma ihtimali yoktur(for each gibi)
        3)  Iterator'ler ile loop'lar arasinda performans farki yoktur
        4)  Iterator'ler bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basarilidir
        5) Iki tip iterator vardir:
            a) Iterator:
                 Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mumkun degildir
            b) ListIterator:
                 Bu eleman silebilir, ekleyebilir ve degistirebilir

            Not:
            Iterator, sadece soldan saga (ilk elemandan son elemana) calisir
            ListIterator iki yonlu calisabilir
         */

        //hasNext() : Koleksiyonun bir sonraki elemaninin olup olmadigini kontrol eder(boolean)
        //next() : Pointer'i bir sonraki elemanin onune konumlandirir ve pointer'in atladigi elemani verir
        //remove() : Pointer'in atladigi elemani siler

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jin");
        myList.add("Clara");
        myList.add("Fatma");
        myList.add("Mustafa");

        System.out.println(myList);//[Tom, Jin, Clara, Fatma, Mustafa]

        Iterator<String> myItr =myList.iterator();
        //System.out.println(myItr);//java.util.ArrayList$Itr@e9e54c2 doğrudan yazdırılmaz
        /*
        while (myItr.hasNext()){//en basa konumlanan pointer dan sonra eleman var mi diye bakar.
            myItr.next();//Pointer i bir sonraki elemanin onune alır ve atladigi elamani verir.
            myItr.remove();//next() in atladigi elamani siler
        }
        System.out.println(myList);//[]
        */

        //------------------
        //specific bir elemani iterator ile nasil silebiliriz? (Tom’u silelim)

        while (myItr.hasNext()){
            String eleman = myItr.next();
            if (eleman.equals("Tom")){
                myItr.remove();
                break;
            }
        }
        System.out.println(myList);//[Jin, Clara, Fatma, Mustafa]

        //ikinci tom ekle ve ikinci tomu sil ödev

        //--------------------
        //ListIterator --çift yönlü dolaşmaya olanak sağlar
        List<String> yourList = new ArrayList<>(Arrays.asList("Ali", "Can", "Aliye"));
        System.out.println(yourList);//[Ali, Can, Aliye]

        ListIterator<String> yourListItr = yourList.listIterator();

        //1) set(E e): Koleksiyonun geçerli elemanını değiştirir.

        while (yourListItr.hasNext()){

            String el = yourListItr.next();
            yourListItr.set(el + "*");
        }
        System.out.println(yourList);//[Ali*, Can*, Aliye*]

        //--------------------
        //2)elemanlari sondan basa dogru yazdirin
        List<String> yourList2 = new ArrayList<>(Arrays.asList("Ali", "Can", "Aliye"));
        System.out.println(yourList2);//[Ali, Can, Aliye]

        ListIterator<String> listIterator2 = yourList2.listIterator();

        //Bu loop pointer i en sona yazmak için yazildi

        while (listIterator2.hasNext()){
            listIterator2.next();
        }
        while (listIterator2.hasPrevious()){//has previous solundan bakan methottur
            String el = listIterator2.previous();//previous pointeri sola doğru taşır
            System.out.println(el + "<--");
        }
                /*
                Aliye<--
                Can<--
                Ali<--
                */




        //hasPrevious() : solunda eleman var mı diye bakar hasnext in tersidir.
        //previous() : pointeri sola doğru atlama yapar next in tersidir



    }
}
