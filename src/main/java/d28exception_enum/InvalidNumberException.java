package d28exception_enum;

public class InvalidNumberException extends RuntimeException{//run time de exception olur

    //Bir okuldaki ogrenci sayisi negatif olamaz senaryosu uzerinden gidelim.
    //Let's go through the scenario that the number of students in a school cannot be negative


    public InvalidNumberException(String message) {
        super(message);
    }
}