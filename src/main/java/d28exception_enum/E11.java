package d28exception_enum;

public class E11 {
    public static void main(String[] args) {

        int a = 12;
        //int b = 4;
        int b = 1;
        //int b = 0;
        int[] c = {3, 5 , 7, 9};
        bring(c, a, b);
        //---- ben yaptım-----
        bring2("merhaba");
        // try + finally kullanilabilir.--program durur--hata düzeltilmiyor demek --düzelmiyorsunuz acil bir işi hallediyorsunuz
        //virüs bulaşmıs app durdurmak olur

    }


    public static void bring(int[] c ,int a, int b){

        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } finally {//her zaman çalışır

            System.out.println("Veritabanı baglantısı kesilmelidir");
        }

        System.out.println("filally sonrası app calişiyor");
    }

    //---ben yaptım----
    public static void bring2(String a){
        System.out.println(a);
    }


}
