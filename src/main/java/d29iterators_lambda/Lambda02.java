package d29iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10));
        printSquareOfOddElements(nums);//9 25 121 teklerin karesi alındı


    }//main dısı


    //ornek 1: Bir tamsayı listesi alan ve listedeki tek sayıların karelerini,
    //aynı satırda, aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)
    //example 1: Create a method that takes a list of integers and prints the squares
    // of the odd numbers in the list on the same line with a space between them.(Functional)

    //map(): Elemanları dönüştürmek için kullanılır.

    public static void printSquareOfOddElements(List<Integer> nums){
        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
        //nums.stream().filter(t -> t % 2 != 0).map(t -> (int) Math.pow(t, 3)).forEach(t -> System.out.print(t + " "));//Math.pow la kare alma
    }

    //javda doğrudan karesini alan method var mı ?
    /*Java'da doğrudan bir sayının karesini almak için özel bir method yoktur, ancak Java'nın `Math`
    sınıfındaki `Math.pow()` methodunu kullanarak bir sayının karesini alabilirsiniz.
    Bir sayının karesini almak için `Math.pow()` metodunu şu şekilde kullanabilirsiniz:
    double kare = Math.pow(sayi, 2);
    Ancak, bir sayının karesini almak için sadece sayıyı kendisiyle çarpmak genellikle daha verimli olur:
    int sayi = 5;
    int kare = sayi * sayi;
    System.out.println(kare);  // 25 çıktısını verir
    Yani, küçük işlemler için basitçe çarpma işlemi yapmak daha yaygın ve hızlıdır.
     */

}
