package d27exceptions;

public class E04 {
    public static void main(String[] args) {

        //4) ArrayIndexOutOfBoundsException: Bir dizi elemanına erişilmeye çalışıldığında,
        // dizi boyutunu aşan bir indeks kullanıldığında meydana gelir.

        String[] arr = {"j", "a", "v", "a"};
        //getElementFromArray(arr, 1);//a
        //getElementFromArray(arr, 5);//ArrayIndexOutOfBoundsException//array sınırları dışında ki arreyi cağırdımızda gelir
        getElementFromArray(arr, 5);//Index numaraıs 3 den büyük olamaz



    }//main dışı

    public static void getElementFromArray(String[] s, int idx){
        //String el = s[idx];
        //System.out.println(el);
        try {
            String el = s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index numaraıs " + (s.length - 1) + " den büyük olamaz");//Index numaraıs 3 den büyük olamaz

        }
    }

}
