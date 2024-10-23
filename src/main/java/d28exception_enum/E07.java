package d28exception_enum;

public class E07 {
    public static void main(String[] args) {

        //6) IllegalArgumentException, bir metodun geçersiz bir argüman aldığında oluşan bir hata türüdür.
        printAge(25);//25
        printAge(-3);


    }

    //Girdigimiz yasi konsola yazdiran bir method olusturalim
    /*public static void printAge(int age){
        System.out.println(age);
    }*/
    //printAge(-3); -3 giremeyiz şeklinde tanımladık
    public static void printAge(int age){
        if (age < 0){
            throw new IllegalArgumentException("Yaşı negatif girmeyiniz");
        } else {
            System.err.println(age);
        }
    }




}
