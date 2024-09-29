package d11loops;

public class ForLoops01 {
    public static void main(String[] args) {



        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz.
        //example 1: Print the sum of the digits of a given integer to the console

        //           578 ==> 5+7+8=20 ==> Output 20 olmali

        int sum = 0;//toplamada etkisiz eleman 0 olduğu içinn 0
        for (int i = 578; i > 0; i = i / 10) { // i /= 10;//for döngüsünün içinde birden fazla değişken tanımlayabilirsiniz.

            sum = sum + i % 10;

        }
        System.out.println("sum = " + sum); //sum = 20

        //-----------------------
        System.out.println("---------------------");


        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz.
        //Example 2: Write the code that returns the non-repeating characters in a String.
        // Yusuf ==> Ysf

        String t = "Yusuf";
        //          01234
        String unique = "";

        for (int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);//index verdik, bize harfi verecek
            //          4             4
            if (t.indexOf(ch)== t.lastIndexOf(ch)){
                unique = unique +ch;
            }


        }
        System.out.println("unique = " + unique);//tekrarsız : Ysf






    }
}
