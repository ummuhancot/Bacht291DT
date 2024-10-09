package d21oop;

public class Dog extends Mammal {

    public void bark(){
        System.out.println("Dogs bark . . .");
    }

    @Override //Anotation kodun okunurlugunu arttırır zorunlu degil yazılması tavsiye edilir kendimize göre daha uygun hale getirme
    //perinttakini alıp
    public void eat() {//Animals dan alıp geldim
        //System.out.println("Animals eat . . .");
        System.out.println("Dogs eat . . .");

    }
    //Herkes Cat class'ta feedWithMilk() methodunu override etsin? ÖDEVVV

    //--------------------//////--------------------
   // @Override
//    public Dog create1 () {
//        return new Animal();
//    }
    //downcasting - java otomatik yapmaz

    @Override
    public Animal create (){
        return new Dog();//Upcasting - java otomatik yapar - dog child di perintı Animal yukarının kalıbına dök demek
        //chihd parent inin data tipini kullanabilir - cocugun babasının data tipini kullanmasına upcasting denir.
        //downcasting - java otomatik yapmaz
    }


    @Override
    public int add(int a, int b){//int --> long yapabiliriz
        //pirimitive ler arasında parent-child ilişkisi yoktur
        //yani primitivelerde return type değiştirilemez
        return a + b;
    }

}
