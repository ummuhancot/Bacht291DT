package d17constructors_datetime;

import java.time.*;

public class DateTime05 {
    public static void main(String[] args) {

        //ornek 2: Verilen iki tarih arasindaki farki hesaplayan kodu yaziniz.
        //example 2: Write the code that calculates the difference between two given dates.

        //Java'da Period class'i, tarihler arasındaki yıl, ay ve gün farklarını temsil etmek için kullanılır.
        // Bu sınıf, iki LocalDate nesnesi arasındaki zaman farkını ifade eder ve java.time paketi içinde yer alır.
        // Period sınıfı, tarihler arasındaki farkları kolayca yönetmek ve manipüle etmek için çeşitli metodlar sağlar.

        //Kullanım Alanları
        //Period sınıfı, özellikle tarihler arasındaki uzun süreli farkları hesaplamak, tarihleri manipüle etmek
        // veya tarihler arası geçiş sürelerini yönetmek için kullanışlıdır. Finans, sağlık, eğitim gibi alanlarda
        // ve tarih ile ilgili işlemlerin sık yapıldığı her türlü yazılım geliştirme projelerinde etkili bir araçtır.

        //Period.between() metodu, iki tarih arasındaki farkı hesaplamak için kullanılır.
        // Bu metod, başlangıç ve bitiş tarihleri arasındaki tam yıl, ay ve gün farkını bir Period nesnesi olarak döndürür.

        //iki tarih arasında ki farka bakar feriod difference
        LocalDate date1 = LocalDate.of(2024,5,28);
        LocalDate date2 = LocalDate.of(2022,12,24);

        Period difference = Period.between(date2, date1);//sonucu eksi olmasın diye date 2 yi önce yazdık
        System.out.println(difference);//P1Y5M4D-->1Y: 1 yıl , 5M: 5 ay , 4D: 4 gün

        //Ayrı ayrı görelim  P1Y5M4D ----> 1 yıl 5 ay 4 gün
        int yearDifference = difference.getYears();
        int monthDifference = difference.getMonths();
        int dayDifference = difference.getDays();

        System.out.println(date1 + " ve " + date2 + "arasındaki fark");
        System.out.println("Yil : " + yearDifference);//Yıl : 1
        System.out.println("Ay : "+ monthDifference);//Ay : 5
        System.out.println("Gün : " + dayDifference);//Gün : 4

        //başka kılaslar
        //https://www.oracle.com/technical-resources/articles/java/jf14-date-time.html
        //Instant
        //ZonedDateTime
        //Duration--saat farkı
        //Clock --


    }
}
