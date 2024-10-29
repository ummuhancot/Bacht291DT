package d8stringmanipulations;

public class
StringManipulations01 {
    public static void main(String[] args) {


        //Ornek 1: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz.

        //replace() methodu, 2.parametredekini 1.nin yerine koyar.
        //Kucuk buyuk harfe duyarlidir

        String s = "Learn Java earn money";

        String s1 = s.replace("money", "dollar");
        System.out.println(s1); //Learn Java earn dollar

        //------------------
        //Ornek 2: "s" String'indeki tum "e" harflerini siliniz.


        String s2 = s.replace("e", ""); //"" hiclik
        System.out.println(s2);


    }
}
