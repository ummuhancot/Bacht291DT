package d17constructors_datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DateTime01 {
    public static void main(String[] args) {

        //Itf sisteminde attımız her adım kaydolur izlenir

        //LocalDate java.time paketinde yer alan bir classtir.
        //Bu sınıf, tarih bilgilerini temsil etmek ve işlemek için kullanılır.
        //Java'da java.time.LocalDate class'i, yerel tarihleri temsil etmek için kullanılır
        // ve saat bilgisini içermez, yani sadece gün, ay ve yıl bilgilerini içerir.

        //---------------
        //ornek 1: now(): Geçerli tarihi alır. Tarih bilgisini yerel bilgisayarınızın saatinden alır,
        // yani sizin bilgisayarınızın saatinden gelir


        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);//2024-10-02 şuanın tarihi geldi

        //---------------------- javada ayları gösterir---------
        //ornek 2 : getMonthValue(): Tarihin ayını (1-12 arasında) alır.
        //getMonth(): Bu metod ayı dondurur. (Month enum türünde)

        //Java'da Month veri türü, bir enum (enumeration) türüdür (numaralandırma türüdür).
        //Degisme ihtimali olmayan datalari depolamak icin kullanilir. Haftanin gun isimleri, Ay isimleri gibi

        System.out.println(myDate.getMonthValue());//10 ayı verdi
        Month month = myDate.getMonth();
        System.out.println(month);//OCTOBER

        //ornek 3: getYear(): Tarihin yılını alır.
        System.out.println(myDate.getYear());//2024
        System.out.println(myDate.getDayOfYear());//276 yilin 276. günündeyiz

        //ornek 4:getDayOfMonth(): Ayin gününü alır.
        int day1 = myDate.getDayOfMonth();
        System.out.println(day1);//2

        DayOfWeek day2 = myDate.getDayOfWeek();
        System.out.println(day2);//WEDNESDAY


        //ornek 5:
        //ileriki tarihe nasil gidilir?
        //plusDays(): Belirtilen gün sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusMonths(): Belirtilen ay sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //plusYears(): Belirtilen yil sayısını tarihe ekler ve yeni bir LocalDate döndürür.
        //Bu methodlar, orijinalleri değiştirmez, yeni bir gun, ay ve tarih nesnesi oluşturur.

        LocalDate newDate = myDate.plusYears(1).plusMonths(2).plusDays(4);//yıl ay gün sıralı yazılmalı
        System.out.println(newDate);//2025-12-06 geleceğe gittik


        //---------------
        /*ornek 6:Gecmis tarihe nasil gidilir?
        minusYears(): Bir LocalDate veya LocalDateTime nesnesinden belirtilen yıl sayısını çıkarır.
        minusMonths() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen ay sayısını çıkarır.
        minusDays() : Bir LocalDate veya LocalDateTime nesnesinden belirtilen gün sayısını çıkarır.
        Sonuç olarak, çıkarma işleminden sonra elde edilen tarihi döndürürler.*/

        System.out.println(myDate.minusYears(1).minusMonths(3).minusDays(3));
        //2023-06-29 böylece geçmişe döndük bu tarihten

        //-----------------------

        //ornek 7: Specific bir tarih objesi nasil olusturulur?
        //of(int year, int month, int dayOfMonth): Belirtilen yıl, ay ve günle bir LocalDate örneği oluşturur.

        LocalDate date1 = LocalDate.of(1984,5,7);
        LocalDate date2 = LocalDate.of(2010,5, 4);

        System.out.println("date1 = " + date1 + ", date2 = " +  date2);
        //date1 = 1984-05-07, date2 = 2010-05-04


        //isAfter(): Bir tarihin başka bir tarihten sonra olup olmadığını kontrol eder.boolean verir
        //isBefore(): Bir tarihin başka bir tarihten once olup olmadığını kontrol eder.boolean verir

        boolean t1 = date1.isAfter(date2);
        System.out.println(t1);//false date1 den sonra mı date2 diye sordu

        boolean t2 = date1.isBefore(date2);
        System.out.println(t2);//true date1 den önce mi date2 diye sordu




    }
}
