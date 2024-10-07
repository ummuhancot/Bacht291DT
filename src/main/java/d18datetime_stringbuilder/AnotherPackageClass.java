package d18datetime_stringbuilder;

import d19stringbuilder_buffer_accessmodifier_static.Student;

public class AnotherPackageClass {
    public static void main(String[] args) {


        Student veli = new Student();
        System.out.println(veli.stdName);//Ali Can
        //System.out.println(veli.adresi); akrakbalık kurmadımız için ulaşamadık
        //System.out.println(veli.email);defaulda ulaşamayız

        //to string metodu buradada olaştı
        System.out.println(veli);//Student{stdName='Ali Can', address='Istanbul', email='alican@gmail.com', tcKimlik=' 1234567891'}







    }
}
