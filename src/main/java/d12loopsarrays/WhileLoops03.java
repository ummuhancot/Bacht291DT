package d12loopsarrays;

public class WhileLoops03 {
    public static void main(String[] args) {

        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        //Example 1: Write the code to check if a given integer is a palindrome.

        // Palindrome: 121 <==> 121        123321 <==> 123321

        // tersten okunuşu aynı olan sayılara değişkenlere denir--palindrome--

        int k = 313;

        String original = String.valueOf(k);//tırnaklı hale geldi "313"
        String reversed= "";// ters çevrilmiş olanı bunun içinde saklayacağız

        //ters çevirmelerde son index den başlanır

        int index = original.length()-1; // son index her zaman length -1 in içinde burda son index i aldık

        while (index >= 0){
            reversed = reversed + original.charAt(index); //2 getirdi//neden index yaptım dinamik bir şey yazdık sayı yazmadık
            index--;
        }
        System.out.println(reversed); //213

        if (original.equals(reversed)){
            System.out.println("palindromdur");
        } else {
            System.out.println("Palinduram değildir");
        }




    }
}
