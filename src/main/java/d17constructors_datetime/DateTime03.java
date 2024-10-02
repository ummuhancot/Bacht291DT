package d17constructors_datetime;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime03 {
    public static void main(String[] args) {


        //--------------date time 02 nin geliştirilmiş şeklini yaptık forla------------

        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.

        //Example 1: If the date you have received from the user is in the past, give the message “You have entered an invalid date”.
        //If the date you have received from the user is in the future, say “You can enter the time”.

        Scanner input = new Scanner(System.in);
        LocalDate giveDate = null; //LocalDate giveDate; --- de yazabilirdik----

        while (true){

            System.out.println("Lütfen yılı giriniz");
            int year = input.nextInt();

            System.out.println("Lütfen ayı giriniz");
            int month = input.nextInt();

            if (month < 1 || month > 12){
                System.out.println("Ay 1 ile 12 arasında olmalidir. Tekrar deneyiniz");
                continue;//kullanıcıyı döngünün başına yönlendirir.
            }

            System.out.println("Lütfen gunu giriniz");
            int day = input.nextInt();


            //ayın kaç çektiğini bulalım. yıl ve ay için YearMonth objesini oluşturalım
            YearMonth yearMonth = YearMonth.of(year, month); //yeni öğrendik YearMonth u
            //ayın kac cektini bulur

            //Ayın maksimum gün sayısını bulalım
            int daysInmonth = yearMonth.lengthOfMonth();

            if (day < 1 || day > daysInmonth){
                System.out.println("Girilen ay için geçersiz gün. Tekrar deneyiniz");
                continue; //kullanıcıyı döngünün başına yönlendirir.
            }

            giveDate = LocalDate.of(year, month, day);//Girilen bilgilerle tarih oluşturduk

            if (giveDate.isBefore(LocalDate.now())){
                System.out.println("Gecersiz, gecmiş bir tarih giriniz. Tekrar deneyiniz");
            } else {
                System.out.println("Zamanı girebilirsiniz");
                break;//Gecerli tarih girildigi icin dongüyü kırdık.
            }

        }
        //break te buradaki kodlar çalışır
        //return içinre bulunduğu metodu sonlandırır. burada main metodu sonlandırır ve
        //programın çalışması durur




    }
}
