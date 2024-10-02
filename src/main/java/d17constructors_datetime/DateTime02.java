package d17constructors_datetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime02 {
    public static void main(String[] args) {

        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise “Gecersiz tarih girdiniz” mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise “Zamani girebilirsiniz” deyiniz.

        //Example 1: If the date you have received from the user is in the past, give the message “You have entered an invalid date”.
        //If the date you have received from the user is in the future, say “You can enter the time”.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen verilen sırada tarih bilgisini alt alta giriniz. yıl - ay - gün");

        System.out.println("Lütfen yılı giriniz");
        int year = input.nextInt();

        System.out.println("lütfen ayı giriniz");
        int month = input.nextInt();

        System.out.println("Lütfen günü giriniz");
        int day = input.nextInt();


        //kullanıcıdan alınan verilerle bir tarih oluşturalım

        LocalDate givenDate = LocalDate.of(year,month,day);

        if (givenDate.isBefore(LocalDate.now())){//kullanıcının girdiği tarih şu andan önceyse
            System.out.println("Geçersiz tarih girdiniz");
        } else {
            System.out.println("Zamanı girebilirsiniz");
        }











    }
}
