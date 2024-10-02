package d17constructors_datetime;

public class CarRunner {
    public static void main(String[] args) {

        //4- Car class’indan bir object uretelim

        //9- Default Car() icine parametre girelim

        //Car c1 = new Car();//eşttirin sağ tarafı kınstıraktırdır.parametresizdir () bir şey yazılmamış yani
        Car c1 = new Car("BWM", "3.20", 2024, false);
        System.out.println(c1.brand);//Hondo --kalıptan ilk araba ortaya cıktı
        System.out.println(c1.model);//Accord
        System.out.println(c1.year);//2023
        System.out.println(c1.hybird);//true

        c1.action();//Hondahizli hareket eder
        c1.stop();//Hondagüvenli bir sekilde durur

        //5- Car class’a donup, constructor olusturalim

        //10- Baska bir object uretelim ve direkt objeyi yazdiralim
        Car c2 = new Car("Audi", "A4", 2018, false);
        System.out.println(c1);//reference alındı d17constructors_datetime.Car@4c873330
        // 12-to String oluşturduktan sonraCar{brand='BWM', model='3.20', year=2024, hybird=false} yazdırdı
        System.out.println(c2);//reference alındı d17constructors_datetime.Car@119d7047
        // 12-to String oluşturduktan sonra Car{brand='Audi', model='A4', year=2018, hybird=false}


        //11- Reference durumunu duzeltmek icin Car class’a tostring methodu ekleyelim
        //Java’da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için kullanılır.

        //16- Yeni bir object uretelim
        Car c3 = new Car("Tofas", "Sahin");
        System.out.println(c3);//Car{brand='Tofas', model='Sahin', year=2023, hybird=true}






    }
}
