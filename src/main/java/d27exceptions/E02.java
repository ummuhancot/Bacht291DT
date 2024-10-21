package d27exceptions;

public class E02 {
    public static void main(String[] args) {

        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur
        //tırnaklalrı kaldırıp inte dönüştürmemiz lazım
        //String s = "1234";
        String s = "1234a";//run time exception olur
        convertStringToInt(s);



    }//main dişi

    public static void convertStringToInt(String s){
        //int intS = Integer.valueOf(s);
        //System.out.println(intS + 1);//dönüşüp dönüşmediğini görmek için + 1  ekledik
        try {//hata beklenen kod yazılır
            int intS = Integer.valueOf(s);
            System.out.println(intS + 1);

        } catch (NumberFormatException e){
            System.out.println("Dönüşüm için rakam dışı karakter kullanmayınız : " + e.getMessage());
        }

    }


}
