package d27exceptions;

public class E03 {
    public static void main(String[] args) {

        //3) StringIndexOutOfBoundsException, bir String nesnesinin, karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.
        String s = "Java";
        //selectChar(s, 2);
        selectChar(s, 4);//StringIndexOutOfBoundsException


    }//main dişi

    public static void selectChar(String s, Integer idx){
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            //serr dedik
            System.err.println("Olmayan index kullanmayınız : " + e.getMessage());//olmayan index kullanmayın-önemli hataları kırmızıyla gösterir
            e.printStackTrace();//kod yazan hatayı girmek isterse yazar, exce[tion i gösterir ama fırlatmaz]--hata fırlatılmadan görmek istersek kullanılır---
        }
        System.out.println("App calişıyor");
    }





}
