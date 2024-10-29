package d32lambda;

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

    public String getSeason() {
        return season;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getAvarageScore() {
        return avarageScore;
    }

    public int getNumberOfSudents() {
        return numberOfSudents;
    }

    //4) setter’lar -Private değişkenleri değiştirmek için

    public void setSeason(String season) {
        this.season = season;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setAvarageScore(int avarageScore) {
        this.avarageScore = avarageScore;
    }

    public void setNumberOfSudents(int numberOfSudents) {
        this.numberOfSudents = numberOfSudents;
    }


    //5) toString() methodu -Objenin içeriğini okunabilir bir formatta döndürmek için-


    @Override
    public String toString() {
        return "Course{" +
                "season='" + season + '\'' +
                ", courseName='" + courseName + '\'' +
                ", numberOfSudents=" + numberOfSudents +
                ", avarageScore=" + avarageScore +
                '}';
    }





}
