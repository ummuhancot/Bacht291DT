package d16methodcreation_overloading_varargs_passbyvalue;

public class CarRunner {
    public static void main(String[] args) {

        //4- Car class’indan bir object uretelim

        Car c1 = new Car();//eşttirin sağ tarafı kınstıraktırdır.parametresizdir () bir şey yazılmamış yani
        System.out.println(c1.brand);//Hondo --kalıptan ilk araba ortaya cıktı
        System.out.println(c1.model);//Accord
        System.out.println(c1.year);//2023
        System.out.println(c1.hybird);//true

        c1.action();//Hondahizli hareket eder
        c1.stop();//Hondagüvenli bir sekilde durur

        //5- Car class’a donup, constructor olusturalim














    }
}
