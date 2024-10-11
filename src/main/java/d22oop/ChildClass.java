package d22oop;

public class ChildClass extends ParentClass {
   /* @Override
    public Integer multiply(Integer a, Integer b) {
        //return super.multiply(a, b);
        // Parent class 'ın multiply methodunu cagırdık
        Integer sonuc = super.multiply(a, b);//20

        //Ek islevsellik katalım
        return  sonuc + 10;//20+10=30
        //Parent method degismez parent de orijinali duruyor

    }

    */

    @Override
    public Integer multiply(Integer a, Integer b) {
        Integer sonuc = super.multiply(a, b);
    return sonuc + 10;
    }
    @Override
    public Integer multiply1(Integer a, Integer b) {
        Integer sonuc1 = this.multiply(a, b);
    return sonuc1 + 10;
    }
}
