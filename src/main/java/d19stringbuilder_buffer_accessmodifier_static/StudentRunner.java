package d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {

        //Student Class ta bir instance olusturalım
        Student ali = new Student();

        System.out.println(ali.stdName);//Ali Can
        System.out.println(ali.email);//alican@gmail.com
        System.out.println(ali.address);//Istanbul
        //tcKimlik'e baska class'tan ulasilmaz cunku private


        //veri sızmasını bununla yazdırdık
        System.out.println(ali);//Student{stdName='Ali Can', address='Istanbul', email='alican@gmail.com', tcKimlik=' 1234567891'}








    }
}
