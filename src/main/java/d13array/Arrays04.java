package d13array;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {


        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz(Interview Sorusu)
        //Example 4: In the array [0, 2, 3, 0, 12, 0], place all zeros at the end.


        //     [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        // boş olan yerlere 0 atandı index old için
        // boş olan yerlere null atar strink olduğu için

        int[] arr = {0, 2, 3, 0, 12, 0};
        int[] newarr = new int[arr.length];// ilk arr nin length ini aldık dinamik çalışması icin sayı yazmadık

        System.out.println(Arrays.toString(arr));//[0, 2, 3, 0, 12, 0]
        System.out.println(Arrays.toString(newarr));//[0, 0, 0, 0, 0, 0]

        int firstIndex = 0;//ilk index 0 olduğu için 0//index'lere yukleme yaptikca bunu 1 artiracagiz ki aynı yere yazıp durmasınlar

        for (int w : arr){// gelen sayı w nin içinde

            if (w != 0 ){
                newarr[firstIndex]=w;//bos array ın ilk index ine sıfır olmayan sayıyı yükledik
                firstIndex++;//ilk index e yükleme yapıldığı için bir sonraki 0 harici sayı ilk index e yüklenmesin diye 1 arttırdık.
            }

        }

        System.out.println(Arrays.toString(newarr));//[2, 3, 12, 0, 0, 0]




    }
}
