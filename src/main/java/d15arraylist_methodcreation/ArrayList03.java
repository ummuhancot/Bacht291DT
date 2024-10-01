package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //Ornek 1: Bir tane Integer List olusturunuz.Bu List’te birbirine en yakin iki tamsayiyi yaziniz.
        // Example 1: Create an Integer List.Write the two closest integers in this List.
        //      [12, 23, 10, 19] ==> 12 ve 10 birbirine en yakın tam sayıya bakıcaz

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);

        System.out.println(nums);//[12, 23, 10, 19]

        //küçükten büyüge sıralama demektir. 12, 23, 10, 19 --> sort()--> 10, 12, 19, 23
        // farklarını alsak 2, 7, 4 en kücak fark üzerinden sayıları bulur

        //1.yol--diger koleksiyonlarla da kullanılır
        //Collections.sort(nums);//kücükten büyüge sıralar colleksinlarla shor yapmayı öğretiyor

        //2.yol--ArrayList lerle kullanılır
        nums.sort(null);//buda kücükten büyüge sıralar--comparator u kullanır
        // --null ile özel bir sıralama yapmicam sen doğal neyse onusırala dedik

        System.out.println(nums);//[10, 12, 19, 23]

        //TimSort algoritmasi ikiside bu algoritmayı kullanır

        //------------------
        int minDiff = nums.get(1) - nums.get(0);//12 -10 = 2 //benser cözüm yolları
        for (int i = 1; i < nums.size() ; i++) {//i=1 cünkü büyükten küçügü cıkarıyoruz
            minDiff = Math.min(minDiff, nums.get(i)-nums.get(i-1));//(1,0) olmuş oldu

        }
        System.out.println(minDiff);//2 minimum farkı buldu. bu farkı hangi iki sayıdan
        //elde ettigimiz bulalim


        //---------------
        for (int i = 1; i < nums.size() ; i++) {
            if (nums.get(i) - nums.get(i-1) == minDiff) {
                System.out.println(nums.get(i) + " ve " + nums.get(i-1));//12 ve 10
            }
        }


        //ÖDEV: Bu soru tek for la veya for each la cözülebilir miydi?










    }
}
