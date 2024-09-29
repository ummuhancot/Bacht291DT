package d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {



        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();//java rast gele sayı üretmesi için kalıp
        // ilk aşamada boş değişken üreticek sonra onlar dolduracak

        //0-100 arası rastgele bir sayi üretelim--java üretecek
        int rastgeleSayı = random.nextInt(101);//0 dahildir 101 dahil değildir o yüzden 101 yazdık
        //System.out.println(rastgeleSayı);//hile bu javanın kaç tuttuğunu gösterir.

        //ÖDEV ondalıklı sayı ürettirebilir miyiz

        //kullanıcının kaç kere tahmin yaptığını takip etmek için bir sayac oluşturalım
        int denemeSayısı = 0;//hiç denememiş 0 yükledim


        //kullanıcının yaptığı kahmini saklamak için bir değişken oluşturalım.
        int tahminEdilen;//
        //int tahminEdilen = ""; //calısır mıydı?

        //kullanıncını sayıyı doğru tahmin edip etmediğini kontrol etmek için bir
        //boolean değişken oluşturalım
        boolean tahminDoğrumu = false; //ilk aşamada false yükledik

        System.out.println("0-100 arasinda bir sayı tahmin etmeye calisin");

        do {

            //kullanıcıdan bir tahmin alalım
            System.out.println("Tahminninizi yazınız");
            tahminEdilen = scanner.nextInt();

            //sayacı bir arttıralım
            denemeSayısı++;

            //tahmini kontrol edelim
            //3 durum oluşur 1 küçük 2tam bilmiş olabilir 3 yüksek girmiş olabilir yönlendirmeyi
            //bu durumu 3 durumla if else ile yapıcaz

            if (tahminEdilen < rastgeleSayı){
                System.out.println("Sayı daha büyük");
            } else if (tahminEdilen > rastgeleSayı) {
                System.out.println("sayı daha kucuk");
            } else {
                tahminDoğrumu = true;
                System.out.println("Tebrikler doğru tahmin!!");
                System.out.println("Deneme sayısı : " + denemeSayısı);
            }

                //!false=true
        } while (!tahminDoğrumu);//döngü bununla kırılır false var bir kez çalışır başına ünlem koyarsanız
        //true görünür doğrudan. döngü doğru tahmin yapılıncaya kadar devam edecek


            scanner.close();//random da kapatılıyor mu ?

        //ÖDEV: 20(dahil) ile 100(dahil) arası dondom sayi isteseydik?















    }
}
