package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class DateTime01 {
    public static void main(String[] args) {



        /*LocalTime Class'ta kullanilan tarih saat formatlari

        HH : mm ==> 24'lu saat sistemi
        hh : mm ==> 12'li saat sistemi. AM, PM gosterilmez
        hh : mm a ==> 12'li saat sistemi. AM, PM gosterilir
        HH : mm : ss ==> saniyeyi gosterir
        HH : MM ==> yanlis format cunku MM aylar icin kullanilir
        "mm" "minute" demektir. "MM" "month" demektir.

        dd-MM-yyyy ==> gun - ay - yil----> d*MM*yyyy diye calışır
        MMM ==> Aug
        MMMM ==> August  */

        //-------------
        //ornek 1:“DateTimeFormatter”, bir Class’tir ve tarih ve saat verilerini belirli bir
        // biçimde görüntülemek, okumak ve işlemek için kullanılan önemli bir araçtır.


        //DateTimeFormatter, tarih ve saat nesnelerini “metin” yani String olarak biçimlendirmenize ve
        // metni tarih ve saat nesnelerine çözmenize olanak tanır.

        //ofPattern() metodu, belirli bir kalıba (pattern) göre tarih ve zaman verilerini
        // biçimlendirmek için kullanılır.

        //format() method’u LocalTime’i String’e istedigimiz formatta cevirir



        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//01:30:22.099803600

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm a");//12li saat sistemi am pm gösterilir
        String formattedTime = dtf1.format(myCurrentTime);//parantez içine ne zamananı giricemizi yazarız mesela şuanki saati yazdık şimdi
        System.out.println(formattedTime); //11:14 ÖÖ

        //-------------
        //Ornek 2: Tarih’i formatlayalim

        LocalDate myCurrentData = LocalDate.now();//şuanki tarihi aldım
        System.out.println(myCurrentData);//2024-10-04

        //cok begenmedim yazım sitilini değiştiriyorum

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = dtf2.format(myCurrentData);
        System.out.println(formattedDate);//04-Eki-2024

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("d/MMMM/yyyy");
        String formattedDate1 = dtf3.format(myCurrentData);
        System.out.println(formattedDate1);//4*Ekim*2024

        //--------------------------
        //ornek 3: Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?

        //ZoneId, zaman dilimi veya coğrafi bölge bilgisini temsil eder ve
        // tarih/saat işlemlerinde bu bilginin kullanılmasını sağlar.

        //-------------------------
        //Tokyo da ayin kaci?
        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));//zone bilgileri yazılır
        System.out.println(dateInTokyo);//2024-10-04

        //ARAŞTIRMA ÖDEVİ:  java bu bilgiyi internetten mi çekiyor.

        //------------------------
        //Amsterdam da ayın kaci?
        LocalDate dateInAmsterdam = LocalDate.now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);//2024-10-04

        //---------------------
        //Tokyoda saat kac?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);//17:35:36.123037100

        //------------------
        //Tüm zone'leri görelim

       /*Set<String> zoneIds = ZoneId.getAvailableZoneIds();

        for (String w : zoneIds){
            System.out.println(w);
        }

        //Zaman dilimlerinin sayisini görelim
        System.out.println("Toplam zaman dilimi sayısi = " +zoneIds.size());//603 tane
        */




        //---------------
        //ornek 4: Tarih ve zamani ayni anda kullanalim.
        //LocalDateTime, tarih ve saatlerle çalışmak için kullanılır.


        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2024-10-04T11:46:17.270010800



        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("d * MMMM * yyyy - hh : mm a");//formatladık istedimiz şekilde yazdık saati sadeleştirdik
        String formattedLdt = dtf4.format(ldt);
        System.out.println("formattedLdt = " + formattedLdt);//04 / Ekim / 2024 - 11 : 53 ÖÖ

        //Java'da tarih ve saat hesaplamaları yaparken, Java'nın kullandığı tarih ve saat bilgileri, işletim sisteminin
        // sağladığı zaman bilgisinden alınır. Java, zaman ve tarih bilgilerini işletim sisteminin saatinden alır ve
        // o anki sisteme göre bu bilgileri işler.














    }
}
