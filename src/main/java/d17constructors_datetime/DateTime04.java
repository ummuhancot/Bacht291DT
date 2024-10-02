package d17constructors_datetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime04 {
    public static void main(String[] args) {

        //HATIRLATMA return methotları sonlandırır.

        //ornek 1: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.
        //example 1: Write the code that takes the date of birth from the user and finds the day name of the date entered.


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen verilen sıradazdoğum tarihini bilgisini alt alta giriniz. Yıl ay gün");

        int y =input.nextInt();//year ın y si
        int m =input.nextInt();//monht un m si
        int d = input.nextInt();// day ın d si

        LocalDate date = LocalDate.of(y,m,d);
        System.out.println(date.getDayOfWeek());//haftanın gününü getirir
       /*1997
        09
        27
        //-->SATURDAY*/





    }
}
