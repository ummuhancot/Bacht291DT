package d21oop;

import d20staticblock_instanceblock_oop.Dog;

public class AnimalRunner {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark();//dogs bark...
        d.feedWithMilk();//Mamals feed their babies qith milk...
        d.drink();//Animal dirink...

        Bird b = new Bird();
        b.tweet();// Birds tweet...
        b.drink();//Animals drink . . .
        b.eat();//Animals eat . . .

        Cat c = new Cat();
        c.feedWithMilk();//Cat feed their babies qith milk...




    }
}
