package d13array;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {



        //Ornek 1: int turunde ages isminde bir Array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //      bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.

        //Example 1: Create an Array of type int called ages and place 6 elements in it,
        // display the sum of the smallest and the largest of these elements



        int[] ages = new int[6];

        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages)); //[20,23,19,44,15,32]


    /*    // 1.yol
        Arrays.sort(ages);// short arrays clasının metodu sıralama yöntemi short küçükten büyüğe sıralar
        //arraylar class değil objedir
        System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]

        System.out.println(ages[0] + ages[ages.length -1]);//59
*/
        //-----------------------------
        //max min sorularında 0 index en küçügü ve en büyüğü kabul edilir.
        // hiç değişmicek bir index var o da 0 index idir
        // 2. yol

        int minimum = ages[0];
        int maksimum = ages[0];

        for (int w : ages){//w cok kullanılıyor o yüzden yazdım çoklu veri ages de buyüzden ages yazdım

            minimum = Math.min(minimum, w); //math kılası matematik kılasıdır yazınca metodları verir.
            maksimum= Math.max(maksimum, w);
        }
        System.out.println(minimum);//15
        System.out.println(maksimum);//44
        System.out.println(minimum + maksimum);//59















    }
}
