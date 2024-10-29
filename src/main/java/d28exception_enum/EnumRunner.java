package d28exception_enum;

import d22oop.Civic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        //Cities c = new Cities(); HATA- enum'dan object uretilemez

        //1- Enum daki bir sabite nasil ulasabiliriz?

        Cities il = Cities.AMASYA;
        System.out.println(il);//AMASYA

        //2- BURSA sabitinin ismine ulasalim
        String ilIsmi = Cities.BURSA.getCityName();
        System.out.println(ilIsmi);//Bursa

        //3- Ankara’nin posta koduna ulasalim
        String ilPostaCode = Cities.ANKARA.getPostalCode();
        System.out.println(ilPostaCode);//06000
        System.out.println(Cities.ANKARA.getPostalCode());//06000

        //4- Antalya’nin plaka koduna ulasalim
        System.out.println(Cities.ANTALYA.getPlateCode()); //7

        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin
        //values() methodu enum icindeki tum datalari bir Array icinde bize verir

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen plaka kodu giriniz");
        int plaka = input.nextInt();

        Cities[] sehirler = Cities.values();
        //System.out.println(sehirler); Dogrudan yazdırılmıyor
        System.out.println(Arrays.toString(sehirler));

        //enam yapısını doğrudan döngüye sokulabilir mi

        //güvenlik önlemi
        if (plaka < 1 || plaka > 81){
            System.out.println("Lütfen 1 ile 81 arası bir plaka kodu giriniz");
        } else {
            for (Cities w : sehirler){
                if (plaka == w.getPlateCode()){
                    System.out.println("Girmiş oldugunuz plaka " + w.getCityName() + "İline aittir");
                    break;
                }
            }
        }












    }
}
