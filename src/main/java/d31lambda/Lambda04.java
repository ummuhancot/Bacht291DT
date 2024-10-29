package d31lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda04 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

        //printElementsExceptStartsWithE(myList);
        //printDistinctElementLengthLessThanFive(myList);
        //List<String> donusList = getElementLengthMoreThanFiveWithUpperCase(myList);
        //System.out.println(donusList); //[ZEYNEP, MUSTAFA]
        //printElementsLengthLessThanFiveUniqueLowerCase(myList);
        //printElementsUniqueToUpperCaseSorted(myList); //ALİ ELİF MUSTAFA YUSUF ZEYNEP
        printElUniqueLowerCaseSortWithLength(myList);


    } //main disi

    //---------------------
    //ornek 1: Bir listedeki "E" harfiyle başlamayan tüm öğeleri konsola yazdıran bir yöntem oluşturun.
    //example 1: Create a method that prints to the console all items in a list that do not start with the letter "E".

    public static void printElementsExceptStartsWithE(List<String> myList) {

        myList.stream().filter(t -> !t.startsWith("E")).forEach(t -> System.out.print(t + " ")); //Ali Yusuf Zeynep Mustafa

    }

    //---------------------
    //ornek 2: Bir List<String> içinde karakter sayısı 5'ten az olan tüm benzersiz (tekrarsız)
    // elemanları konsola yazdıran bir metod yazınız.
    //example 2: Write a method that prints all unique (non-repetitive) elements with less
    // than 5 characters in a List<String> to the console.

    public static void printDistinctElementLengthLessThanFive(List<String> myList) {

        myList.stream().distinct().filter(t -> t.length() < 5).forEach(t -> System.out.print(t + " ")); //Ali Elif

    }

    //---------------------
    //Örnek 3:Bir List<String> içinde karakter sayısı 5'ten fazla olan tüm elemanları büyük harfe çevirip,
    // bu elemanları yeni bir liste olarak döndüren bir metod yazınız.
    //Example 3:Write a method that converts all elements with more than 5 characters in a
    // List<String> to uppercase and returns these elements as a new list.

    public static List<String> getElementLengthMoreThanFiveWithUpperCase(List<String> myList) {

        //collect(Collectors.toList()) - Java'nın Stream API'sindeki bir işlemdir.
        // Bu işlem, bir stream'de işlenmiş olan elemanları bir listeye toplar.

 /*       return myList.
                stream().
                filter(t -> t.length() > 5).
                map(t -> t.toUpperCase()).
                collect(Collectors.toList());*/

        return myList.
                stream().
                filter(t -> t.length() > 5).
                map(String::toUpperCase).
                collect(Collectors.toList());

    }

    //---------------------
    //Örnek 4:Bir List<String> içinde karakter sayısı 5'ten az olan tüm benzersiz elemanları
    // küçük harflere çevirip doğal sıralamaya göre konsola yazdıran bir metod yazınız.
    //Example 4: Write a method that converts all unique elements with less than 5 characters
    // in a List<String> to lowercase letters and prints them to the console according to their natural order.

    public static void printElementsLengthLessThanFiveUniqueLowerCase(List<String> myList) {

/*        myList.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                map(t -> t.toLowerCase()).
                sorted().forEach(t -> System.out.print(t + " ")); //ali elif*/

        myList.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                map(String::toLowerCase).
                sorted().forEach(t -> System.out.print(t + " ")); //ali elif

    }

    //---------------------
    //Örnek 5:Bir List<String> içindeki tüm elemanları benzersiz hale getirip, büyük harflere dönüştürdükten
    // sonra alfabetik sıraya göre konsola yazdıran bir metod yazınız.
    //Example 5: Write a method that makes all the elements in a List<String> unique,
    // converts them to uppercase letters, and prints them to the console in alphabetical order.

    public static void printElementsUniqueToUpperCaseSorted(List<String> myList) {

        myList.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(t-> System.out.print(t + " "));

    }

    //---------------------
    //Örnek 6:Bir List<String> içindeki tüm elemanları önce benzersiz hale getirin, ardından küçük harflere çevirin
    // ve elemanların uzunluklarına göre küçükten büyüğe sıralayarak konsola yazdıran bir metod yazınız.
    //Example 6: First make all the elements in a List<String> unique, then convert them to lowercase letters and write
    // a method that sorts the elements from smallest to largest according to their length and prints them to the console.

    public static void printElUniqueLowerCaseSortWithLength(List<String> myList) {

        //Comparator.comparing(): Comparator sınıfında bulunan comparing metodu,
        // belirtilen bir fonksiyona göre karşılaştırma yapmak için bir karşılaştırıcı (comparator) oluşturur.

        //sorted(Comparator.comparing(t->t.length())) ifadesi, stream içindeki elemanları uzunluklarına
        // göre artan sırayla sıralar. Eğer ters sıralama istenirse, reversed() metodu eklenerek
        // sorted(Comparator.comparing(String::length).reversed()) şeklinde kullanılabilir.

        myList.
                stream().
                distinct().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length)).
                //forEach(t -> System.out.print(t + " ")); //ali elif yusuf zeynep mustafa
                forEach(Utils::printInTheSameLineWithSpace);//ali elif yusuf zeynep mustafa

    }



}