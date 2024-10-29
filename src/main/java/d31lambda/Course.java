package d31lambda;

public class Course {

    //Senaryo: Lambdayi object'lerle kullanmayi ogrenelim.
    // Class icerisinde pasif ve aktif ozellikler olusturalim.
    //Scenario: Let's learn how to use Lambda with objects.
    // Let's create passive and active properties within the class

    /*
        Icinde
        1) private variable'lar (kapsulleme-encapsulation)
        2) parametreli ve parametresiz constructor'lar
        3) getter'lar -Private değişkenlere erişim sağlamak için-
        4) setter'lar -Private değişkenleri değiştirmek için-
        5) toString() methodu -Objenin içeriğini okunabilir bir formatta döndürmek için-
        barindiran classlara POJO class denir

        POJO==>Plain Old Java Object -Düz Eski Java Nesnesi

        Birçok uygulamada, veriyi bir katmandan diğerine taşımak için POJO sınıfları kullanılır. (API)
    */

    //1) private variable'lar (kapsulleme-encapsulation)
    private String season;
    private String courseName;
    private int avarageScore;
    private int numberOfSudents;

    // 2) parametreli ve parametresiz constructor’lar


    public Course(String season, String courseName, int avarageScore, int numberOfSudents) {
        this.season = season;
        this.courseName = courseName;
        this.avarageScore = avarageScore;
        this.numberOfSudents = numberOfSudents;
    }

    public Course() {
    }

    //3) getter'lar -Private değişkenlere erişim sağlamak için-
}
