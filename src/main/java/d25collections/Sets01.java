package d25collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {

        //Interview Sorusu
        //Ornek 1 : Ogrenci email adreslerini natural order’da siralanmis olarak depolayiniz.
        //Interview Question
        //Example 1 : Store student email addresses in natural order.
        long t1 = System.nanoTime();//performans ölçümü için yazılırmış
        //----------------------
        //1.yol: Yavas - Her adimda siralama yapar

        TreeSet<String> emails = new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("l@gmail.com");
        emails.add("u@gmail.com");
        emails.add("p@gmail.com");
        emails.add("g@gmail.com");
        emails.add("b@gmail.com");
        emails.add("t@gmail.com");
        emails.add("x@gmail.com");
        System.out.println(emails); //


        //TreeSet'ler cok yavas, biraz hizlandirabilir miyiz?
        //Elemanlari eklerken en hizli olandan (HashSet) yardim alalim.

        long t2 = System.nanoTime();
        //-------------------
        //2.yol Daha hızlı - tavsiye edilir.
        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("k@gmail.com");
        emailsHs.add("a@gmail.com");
        emailsHs.add("z@gmail.com");
        emailsHs.add("l@gmail.com");
        emailsHs.add("u@gmail.com");
        emailsHs.add("p@gmail.com");
        emailsHs.add("g@gmail.com");
        emailsHs.add("b@gmail.com");
        emailsHs.add("t@gmail.com");
        emailsHs.add("x@gmail.com");
        System.out.println(emailsHs); // karışık sıralama yok
        //[b@gmail.com, k@gmail.com, g@gmail.com, t@gmail.com, x@gmail.com, p@gmail.com, z@gmail.com, u@gmail.com, a@gmail.com, l@gmail.com]

        //Bos bir TreeSet olusturalim ve constructor'ina HashSet'i yazalim yani veriyi boş treeSete aktarıcaz
        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);
        System.out.println(emailsHsTs);//[a@gmail.com, b@gmail.com, g@gmail.com, k@gmail.com, l@gmail.com, p@gmail.com, t@gmail.com, u@gmail.com, x@gmail.com, z@gmail.com]
        long t3 = System.nanoTime();

        System.out.println(t2 - t1);//319000 - Treeset - 262800
        System.out.println(t3 - t2);//116100 - HashSet - 275600
        //her çalıştırdığında etki yapar





    }
}
