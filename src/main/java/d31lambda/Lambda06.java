package d31lambda;

import java.util.stream.IntStream;

public class Lambda06 {
    public static void main(String[] args) {

        //int sum = getSumFromSeventoSeventy();
        //System.out.println(sum);//2464
        //System.out.println(getSumFromSeventoSeventy());//2464 sout da da yazdırabiliriz böyle

        //System.out.println(getMultiplicationFromThreeToNine1());//181440

        //System.out.println(getMultiplicationFromThreeToNine2());//181440

        //System.out.println(getFactorial(9));//362880 -> 9! = 362880 oldu yani
        //System.out.println(getFactorial(0));//1
        //System.out.println(getFactorial(-3));//geçersiz data girdiniz (-1)

        System.out.println(getSumsOfBetweenTwoInteger(5, 12));//24
        System.out.println(getSumsOfBetweenTwoInteger(12, 5));//0 yer değiştirmede if döngüsü kurduk //24

    }//main disi

    //---------------------
    //1) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.
    //1) Write the code that returns the sum of all integers from 7 to 70

    public static int getSumFromSeventoSeventy(){

        /*
        a) IntStream - primitive int değerleri üzerinde ardışık işlemler yapmayı sağlar.(LongStream, DoubleStream'de var)
        b) range - Belirtilen başlangıç (dahil) ve bitiş değerleri (haric) arasında ardışık sayıları
        temsil eden bir akış oluşturur.
        c) rangeClosed - Belirtilen başlangıç (dahil) ve bitiş değerleri (dahil) arasında ardışık sayıları
        temsil eden bir akış oluşturur.
        d) addExact - tam ekle - İki int veya long değerini toplar. Math class'tadir.
        e) getAsInt - OptionalInt sınıfında bulunan bir metottur.Eğer bir değer mevcutsa bu değeri döndürür.(IntStream kullaninca bunu kullaniriz)
        Eğer bir değer mevcut değilse bir NoSuchElementException hatası fırlatır.
        */

        return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();//getAsInt liste boşsa exceptionu önler
        //exact li olanlar taşma kontrolu yapar exception un önüne geçer



    }

    //---------------------
    //2)  3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    //2) Create a method that multiplies all integers from 3 to 9.

    //1.yol:
    public static int getMultiplicationFromThreeToNine1(){

        //multiplyExact - İki int veya long değerini çarpar. Math class’tadir
        return IntStream.rangeClosed(3, 9).reduce(Math::multiplyExact).getAsInt();

    }

    //2.yol:
    public static int getMultiplicationFromThreeToNine2(){

        //multiplyExact - İki int veya long değerini çarpar. Math class’tadir
        return IntStream.range(3, 10).reduce(Math::multiplyExact).getAsInt();

    }

    //3)Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.
    //3)Write the code that calculates the factorial of the given number.

    public static int getFactorial(int x){

        //3! = 1 * 2 * 3 = 6//akışta sıralı işlemler olduğu için intString kullanıyoruz
        //0! = 1
        //Negatif sayıların faktöriyeli yoktur

        //return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();//tek parametreli old için opşınıl verdi getAsInt ile düzelttim

        if (x == 0) {
            return 1;
        } else if (x < 0) {
            System.out.println("geçersiz data girdiniz");
            return -1;//returnn istiyor kabul olması için -1 dedik
        } else {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();//tek parametreli old için opşınıl verdi getAsInt ile düzelttim
        }

    }

    //-------------------------
    //4)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    //baslangic ve bitis dahil degil.
    //4)Write the code that gives you the sum of all even numbers between two given integers.
    //beginning and ending are not included.

    public static int getSumsOfBetweenTwoInteger(int a, int b){

        //yer degistirme algoritmasi
        if (a > b){

            int temp = a;
            a = b;
            b = temp;
        }



        return IntStream.range(a + 1, b).filter(Utils::isNumberEven).sum();//sum() toplama yapar
        //çift sayıları kontrol eder .filter(Utils::isNumberEven)//class method kullamını yapıldı



    }




}
