package d21oop;

public class Cat extends Mammal {//Doğrudan perintı nı yazdık
    public void meow(){
        System.out.println("Cats meow . . .");
    }

    @Override
    public  void  feedWithMilk(){
        //System.out.println("Mammals feed their babies wtih milk...");
        System.out.println("Cat feed their babies wtih milk...");
    }

}
