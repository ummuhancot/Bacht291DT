package d19stringbuilder_buffer_accessmodifier_static;

public class Student2Runner {
    public static void main(String[] args) {

        System.out.println("Student2.stdName = " + Student2.stdName);//Student2.stdName = Ali Can
        
        //Student2.age -->yok nasıl görcem obje oluşturmam lazım non static çünkü
        Student2 ali = new Student2();
        System.out.println("ali.age = " + ali.age);//ali.age = 18

        Student2.staticMethod();//Ben static bir methodum
        ali.nonstaticMethod();//Ben non static bir methodum


        //herkes icin ortak olması gereken yerlerde static kullanılır. staticler classlarındır istediniz şekilde olulşturulur
        //non static önceden bizden veri bekleyenler non staticktir.

        /*String s = "Java kolaydır";
        s.substring(0,3);*/






    }
}
