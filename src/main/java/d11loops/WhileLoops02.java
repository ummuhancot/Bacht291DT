package d11loops;

import java.util.Scanner;

public class WhileLoops02 {
    public static void main(String[] args) {


        /*Ornek 1:  Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz.

         Example 1: Write the code that creates the multiplication table for the number given by the user and writes it to the console.

        3 ==> 3x1=3             3 - 4 - 5 - 6.... olabilir sutun ilki sabit
              3x2=6                            2. sutun değişken
              3x3=9
              3x4=12 …
              3x10=30*/

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek için bir sayı giriniz");
        int num = input.nextInt();

        int i = 1;

        while (i < 11){
            System.out.println(num + "x" + i + " = " + (num * i));
            //                  4  +  x  + 2.sutun + = 3* 2.sutun
            i++;
        }





    }
}
