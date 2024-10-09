package d20staticblock_instanceblock_oop;

public class InstanceBlock2 {


    public int year;

    //instance block
    {
        System.out.println("Herkese selam");
    }

    public InstanceBlock2() {
        //Buradaki sout'u silip instance block icine aldik
    }

    public InstanceBlock2(int year) {
        //Buradaki sout'u silip instance block icine aldik
        this.year = year;
    }
}
