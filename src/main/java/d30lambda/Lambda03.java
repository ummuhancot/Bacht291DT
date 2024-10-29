package d30lambda;

import java.util.*;

public class Lambda03 {
    public static void main(String[] args) {

        //List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 3, 5, 10, 11));
        //List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 3, 5, 11, 10));
        //List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 13));
        //List<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 11, 10));
        //List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10));
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 14, 10));//8

        //printCubeOfDistinctOddElements(nums);
        //printSumOfSquaresOfDistinctEvenElements(nums);//104
        //printProductOfSquareOfDistinctEvenElements(nums);//64

        //maksimum1(nums);//11
        //maksimum2(nums);//11
        maksimum3(nums);//11
        //maksimum4(nums);

        //minimum1(nums);//2
        //minimum2(nums);//2
        //minimum3(nums);//2
        //minimum4(nums);//2
        //minimum5(nums);//2
        //minimum6(nums);//2

        getMinGreaterThanSevenEven(nums);//10



    } //main disi

    public static void printCubeOfDistinctOddElements(List<Integer> nums) {

        nums.
                stream().
                distinct().
                filter(t -> t % 2 != 0).
                map(t -> t * t * t).
                forEach(t -> System.out.print(t + " ")); //27 125


        //3) Bir tamsayı listesindeki tek sayıların küplerini, tekrarlanmadan, aynı satırda,
        // aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)
        //3) Create a method that prints the cubes of odd numbers in a list of integers,
        // without repeating, on the same line, with spaces between them. (Functional)

        //distinct() metodu, bir akistaki tekrar eden ogeleri kaldirmak icin kullanilir


    }


    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums){

        int toplam = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);//0 toplamda etkisiz eleman o yüzden yazdık
        System.out.println(toplam);

        //--------------------
        //4)Bir listedeki tekrarlanmayan çift sayıların karelerinin toplamını hesaplayan bir method oluşturunuz.
        //4)Create a method that calculates the sum of squares of non-repeating even numbers in a list.

        //reduce()azaltmak: Koleksiyon elemanlarını tek bir değere indirger.
        //3+5=8

        //---------reduce un ayrıntılı çalışması
        //reduce(0, (t,u) -> t+u); deki 0 etkisiz elemandir. carpma olsa 1 koyardik
        //t: Şu ana kadar hesaplanmış olan ara toplam. İlk iterasyonda, bu değer başlangıç değeri olan 0’dır.
        //u: Ilk elemandir
        //(t,u) -> t+u: İki girdi alarak tek bir çıktı üreten bir lambda ifadesidir.

        //reduce(0, (t,u) -> t+u); deki 0 etkisiz elemandir. carpma olsa 1 koyardik
        //t: Şu ana kadar hesaplanmış olan ara toplam. İlk iterasyonda, bu değer başlangıç değeri olan 0’dır.
        //u: Ilk elemandir
        //(t,u) -> t+u: İki girdi alarak tek bir çıktı üreten bir lambda ifadesidir.

        //İlk iterasyonda:
        //t=0 (başlangıç değeri olarak belirtildiği için)
        //u=4 (ilk eleman)
        //t+u = 4

        //İkinci iterasyonda:
        //t=4 (önceki adımdan gelen sonuç)
        //u=100 (ikinci eleman)
        //t+u = 104

        /*Java'da method reference, lambda ifadelerine bir alternatif olarak sunulan bir özelliktir.
        Method reference, zaten tanımlanmış bir metodu doğrudan bir fonksiyonel arayüze atamak için kullanılır.
        Bu, bazen bir lambda ifadesinden daha okunabilir bir kod yazmamıza olanak tanır.*///(t, u) -> t + u --> Integer::sum nun yerine yazar
    }


    public static void printProductOfSquareOfDistinctEvenElements(List<Integer> nums){

        int carpım = nums.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(1, (t,u) -> t * u);
        System.out.println(carpım);
        //Math.multiplyExact(çarpma yapar) burda önermiyor çünkü method imzaları olmuyormus ondan

        //------------------------
        //5) Bir listedeki tüm tekrarlanmayan çift sayıların karelerinin çarpımını hesaplayan bir method oluşturunuz.
        //5) Create a method that calculates the product of the squares of all non-repeating even numbers in a list.

    }


    public static void maksimum1 (List<Integer> nums) {

        //---------------------------------
        //6)Verilen List'teki maksimum değeri bulmak için bir method oluşturun.
        //6)Create a method to find the maximum value in the given List

        //1.yol
        //Integer.MIN_VALUE: Bu, int tipinin alabileceği en küçük değeri verir (-2^31 dir)

    int max = nums.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);

    }

    //2.yol
    public static void maksimum2 (List<Integer> nums) {
                                                            //2, 3, 5, 11, 10
        int max = nums.stream().distinct().reduce(nums.get(0), (t, u) -> t > u ? t : u);//nums.get(0) 0 ıncı index e git demek karşılaştır demek
        System.out.println(max);

    }

    //3.yol
    public static void maksimum3 (List<Integer> nums) {

        //sorted(): Koleksiyonu belirli bir kritere göre sıralar.(naturel order. kucukten buyuge)

        Integer max = nums.stream().distinct().sorted().reduce((t, u) -> u).get();//tek parametreli kullanım yaptık
        System.out.println(max);
        //burda kullanmadık yine Integer e çevirdik int den.
        //optional değer var veya yok anlamına gelir, boş olabilir önlem al demek neden opşınıl alırım tek parametreli kullanımda verir
        //.get yapmalıyım ki Integer e çevirsindöndürür ve hata gider sonuc null dönebilir demek null değerlerle çalışırken
        //güvenlik önlemi için iyi bir değer.zorunlu değer kontrolü yaptırır.deger var mı yok mu demek.get() yani
        //optional döndürmek sonucun bulunamadığı anlamına gelir.
    }

    //4.yol : best practice
    public static void maksimum4 (List<Integer> nums){

        //Java'da :: işareti, "Method Reference" olarak adlandırılır.
        // Bir metodun doğrudan referansını alarak lambda ifadeleri yazmadan kullanmanızı sağlar.

        Integer max = nums.stream().distinct().reduce(Math::max).get();//optinoal dan Integere dönderdik .get ile       System.out.println(max);
        System.out.println(max);
    }


    public static void minimum1(List<Integer> nums){

        //7)Verilen List’teki minimum değeri bulmak için bir method oluşturun.
        //7)Create a method to find the minimum value in the given List

        //4.yol : best practice cözdüm
        Integer min = nums.stream().distinct().reduce(Math::min).get();//optinoal dan Integere dönderdik .get ile       System.out.println(max);
        System.out.println(min);

    }

    //1.yol
    public static void minimum2(List<Integer> nums){

        //2.yol gibi çizdük tek parametreli oldugunda option olur bunu önlemek için.get yaptık
        Integer min = nums.stream().distinct().reduce((t, u) -> t > u ? u : t).get();//optinoal dan Integere dönderdik .get ile       System.out.println(max);
        System.out.println(min);//11

    }

    //2.yol
    public static void minimum3(List<Integer> nums){

        Integer min = nums.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).//11,10,5,4,3,2
                reduce((t, u) -> u).get();//optinoal dan Integere dönderdik .get ile
                System.out.println(min);//2

        //sorted(Comparator.reverseOrder()) ifadesi,
        // Java Stream API'si içinde bir koleksiyonu ters sıralamak için kullanılır.
        //Comparator class, reverseOrder() methoddur.

    }


    //best practice
    //3. boş bi listede dene postinonal kontrolü böyle yapılırmış böylece exception fırlatmaz
    public static void minimum4(List<Integer> nums){

        /*Integer min = nums.stream().distinct().sorted().
                reduce((t, u) -> t).get();
        System.out.println(min);//2*/


        Optional<Integer> min = nums.stream().distinct().sorted().reduce((t, u) -> t);//nul dönme ihtimaline karşı önlem almaya başladık
        //liste filtrelemede eleman kalmadığı zaman önlem
        if (min.isPresent()){//isPersent mevcit mu deger var mı demek
            System.out.println(min.get());//.get() Intecer a dönüştürür
        } else {
            System.out.println("Liste bos veya minimum deger bulunamadi");
        }


    }

    //4.yol
    public static void minimum5(List<Integer> nums){

        int min = nums.stream().distinct().reduce((t, u) -> Math.min(t, u)).get();
        System.out.println(min);



    }

    //5.yol: Best Practice
    public static void minimum6(List<Integer> nums) {

        Optional<Integer> min = nums.stream().distinct().reduce(Math::min);
        System.out.println(min); //2

        if (min.isPresent()){//isPersent mevcit mu deger var mı demek
            System.out.println(min.get());//.get() Intecer a dönüştürür
        } else {
            System.out.println("Liste bos veya minimum deger bulunamadi");
        }

    }




    public static void getMinGreaterThanSevenEven(List<Integer> nums){

        //------------------
        //8) Verilen listedeki 7'den büyük en küçük çift sayıyı bulan bir yöntem oluşturun.
        //2, 3, 4, 5, 11, 10, 14 ==> 10 <-- 7’den buyuk en kucuk cift sayi
        //8) Create a method that finds the smallest even number greater than 7 in the given list.
        //2, 3, 4, 5, 11, 10, 14 ==> 10 <-- Smallest even number greater than 7


        //1.yol
        Integer min = nums.stream().filter(t -> t > 7 && t % 2 == 0).sorted().reduce((t, u) -> t).get();
        System.out.println(min);


        //2.yol
        //findFirst(): Sıralı akışta bulunan ilk elemanı (yani yani bu senaryo da en küçük elemanı) alır.
        // Bu işlem bir Optional döndürür, çünkü akışta hiç eleman kalmamış olabilir
        // (filtreleme nedeniyle veya başka bir sebepten dolayı)

        Integer min2 = nums.stream().filter(t -> t > 7 && t % 2 == 0).sorted().findFirst().get();
        System.out.println(min2);//10


    }











}