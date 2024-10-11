package d21oop;

import d21oop.Vehicle;

public class Car extends Vehicle {


    public String model = "Accord";
    public int year = 2024;



    public Car(){
       // super();//2
       this("Sport");
       System.out.println("sedan");
   }
    public Car(String tip) { //3
        super();
        //super("Honda", 2024, "Elektrikli");
        System.out.println("Sport");


    }
}
