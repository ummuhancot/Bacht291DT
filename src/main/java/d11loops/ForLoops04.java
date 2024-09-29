package d11loops;

import java.util.Scanner;

public class ForLoops04 {
    public static void main(String[] args) {

        /* Ornek 2:  Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz.
        Example 2:  Create the code that prints the following figure to the console.

              X X X X X     3 satır var
              X X X X X     5 sutun var tablo
              X X X X X    */

        int row =3;//satır
        int column=5;//sutun

        for (int i = 1; i <= row; i++){

            for (int k = 1; k <= column; k++){

                System.out.print("X ");//ln yi sildim alt alta yazdırdı.
            }
            System.out.println();//ustteki print yanyana yazdırır. pointeri bir alta aldık

        }

        // kullanıcıdan aldık bi tık geliştirdik.
/*
        Scanner input = new Scanner(System.in);

        System.out.println("Satır sayısını giriniz");
        int row01 = input.nextInt();

        System.out.println("Sutun sayısını giriniz");
        int column01 = input.nextInt();

        for (int i = 1; i <= row01; i++){

            for (int k = 1; k <= column01; k++){

                System.out.print("X ");//ln yi sildim yan yana yazdırdı.
            }
            System.out.println();//ustteki print yanyana yazdırır. pointeri bir alta aldık

        }*/

        /*Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        Homework: Draw the following figure using for-loop.

            *                   satır sayısı 4
            * *                 sutun sayısı değişken
            * * *                   i               k
            * * * *             1. satırda     1 sutun var
                                2. satır       2 sutun
        */

        //for loop kullanılarak çizilecek i kaçsa k da o oluyor sutunlarda yani satır kadar sutun çizicez

        System.out.println("-----------------");

        for (int i = 0; i <= row ; i++) {

            for (int j = 0; j<=i  ; j++) {
                System.out.print("X ");
            }
            System.out.println();
        }


    }
}
