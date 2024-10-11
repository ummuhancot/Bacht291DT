package d22oop;

public class StudentRunner {
    public static void main(String[] args) {

        Student s = new Student();
        //s.age calışmıyor
        System.out.println("s.name = " + s.name);//Ali Can

        System.out.println("s.getAge() = " + s.getAge());//13
        /*public int getAge() {
        return age;
        }*/ //ile ulaştı
        System.out.println("s.isSuccessful() = " + s.isSuccessful());//true

        s.setAge(25);
        System.out.println("s.getAge() = " + s.getAge());//25

        s.setSuccessful(false);
        System.out.println("s.isSuccessful() = " + s.isSuccessful());//false




    }
}
