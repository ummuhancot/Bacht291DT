package d30lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda04 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");


      ///  /**  @Params  */ JavaDoc deniyor araştır

        //printElementsExceptStartsWithE(myList);
        printDistinctElementLengthLessThanFive(myList);


    }///main dısı


    //ornek 1: Bir listedeki "E" harfiyle başlamayan tüm öğeleri konsola yazdıran bir yöntem oluşturun.
    //example 1: Create a method that prints to the console all items in a list that do not start with the letter "E".


    public static void printElementsExceptStartsWithE(List<String> myListt){

        myListt.stream().filter(t -> !t.startsWith("E")).forEach(t -> System.out.println(t + " "));//starstsWith başlıyorsa ! ile başlamıyorsa oldu
        System.out.println(myListt);

        /**
         Ali
         Yusuf
         Zeynep
         Mustafa
         [Ali, Elif, Yusuf, Elif, Zeynep, Mustafa]
         */
    }



    //ornek 2: Bir List<String> içinde karakter sayısı 5'ten az olan tüm benzersiz (tekrarsız)
    // elemanları konsola yazdıran bir metod yazınız.
    //example 2: Write a method that prints all unique (non-repetitive) elements with less
    // than 5 characters in a List<String> to the console.

    public static void printDistinctElementLengthLessThanFive(List<String> myListt){
        myListt.stream().distinct().filter(t -> t.length() < 5).forEach(t -> System.out.println(t + " "));

        /***
         Ali
         Elif
         */

    }


}
