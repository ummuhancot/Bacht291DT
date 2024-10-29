package d31lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {//koşul veri saklama turue false  üretir kullanılır
    public static void main(String[] args) {


        //Ornek: Verilen listteki cift sayilari yazdiran bir method olusturunuz
        //Example: Create a method that prints even numbers in the given list

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        Predicate<Integer> isEven = x -> x % 2 == 0;

        List<Integer> evens = numbers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(evens);//[2, 4, 6]


    }
}
