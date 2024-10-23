package d28exception_enum;

public class ExceptionRunner {
    public static void main(String[] args) {

        studentGrade(-45);

    } //main disi

    public static void studentGrade(int not) {
        //System.out.println(not);
        if (not < 0 || not > 100) {

            try {
                throw new InvalidStudentGradeException("ogrenci notu sifirdan kucuk veya yuzden buyuk girilemez");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();//çalışmayı durdurmaz bilgi uyarı bilgisini verir. hatanın ayrıntılarını gösterir
            }

        } else {
            System.out.println(not);
        }


    }

}