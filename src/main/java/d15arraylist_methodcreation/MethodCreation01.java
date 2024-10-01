package d15arraylist_methodcreation;

public class MethodCreation01 {


    // ornek 1: Toplama yapan bir method olusturunuz.
    // Example 1: Create a method that performs addition
    public static double sum1(double x, double y){
        return x + y;

    }

    public static void main(String[] args) {

      /*Java da Method Olusturma: Java'da bir metot (örneğin main metodu) içinde başka bir metot tanımlanamaz.
        Ancak bir metod içinde (mesela main), bir iç Class (nested class veya inner class) tanımlanabilir
        ve bu iç class'in içinde metotlar tanımlanabilir. Ancak LocalInnerClass yalnızca main metodu içinde
        geçerli ve erişilebilir olduğu için, main dışında bir yerde kullanılamaz. */

        //method oluşturucağız

        /* Method Creation - Metot Olusturma
        Java'da method nasil olusturulur?

        1- main method'un disinda, class'in icinde olusturulur
        2- Syntax'i: Access Modifier + Return Type(void de olur data tipide olur) + Method ismi + () + {}
        3- Olusturulan method nasil kullanilir?
          Main icinden method cagrisi yapilmalidir. Buna Method Call denir.
        */

        //method call
        int result =sum(3, 5);//altta ki main--- //---arguman denir
        System.out.println(result);//8
        double result1 = sum1(3.33,5.55);//üstteki main
        System.out.println(result1);//


    }//main disi

    // ornek 1: Toplama yapan bir method olusturunuz.
    // Example 1: Create a method that performs addition

    //1- main metodunda sum(3, 5) çağrısında 3 ve 5 değerleri argümanlardır.
    //2- sum metodunun tanımında a ve b parametrelerdir.


    public static int sum(int a, int b){ //parametre denir buraya
        return a + b;
    }







}
