package d31lambda;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {

        //Ornek: Rastgele sayi ureten bir method olusturunuz.
        //Example: Create a method that generates random numbers.

        Supplier<Double> randomSupplier = () -> Math.random();//parantez acıp kapamak bir değer almama anlamına gelir
        System.out.println("Random number: " + randomSupplier.get());

        Supplier<Integer> contantNumber = () -> 421124556;//her cağırdığımız da aynısı döner
        System.out.println(contantNumber.get());







    }
}