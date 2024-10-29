package d28exception_enum;

public class ExceptionRunner {
    public static void main(String[] args) {

        studentGrade(-45);
        //---------ben yaptım
        studentGrade1("Sümeyye");
    } //main disi

    public static void studentGrade(int not) {
        //System.out.println(not);
        if (not < 0 || not > 100) {

           // throw new InvalidStudentGradeException("ogrenci notu sifirdan kucuk veya yuzden buyuk girilemez");

            try {
                throw new InvalidStudentGradeException("ogrenci notu sifirdan kucuk veya yuzden buyuk girilemez");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();//çalışmayı durdurmaz bilgi uyarı bilgisini verir. hatanın ayrıntılarını gösterir
            }

        } else {
            System.out.println(not);
        }


    }

    //--------ben yaptım
    public static void studentGrade1(String isim) {
        System.out.println(isim);
    }

}