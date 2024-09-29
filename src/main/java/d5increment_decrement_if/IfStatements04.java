package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {



        /*Ornek 1: Kullanicidan gun sayisini aldiginizda gun ismini yazan kodu yaziniz
          1==> Pazar, 2 ==> Pazartesi …*

        //*Example 1: When you receive the number of days from the user, write the code that writes the day name
          1==> Sunday, 2 ==> Monday …*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int num = input.nextInt();

        if (num <= 0) { //num < 1'de yazabilirdik
            System.out.println("Gun sayilari 1'den kucuk olamaz");
        } else if (num == 1) {
            System.out.println("Pazar");
        } else if (num == 2) {
            System.out.println("Pazartesi");
        } else if (num == 3) {
            System.out.println("Sali");
        } else if (num == 4) {
            System.out.println("Carsamba");
        } else if (num == 5) {
            System.out.println("Persembe");
        } else if (num == 6) {
            System.out.println("Cuma");
        } else if (num == 7) {
            System.out.println("Cumartesi");
        } else {
            System.out.println("Gun sayilari 7'den buyuk olamaz");
        }

        //double olarak değiştirirsek ne olur
        double numDouble = input.nextDouble();
        int num1 =(int) numDouble;

        if (numDouble != num1) {
            System.out.println("Lütfen bir tam sayı giriniz");
        } else {
            if (num1 <= 0) { //num < 1'de yazabilirdik
                System.out.println("Gun sayilari 1'den kucuk olamaz");
            } else if (num1 == 1) {
                System.out.println("Pazar");
            } else if (num1 == 2) {
                System.out.println("Pazartesi");
            } else if (num1 == 3) {
                System.out.println("Sali");
            } else if (num1 == 4) {
                System.out.println("Carsamba");
            } else if (num1 == 5) {
                System.out.println("Persembe");
            } else if (num1 == 6) {
                System.out.println("Cuma");
            } else if (num1 == 7) {
                System.out.println("Cumartesi");
            } else {
                System.out.println("Gun sayilari 7'den buyuk olamaz");
            }
        }

    }
}
