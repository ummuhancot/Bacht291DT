package d27exceptions;

public class E05 {
    public static void main(String[] args) {

        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?
        int a = 12;
        int b = 3;//a
        //int b = 1;//StringIndexOutOfBoundsException
        //int b = 0;//ArithmeticException
        String s = "My Java";
        getCharFromString(s, a, b);


    }//main dışı

    public static void getCharFromString(String s, int a, int b){

        int idx = a / b;
        char ch = s.charAt(idx);
        System.out.println(ch);
    }

}
