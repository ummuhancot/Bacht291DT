package d28exception_enum;

public class E05 {
    public static void main(String[] args) {

        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?
        int a = 12;
        int b = 2;//a
        //int b = 1;//StringIndexOutOfBoundsException
        //int b = 0;//ArithmeticException
        String s = "My Java";
        //getCharFromString(s, a, b);
        getCharFromString2(s, a, b);


    }//main dışı

    //1.yol:
    public static void getCharFromString(String s, int a, int b){

        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Sıfıra bölme yapılamaz " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index kullandiniz " + e.getCause());
        }
    }
    //-------------------
    //2.yol: Tum exception turlerini tek bir catch’te yakalamak icin “Exception” adli parent kullanilir
    public static void getCharFromString2(String s, int a, int b){

        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (Exception e) {//genel exceptinları gösterir
            System.out.println("Bir istisna oluştu" + e.getClass());//getClass ile exception türünü görebiliriz
            //Bir istisna oluştuclass java.lang.StringIndexOutOfBoundsException
            //Bir istisna oluştuclass java.lang.ArithmeticException
        }
    }


}
