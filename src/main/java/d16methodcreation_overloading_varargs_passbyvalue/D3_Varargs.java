package d16methodcreation_overloading_varargs_passbyvalue;

public class D3_Varargs {
    public static void main(String[] args) {

        //Variable arguments - Değişken sayida argümanlar


    int result = add(3,7,10);//20
        System.out.println(result);



    }//main disi

  /*  public static int add1(int a, int b){//2 sayı toplicakmış sonra fikri değişti
        return a + b;
    }
    public static int add1(int a, int b,int c){//3 sayı toplasın dedi sonra 4 dedi
        return a + b + c;
    }
*/
    public static int add(int... a){//3 nokta koydugunuzda java bunu varargs olarak kabul eder (... demek istediğin kadar sayı girebilirsin demek)

        int sum = 0;
        for (int w : a){
            sum = sum + w;
        }
        return sum;
    }                   //istediğim kadar sayıyı toplamış oldum for döngüsüyle(... üç noktaya varags denir)

    /* Varargs, bir methodun değişken sayıda argüman almasına izin veren bir özelliktir.
    Varargs, "variable arguments" yani "değişken sayıda argüman"ın kısaltmasıdır.

    Varargs, aşağıdaki kurallara tabidir:

    1- Birden fazla varargs kullanilamaz. Varargs parametre, her zaman son parametre olmalıdır.
    Yoksa veri tabani surekli veri kabul eder ve diger parametreye gecemez.
    2- Varargs arka planda Array yapisini kullanir
    3- Varargs parametre, bir primitive veri tipi veya non-primitive(referans) olabilir.
    4- Varargs parametre, aynı türdeki birden fazla argüman alabilir.
    5- Varargs parametre, sıfır argüman alabilir. main ici add(); olabilir*/

    /*public static int add(int... a, int... b){olmaz varags birden fazla kullanılmaz
    public static int add(int... a, int b ){olmaz sonra varagz kullanılamaz
    public static int add(int b, int... a){olur
    Array kullanır arka planda
    primitiv ve non-primitive olur
    aynı tür olmalı
    public static int add() ==> 0 döndürür hiç bir şey yazılmazsa

    }

    birden fazla varags olmaz */

}
