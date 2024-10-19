package d26maps_exceptions;

import java.util.HashMap;
import java.util.Map;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ali", 18);
        stdAges.put("Can", 19);
        stdAges.put("Tom", 33);
        stdAges.put("Veli", 63);
        stdAges.put("Ahmet", 41);
        stdAges.put("Ummuhanı", 27);

        stdAges.put("Tom", 35);
        System.out.println(stdAges);//{Ummuhanı=27, Can=19, Ahmet=41, Tom=35, Veli=63, Ali=18}

        //----------------
        //1) replace() methodu, value'lari key'leri kullanarak update etmeye yarar
        //Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.

        stdAges.replace("Tom", 39);//-->put la yapıcamızı replace ile de yapabiliriz
        System.out.println(stdAges);//{Ummuhanı=27, Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}

        //--------------------
        //2) replace() methodu, eski deger kontrolu yaparakta calisir

        stdAges.replace("Tom", 21, 45);//eski değer 21 ise 45 yap 21 değilse aynı bırakır.//doğrulama için güzel bir kod
        System.out.println(stdAges);//Degişiklik olmayacak çünkü eski değer 21 değil.//{Ummuhanı=27, Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}

        stdAges.replace("Tom", 39 ,45);//eski değer 39 ise 45 yap 39 aynıysa 45 yap
        System.out.println(stdAges);//Değişiklik olacak çünkü eski değer 39.//{Ummuhanı=27, Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}

        //--------------------
        //3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map’te yoksa Map’e ekler.
        // Key Map’te zaten varsa, metodun hiçbir etkisi olmaz.

        stdAges.putIfAbsent("Tom", 77);//Tom olduğu için key ve velyou eklemedi
        System.out.println(stdAges);//{Ummuhanı=27, Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}
        //Tom key'i map'te oldugu icin "Tom", 77'yi eklemedi

        stdAges.putIfAbsent("Ayşe", 23);//Ayşe yoksa ayşe ve yaşının ekliyor kev ve velyou ekledi olmadığı için
        System.out.println(stdAges);//{Ummuhanı=27, Can=19, Ahmet=41, Ayşe=23, Tom=45, Veli=63, Ali=18}
        //Ayse key'i map'te olmadigi icin "Ayse", 23 eklendi

        //------------
        //4- get() ve getOrDefault() method’lari eger aranan eleman map’te var ise, ikisi de ayni isi yapar
        //key verirsiniz, size value verir. Ancak getOrDefault() metodu, anahtar bulunamadığında
        // bir varsayılan değer sağlama avantajına sahiptir.

        System.out.println(stdAges.get("Tom"));//45
        System.out.println(stdAges.getOrDefault("Tom", 18));//Tom map'te var tomun orijinal değerini verdi//45

        System.out.println(stdAges.get("Jerry"));//null//jeri yok null atadı
        System.out.println(stdAges.getOrDefault("Jerry", 18));//default döndürdü //18

        //---------------
        //5)containsKey() metodu, Map’te bir key olup olmadığını kontrol eder.
        //containsValue() metodu ise, Map’te bir value olup olmadığını kontrol eder.
        //Boolean return ederler
        System.out.println(stdAges);
        //{Ummuhanı=27, Can=19, Ahmet=41, Ayşe=23, Tom=45, Veli=63, Ali=18}
        Boolean b = stdAges.containsValue(19);//stok kontrolü böyle yapılır
        System.out.println("b:"+b);//true
        System.out.println(stdAges.containsKey("TOM"));//false, büyük kücük harf duyarlı
        System.out.println(stdAges.containsKey("Tom"));//true

        //--------------BÜYÜK küçük harrfe duyarsız yapma
        Map<String, Integer> stdAges2 = new HashMap<>();
        stdAges2.put("Tom".toLowerCase(), 25);
        System.out.println(stdAges2);//{tom=25}
        boolean b1 = stdAges2.containsKey("TOM".toLowerCase());
        System.out.println(b1);//true
        boolean b2 = stdAges2.containsKey("TOM");
        System.out.println(b2);//false

        //-------------------ek bilgi https://emojipedia.org/
        String emoji = "\uD83D\uDE0A";//https://emojipedia.org/ adresinden yuni cod olarak alıp yapıştırdım
        String emoji1 = "\uD83D\uDC26";//https://emojipedia.org/ adresinden yuni cod olarak alıp yapıştırdım
        System.out.println("emoji : " + emoji);
        System.out.println(emoji1);











    }
}
