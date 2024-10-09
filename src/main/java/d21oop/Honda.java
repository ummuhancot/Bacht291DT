package d21oop;

public class Honda extends Car {


    public String model = "Civic";
    public int year = 2023;


    //super cağrısı perınta yapılır
    //this cağrısı kendisine yapılır
    //yani parantez constructer demek objedeki parantezden cagri yapabilir.

    public Honda() {
        System.out.println("super.model = " + super.model);
        System.out.println("this.year = " + this.year);
        //super();
        System.out.println("Civic");
    }
    public Honda(String model){ //2
        //super("Sport");
        super();
        System.out.println("Accord");
    }

}
//super();super cagrısı görünür yapıldı parametresiz olanları cağırdı
//her zaman ilk satır da yazılır
//süper icine girilen parametreler hangi constructor u secicemizi belirler
