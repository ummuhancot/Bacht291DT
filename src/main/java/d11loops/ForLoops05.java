package d11loops;

public class ForLoops05 {
    public static void main(String[] args) {

        //Ornek 2: Verilen sayıda ondalık kısımdaki rakamların toplamını bulunuz.
        //Example 2: Find the sum of the digits in the decimal part of the given number.
        //            28.587 ==> 5+8+7=20

        double num1 =28.587;

        String sNum1 = String.valueOf(num1);// 28.587 --> "28.587" string e çevirdim tırnaklı oldu
        String decimalPart1 = sNum1.split("[\\.]")[1];//"587" var //28. böldüm burası 0 ıncı taraf 587 bölümü 1. taraf
        int intDecimalPart1 = Integer.valueOf(decimalPart1);//587, unbaxing yaptı


        // -----------1. deste cözdüğümüz kısım

        int sum1 = 0;// toplamanın etkisiz elamanı 0 dır.

        for (int i = intDecimalPart1; i > 0; i = i / 10) { // i /= 10;//for döngüsünün içinde birden fazla değişken tanımlayabilirsiniz.

            num1 = num1 + i % 10;

        }
        System.out.println("sum = " + num1); //20

        // yukarda bi yanlışlık yaptım bilmiyorum
        //burası hocanın yaptığı kısım

        double num = 28.587;

        String sNum = String.valueOf(num); //"28.587"

        String decimalPart = sNum.split("[\\.]")[1]; //"587"

        int intDecimalPart = Integer.valueOf(decimalPart); //587 , unboxing

        //-----------------1.derste cozdugumuz kisim
        int sum = 0;

        for (int i = intDecimalPart; i > 0; i = i / 10) {
            sum = sum + i % 10;
        }
        System.out.println(sum); //20







    }
}
